package com.example.HexagonalUribe.adaptadores.infraestructura.web.dto;

public class UsuarioDTORespuesta {
    private String nombres;
    private String correo;

    public UsuarioDTORespuesta() {
    }

    public UsuarioDTORespuesta(String nombres, String correo) {
        this.nombres = nombres;
        this.correo = correo;
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
}
