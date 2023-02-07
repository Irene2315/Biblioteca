package gestor;

import java.sql.SQLException;
import java.util.Scanner;

import clases.Menu;

public class GestorPrestamos {

	public static void run(Scanner scan) throws SQLException {
		
		
		int opcion;

		do {
			Menu.mostrarMenuPrestamos();
			opcion = scan.nextInt();

			switch (opcion) {
			case Menu.REALIZAR_PRESTAMO:
				System.out.println("Primera opcion selecionada");

				break;
			case Menu.DEVOLVER_LIBRO:
				System.out.println("Segunda opcion selecionada");
				break;
			case Menu.COSULTAR_PRESTAMOS_NO_DEVUELTOS:
				System.out.println("Tercera opcion selecinada ");
				break;
			case Menu.CONSULTAR_PRESTAMOS_SOCIO:

				System.out.println("Cuarta opcion selecionada");
				break;
			case Menu.CONSULTAR_DISPONIBILIDAD_DE_LIBRO:

				System.out.println("Cuarta opcion selecionada");
				break;
			case Menu.SALIR:
				break;
			}
			System.out.println("");
		} while (opcion != Menu.SALIR);
		


	}

}
