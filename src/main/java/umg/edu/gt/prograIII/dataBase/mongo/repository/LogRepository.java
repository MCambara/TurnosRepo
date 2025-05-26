package umg.edu.gt.prograIII.dataBase.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import umg.edu.gt.prograIII.dataBase.mongo.model.LogModel;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends MongoRepository<LogModel, String> {
}
