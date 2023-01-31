package gestor;

import java.util.Scanner;

import clases.Menu;

public class GestorBiblioteca {
	
	static Scanner scan = new Scanner (System.in);

	public static void run() {
		int opcion;

		do {
			Menu.mostrarMenuPrincipal();
			
			opcion= scan.nextInt();

			switch (opcion) {
			case Menu.GESTIONAR_LIBROS:
				System.out.println("Primera opcion selecionada");

				break;
			case OPCION_DOS:
				System.out.println("Segunda opcion selecionada");
				break;
			case OPCION_TRES:
				System.out.println("Tercera opcion selecinada ");
				break;
			case OPCION_CUATRO:

				System.out.println("Cuarta opcion selecionada");
				break;
			case SALIR:

			}
			System.out.println("");
		} while (opcion_menu != SALIR);
		teclado.close();
		
	}

	

}
