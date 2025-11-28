package com.example.HexagonalUribe.aplicacion.dominio.servicios;

import com.example.HexagonalUribe.aplicacion.dominio.modelos.Usuario;
import com.example.HexagonalUribe.puertos.entrada.IUsuarioPuertoEntrada;
import com.example.HexagonalUribe.puertos.salida.IUsuarioPuertoSalida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio implements IUsuarioPuertoEntrada {

    @Autowired
    IUsuarioPuertoSalida puertoSalida;

    @Override
    public Usuario guardar(Usuario datos) {
        Usuario usuarioQueGuarde=puertoSalida.guardar(datos);
        return usuarioQueGuarde;
    }

    @Override
    public List<Usuario> listar() {
        return puertoSalida.listar();
    }
}
