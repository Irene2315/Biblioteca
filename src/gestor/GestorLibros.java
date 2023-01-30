package gestor;

import java.util.Scanner;

import clases.Menu;

public class GestorLibros {

	static void run(Scanner scan) {

		
		int opcion;

		do {
			Menu.mostrarMenuLibros();
			opcion = scan.nextInt();

			switch (opcion) {
			case Menu.INSERTAR_LIBRO:
				System.out.println("Primera opcion selecionada");

				break;
			case Menu.ELIMINAR_LIBRO:
				System.out.println("Segunda opcion selecionada");
				break;
				
			case Menu.VER_LIBROS:
				System.out.println("Tercera opcion selecinada ");
				break;
			
			case Menu.SALIR:

			}
			System.out.println("");
		} while (opcion != Menu.SALIR);
		

	}

}
