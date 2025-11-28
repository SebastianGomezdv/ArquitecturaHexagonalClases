package com.example.HexagonalUribe.puertos.entrada;

import com.example.HexagonalUribe.aplicacion.dominio.modelos.Usuario;

import java.util.List;

public interface IUsuarioPuertoEntrada {

    Usuario guardar(Usuario datos);
    List<Usuario> listar();
}
