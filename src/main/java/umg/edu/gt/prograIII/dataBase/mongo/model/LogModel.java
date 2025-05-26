package umg.edu.gt.prograIII.dataBase.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "logs")
public class LogModel {

    @Id
    private String id;

    private String mensaje;

    private Date fecha;

    public LogModel() {
        this.fecha = new Date();
    }

    public LogModel(String mensaje) {
        this.mensaje = mensaje;
        this.fecha = new Date();
    }

    public String getId() {
        return id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
