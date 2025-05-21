package umg.edu.gt.prograIII.dataBase.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "turno")
public class TurnoModel implements Comparable<TurnoModel> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @Column(name = "dpi_cliente")
    private String dpiCliente;

    @Column(name = "tipo_servicio")
    private String tipoServicio;

    private String estado;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    public TurnoModel() {
    }

    @PrePersist
    public void prePersist() {
        if (fechaCreacion == null) {
            fechaCreacion = new Date();
        }
    }

    // Getters y setters...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDpiCliente() {
        return dpiCliente;
    }

    public void setDpiCliente(String dpiCliente) {
        this.dpiCliente = dpiCliente;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int compareTo(TurnoModel otro) {
        if (this.fechaCreacion == null && otro.fechaCreacion == null) return 0;
        if (this.fechaCreacion == null) return -1;
        if (otro.fechaCreacion == null) return 1;
        return this.fechaCreacion.compareTo(otro.fechaCreacion);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TurnoModel)) return false;
        TurnoModel that = (TurnoModel) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "TurnoModel{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", dpiCliente='" + dpiCliente + '\'' +
                ", tipoServicio='" + tipoServicio + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
