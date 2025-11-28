package com.example.HexagonalUribe.adaptadores.infraestructura.persistencia.entidades;

import com.example.HexagonalUribe.aplicacion.dominio.enums.TipoDocumento;
import jakarta.persistence.*;

@Entity
@Table (name = "usuarios")
public class UsuarioEntidad {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", unique = false, nullable = false, length = 50 )
    private String nombres;
    @Column(name = "tipo_documento", unique = true, nullable = false, length = 50 )
    private TipoDocumento tipoDocumento;
    @Column(name = "correo", unique = true, nullable = false, length = 80 )
    private String correo;

    public UsuarioEntidad() {
    }

    public UsuarioEntidad(Integer id, String nombres, TipoDocumento tipoDocumento, String correo) {
        this.id = id;
        this.nombres = nombres;
        this.tipoDocumento = tipoDocumento;
        this.correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
