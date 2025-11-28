package com.example.HexagonalUribe.adaptadores.infraestructura.persistencia.repositorios;

import com.example.HexagonalUribe.adaptadores.infraestructura.persistencia.entidades.UsuarioEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<UsuarioEntidad, Integer> {

    Optional<UsuarioEntidad> findByCorreo(String correo);
}
