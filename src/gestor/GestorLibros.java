package gestor;

import java.sql.SQLException;
import java.util.Scanner;

import clases.FormulariosDeDatos;
import clases.Libro;
import clases.Menu;

public class GestorLibros {

	public static void run(Scanner scan) throws SQLException {

		
		int opcion;
		 GestorBBDD gestorBBDD = new  GestorBBDD();
		 Libro libro = new Libro();
		 
		do {
			Menu.mostrarMenuLibros();
			opcion = scan.nextInt();

			switch (opcion) {
			case Menu.INSERTAR_LIBRO:
				
				 libro = FormulariosDeDatos.pedirDatosLibro(scan);
				 gestorBBDD.conectar();
				 gestorBBDD.insertarLibro(libro);
				 gestorBBDD.cerrar();
				 
				break;
			case Menu.MODIFICAR_LIBRO:
				
				libro = FormulariosDeDatos.modificarDatosLibro(libro, scan);
				gestorBBDD.conectar();
				
				break;
				
			case Menu.ELIMINAR_LIBRO:
				
				
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
