package com.example.HexagonalUribe.adaptadores.infraestructura.web.mapas;

import com.example.HexagonalUribe.adaptadores.infraestructura.web.dto.UsuarioDTOPeticion;
import com.example.HexagonalUribe.adaptadores.infraestructura.web.dto.UsuarioDTORespuesta;
import com.example.HexagonalUribe.aplicacion.dominio.modelos.Usuario;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IUsuarioMapa {

    Usuario toDTOModel(UsuarioDTOPeticion datos);
    Usuario toModelDTO(Usuario datos);
    List<UsuarioDTORespuesta>toListDTO(List<Usuario>datos);
}
