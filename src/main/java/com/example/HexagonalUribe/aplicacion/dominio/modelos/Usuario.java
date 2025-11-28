package com.example.HexagonalUribe.aplicacion.dominio.modelos;

import com.example.HexagonalUribe.aplicacion.dominio.enums.TipoDocumento;

public class Usuario {
    private Integer id;
    private String nombres;
    private TipoDocumento tipoDocumento;
    private String correo;

    public Usuario() {
    }

    public Usuario(Integer id, String nombres, TipoDocumento tipoDocumento, String correo) {
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
