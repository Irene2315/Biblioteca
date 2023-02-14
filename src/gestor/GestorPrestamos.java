package gestor;

import java.sql.SQLException;
import java.util.ArrayList;
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
		int idSocio;
		ArrayList<Prestamo> prestamos= new ArrayList <Prestamo>();
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
				
				
				gestorBBDD.conectar();
				prestamos=gestorBBDD.getPrestamosNoDebueltos();
				Visor.mostrarPrestamos(prestamos);
				gestorBBDD.cerrar();
				
				break;
			case Menu.CONSULTAR_PRESTAMOS_SOCIO:
				idSocio = FormulariosDeDatos.pedirIdSocio(scan);
				gestorBBDD.conectar();
				prestamos=gestorBBDD.getSocioPrestamos(idSocio);
				Visor.mostrarPrestamos(prestamos);
				gestorBBDD.cerrar();
				
				
				
				break;
			case Menu.CONSULTAR_DISPONIBILIDAD_DE_LIBRO:

				idLibro= FormulariosDeDatos.pedirIdLibro(scan);
				gestorBBDD.conectar();
				prestamo=gestorBBDD.disponibilidadLibro(idLibro);
				Visor.mostrarPrestamo(prestamo);
				gestorBBDD.cerrar();
				
				break;
			case Menu.SALIR:
				break;
			}
			System.out.println("");
		} while (opcion != Menu.SALIR);
		


	}

}
