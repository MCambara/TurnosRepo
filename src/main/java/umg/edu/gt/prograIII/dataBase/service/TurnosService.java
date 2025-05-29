package umg.edu.gt.prograIII.dataBase.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umg.edu.gt.prograIII.dataBase.model.TurnoModel;
import umg.edu.gt.prograIII.dataBase.repository.TurnosRepository;
import umg.edu.gt.prograIII.list.ListaEnlazada;
import umg.edu.gt.prograIII.list.Opcion;

import java.util.ArrayList;

@Service
@Transactional
public class TurnosService {

    private final TurnosRepository turnosRepository;

    public TurnosService(TurnosRepository turnosRepository) {
        this.turnosRepository = turnosRepository;
    }

    public ListaEnlazada<TurnoModel> obtenerTodos() {
        ArrayList<TurnoModel> listaJpa = (ArrayList<TurnoModel>) turnosRepository.findAll();
        ListaEnlazada<TurnoModel> listaPersonalizada = new ListaEnlazada<>();
        for (TurnoModel turno : listaJpa) {
            listaPersonalizada.agregar(turno);
        }
        return listaPersonalizada;
    }

    public Opcion<TurnoModel> obtenerPorId(Long id) {
        TurnoModel turno = turnosRepository.findById(id).orElse(null);
        return new Opcion<>(turno);
    }

    public TurnoModel guardar(TurnoModel turno) {
        return turnosRepository.save(turno);
    }

    public void eliminar(Long id) {
        turnosRepository.deleteById(id);
    }
}
