package gestor;

import java.sql.SQLException;
import java.util.Scanner;

import clases.FormulariosDeDatos;
import clases.Menu;
import clases.Prestamo;
import clases.Visor;

public class GestorPrestamos {

	public static void run(Scanner scan) throws SQLException {
		
		GestorBBDD gestorBBDD = new  GestorBBDD();
		Prestamo prestamo = new Prestamo();
		int idLibro;
		int opcion;

		do {
			Menu.mostrarMenuPrestamos();
			opcion = scan.nextInt();

			switch (opcion) {
			case Menu.REALIZAR_PRESTAMO:
				prestamo= FormulariosDeDatos.pedirDatosPrestamo(scan);
				gestorBBDD.conectar();
				gestorBBDD.insertarPrestamo(prestamo);
				gestorBBDD.cerrar();

				break;
			case Menu.DEVOLVER_LIBRO:
				idLibro = FormulariosDeDatos.pedirIdLibro(scan);
				gestorBBDD.conectar();
				gestorBBDD.devolverLibro(idLibro);
				gestorBBDD.cerrar();
				
				break;
				
			case Menu.COSULTAR_PRESTAMOS_NO_DEVUELTOS:
				
				idLibro =FormulariosDeDatos.pedirIdLibro(scan);
				gestorBBDD.conectar();
				prestamo=gestorBBDD.prestamoNoDevuelto(idLibro);
				Visor.motrarPrestamo(prestamo);
				gestorBBDD.cerrar();
				
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
