package umg.edu.gt.prograIII.dataBase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umg.edu.gt.prograIII.dataBase.model.TurnoModel;

@Repository
public interface TurnosRepository extends JpaRepository<TurnoModel, Long> {

}
