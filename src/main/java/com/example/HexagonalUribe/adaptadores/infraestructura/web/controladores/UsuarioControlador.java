package com.example.HexagonalUribe.adaptadores.infraestructura.web.controladores;

import com.example.HexagonalUribe.adaptadores.infraestructura.web.dto.UsuarioDTOPeticion;
import com.example.HexagonalUribe.adaptadores.infraestructura.web.dto.UsuarioDTORespuesta;
import com.example.HexagonalUribe.adaptadores.infraestructura.web.mapas.IUsuarioMapa;
import com.example.HexagonalUribe.aplicacion.dominio.modelos.Usuario;
import com.example.HexagonalUribe.puertos.salida.IUsuarioPuertoSalida;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/usuarios")
@Tag(name="Servicios para realizar transacciones con la entidad usuario")
public class UsuarioControlador {

    //LLamo al Servicio
    @Autowired
    IUsuarioPuertoSalida serviciosOfrecidos;

    //Llamo al Mapa
    @Autowired
    IUsuarioMapa mapa;

    public ResponseEntity<Usuario> guardar(@RequestBody UsuarioDTOPeticion datos){
        //Convertir Los Datos DTO Que Llegan En Modelo
        Usuario usuario=mapa.toDTOModel(datos);
        Usuario usuarioQueGuarde=serviciosOfrecidos.guardar(usuario);

        Usuario respuesta=mapa.toModelDTO(usuarioQueGuarde);
        return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
    }

    public ResponseEntity<List<UsuarioDTORespuesta>>listar(){
        List<Usuario> usuariosConsultados=serviciosOfrecidos.listar();
        List<UsuarioDTORespuesta> respuesta = mapa.toListDTO(usuariosConsultados);
        return ResponseEntity.status(HttpStatus.OK).body(respuesta);
    }
}
