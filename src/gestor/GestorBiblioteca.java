package gestor;

import java.sql.SQLException;
import java.util.Scanner;

import clases.Menu;

public class GestorBiblioteca {
	
	static Scanner scan = new Scanner (System.in);

	public static void run() throws SQLException {
		int opcion;

		do {
			Menu.mostrarMenuPrincipal();
			
			opcion= scan.nextInt();

			switch (opcion) {
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(scan);

				break;
			case Menu.GESTIONAR_SOCIOS:
				GestorSocios.run(scan);

				break;
			case Menu.GESTIONAR_PRESTAMOS:
				System.out.println("modulo no disponible");
				break;
			
			case Menu.SALIR:

			}
			System.out.println("");
		} while (opcion != Menu.SALIR);
		scan.close();
		
	}

	

}
