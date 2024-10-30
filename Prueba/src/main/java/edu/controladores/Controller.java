package edu.controladores;

import edu.Dtos.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class Controller {

    /*@GetMapping
    public List<usuarioDTO> getAllUsers() {
        List<usuarioDTO> ususario = new ArrayList<>();
        
        usuarioDTO user1 = new usuarioDTO();
        user1.setId(1L);
        user1.setNombre("Juan Pérez");
        user1.setEmail("juan.perez@example.com");
        
        usuarioDTO user2 = new usuarioDTO();
        user2.setId(2L);
        user2.setNombre("Ana Gómez");
        user2.setEmail("ana.gomez@example.com");
        
        users.add(user1);
        users.add(user2);
        
        return users; // Spring convierte automáticamente a JSON
    }

    @PostMapping
    public usuarioDTO createUser (@RequestBody usuarioDTO userDTO) {
        // Aquí podrías guardar el usuario en la base de datos
        return userDTO; // Retornar el usuario creado
    }*/
}
