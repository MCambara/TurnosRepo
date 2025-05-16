package umg.edu.gt.prograIII.dataBase.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umg.edu.gt.prograIII.dataBase.model.TurnoModel;
import umg.edu.gt.prograIII.dataBase.repository.TurnosRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TurnosService {

    private final TurnosRepository turnosRepository;

    public TurnosService(TurnosRepository turnosRepository) {
        this.turnosRepository = turnosRepository;
    }

    public List<TurnoModel> obtenerTodos() {
        return turnosRepository.findAll();
    }

    public Optional<TurnoModel> obtenerPorId(Long id) {
        return turnosRepository.findById(id);
    }

    public TurnoModel guardar(TurnoModel turno) {
        return turnosRepository.save(turno);
    }

    public void eliminar(Long id) {
        turnosRepository.deleteById(id);
    }

    // Aquí puedes agregar más métodos con lógica específica según necesidades.
}
