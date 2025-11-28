package com.example.HexagonalUribe.puertos.salida;

import com.example.HexagonalUribe.aplicacion.dominio.modelos.Usuario;

import java.util.List;

public interface IUsuarioPuertoSalida {

    Usuario guardar(Usuario datos);
    List<Usuario> listar();

}
