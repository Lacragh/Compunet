package co.edu.icesi.viajes.icesiviajes.domain;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tipo_destino")
public class TipoDestino {

    @Id
    @Column(name = "id_tide", nullable = false)
    private Integer idTide;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "nombre", nullable = false, length = 100, unique = true)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 300)
    private String descripcion;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "usu_creador", nullable = false)
    private String usuCreador;

    @Column(name = "usu_modificador")
    private String usuModificador;

    @Column(name = "estado", nullable = false, length = 1)
    private String estado;

    public TipoDestino(Integer idTide, String codigo, String nombre, String descripcion, Date fechaCreacion, Date fechaModificacion, String usuCreador, String usuModificador, String estado) {
        this.idTide = idTide;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuCreador = usuCreador;
        this.usuModificador = usuModificador;
        this.estado = estado;
    }

    public TipoDestino() {

    }
}
