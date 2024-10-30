package edu.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	public byte opcion() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Menú");
		System.out.println("------------------");
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Alta de club");
		System.out.println("[2] - Baja de club");
		System.out.println("[3] - Mostrar clubes");
		System.out.println("------------------");
		
		byte opcionUsuario = scanner.nextByte();
		
		return opcionUsuario;
		
	}
}
