package edu.controladores; // Cambia esto según tu estructura de paquetes

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.servicios.MenuImplementacion;
import edu.servicios.MenuInterfaz;
import edu.servicios.UsuarioController;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
        MenuInterfaz menu = new MenuImplementacion();
        UsuarioController Club = new UsuarioController();
        
        boolean cerrarMenu = false;
        
        while(!cerrarMenu) {
        	
        	byte opcion = menu.opcion();
        	
        	switch (opcion) {
			case 0:
				cerrarMenu = true;
				break;
			case 1:
				System.out.println("Opción alta de club");
				Club.nuevoClub(null);
				break;
			case 2:
				System.out.println("Opción baja de club");
				break;
			case 3:
				System.out.println("Opción mostrar clubes");
				break;
			default:
				break;
			}
        	
        	
        }
        
        
    }
}
