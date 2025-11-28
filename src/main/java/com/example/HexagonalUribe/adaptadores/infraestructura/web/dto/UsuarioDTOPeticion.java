package com.example.HexagonalUribe.adaptadores.infraestructura.web.dto;

import com.example.HexagonalUribe.aplicacion.dominio.enums.TipoDocumento;

public class UsuarioDTOPeticion {
    private String nombres;
    private String correo;
    private TipoDocumento tipoDocumento;

    public UsuarioDTOPeticion() {
    }

    public UsuarioDTOPeticion(String nombres, String correo, TipoDocumento tipoDocumento) {
        this.nombres = nombres;
        this.correo = correo;
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
