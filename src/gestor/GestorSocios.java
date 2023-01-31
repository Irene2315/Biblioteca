package gestor;

import java.util.Scanner;


import clases.Menu;
import clases.Socio;

public class GestorSocios {
public static void run(Scanner scan) {
		Socio socio= new Socio();
		GestorBBDD gestorBBDD = new GestorBBDD();
		int opcion;

		do {
			Menu.mostrarMenuLibros();
			opcion = scan.nextInt();

			switch (opcion) {
			case Menu.INSERTAR_SOCIO:
				
				
				System.out.println("Primera opcion selecionada");

				break;
			case Menu.ELIMINAR_SOCIO:
				
				break;
				
			case Menu.VER_SOCIOS:
				System.out.println("Tercera opcion selecinada ");
				break;
			
			case Menu.SALIR:

			}
			System.out.println("");
		} while (opcion != Menu.SALIR);
		

	}
}
