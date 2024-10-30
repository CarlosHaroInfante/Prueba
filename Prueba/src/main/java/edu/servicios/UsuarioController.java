package edu.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.Dtos.usuarioDTO;

@RestController
@RequestMapping("/api/clubes")
public class UsuarioController {

    private List<usuarioDTO> clubes = new ArrayList<>();

    @PostMapping("/")
    public ResponseEntity<usuarioDTO> nuevoClub(@RequestBody usuarioDTO club) {
        // Validación de unicidad
        for (usuarioDTO existente : clubes) {
            if (existente.getNombre().equals(club.getNombre())) {
                return ResponseEntity.status(HttpStatus.CONFLICT).body(null); // 409 Conflict
            }
            if (existente.getCorreo_electronico().equals(club.getCorreo_electronico())) {
                return ResponseEntity.status(HttpStatus.CONFLICT).body(null); // 409 Conflict
            }
        }

        // Asigna un ID único
        club.setId(clubes.size() + 1);
        clubes.add(club); // Agrega el nuevo club

        // Devuelve el club creado
        return ResponseEntity.status(HttpStatus.CREATED).body(club); // 201 Created
    }

    // Método para obtener todos los clubes (opcional)
    @GetMapping("/")
    public List<usuarioDTO> obtenerClubes() {
        return clubes;
    }
}



/*package edu.servicios;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.Dtos.usuarioDTO;

import edu.Dtos.usuarioDTO;

@RestController
public class UsuarioController {
    Scanner sc = new Scanner(System.in);

    @GetMapping("/api/clubes/")
    public usuarioDTO nuevoClub() {
        usuarioDTO club = new usuarioDTO();
        club.setId(1); // Podrías querer implementar una lógica para generar IDs únicos

        System.out.println("Nombre del club");
        club.setNombre(sc.nextLine());

        System.out.println("Correo electrónico del club");
        club.setCorreo_electronico(sc.nextLine());

        System.out.println("País del club");
        club.setPais(sc.nextLine());

        System.out.println("Localidad del club");
        club.setLocalidad(sc.nextLine());

        System.out.println("Sede del club");
        club.setSede_principal(sc.nextLine());

        System.out.println("Contraseña del club");
        club.setContraseña(sc.nextLine()); // Considera cómo manejar esta información

        return club; // Jackson convierte automáticamente el objeto a JSON
    }
}
 
  * package edu.Dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class usuarioDTO {
    private int id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @Email(message = "El correo electrónico debe ser válido")
    private String correo_electronico;

    private String pais;
    private String localidad;
    private String sede_principal;

    @NotBlank(message = "La contraseña es obligatoria")
    private String contraseña;

    // Getters y Setters
}
*/