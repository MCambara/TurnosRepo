package umg.edu.gt.prograIII.dataBase.mongo.service;

import org.springframework.stereotype.Service;
import umg.edu.gt.prograIII.dataBase.mongo.model.LogModel;
import umg.edu.gt.prograIII.dataBase.mongo.repository.LogRepository;

import java.util.List;

@Service
public class LogService {

    private final LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public LogModel guardarLog(String mensaje) {
        LogModel log = new LogModel(mensaje);
        return logRepository.save(log);
    }

    public List<LogModel> obtenerTodos() {
        return logRepository.findAll();
    }
}
