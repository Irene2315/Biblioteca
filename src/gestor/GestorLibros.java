package gestor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import clases.FormulariosDeDatos;
import clases.Libro;
import clases.Menu;
import clases.Visor;

public class GestorLibros {

	public static void run(Scanner scan) throws SQLException {

		
		int opcion;
		 GestorBBDD gestorBBDD = new  GestorBBDD();
		 Libro libro = new Libro();
		 //uso en las opcion
		 int id;
		 ArrayList<Libro> libros= new ArrayList <Libro>();
		 
		do {
			Menu.mostrarMenuLibros();
			opcion = scan.nextInt();

			switch (opcion) {
			case Menu.INSERTAR_LIBRO:
				
				 libro = FormulariosDeDatos.pedirDatosLibro(scan);
				 gestorBBDD.conectar();
				 gestorBBDD.insertarLibro(libro);
				 Visor.mostrarLibro(libro);
				 gestorBBDD.cerrar();
				 
				break;
			case Menu.MODIFICAR_LIBRO:
				
				id= FormulariosDeDatos.pedirIdLibro(scan);
				gestorBBDD.conectar();
				
				libro = gestorBBDD.getLibro(id);
				Visor.mostrarLibro(libro);
				libro = FormulariosDeDatos.modificarDatosLibro(libro, scan);
				gestorBBDD.modificarLibro(libro);
				Visor.mostrarLibro(libro);
				
				gestorBBDD.cerrar();
				
				break;
				
			case Menu.ELIMINAR_LIBRO:
				
				
				id=FormulariosDeDatos.pedirIdLibro(scan);
				gestorBBDD.conectar();
				
				libro = gestorBBDD.getLibro(id);
				Visor.mostrarLibro(libro);
				gestorBBDD.eliminarLibro(id);
				
				gestorBBDD.cerrar();
				
				
				
				break;
				
			case Menu.VER_LIBROS:
				
				
				gestorBBDD.conectar();
				libros=gestorBBDD.getLibros();
				Visor.mostrarLibros(libros);
				gestorBBDD.cerrar();

				
				
				
				break;
			
			case Menu.SALIR:

			}
			System.out.println("");
		} while (opcion != Menu.SALIR);
		

	}

}
