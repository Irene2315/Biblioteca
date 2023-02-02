package gestor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import clases.FormulariosDeDatos;
import clases.Menu;
import clases.Socio;
import clases.Visor;

public class GestorSocios {
public static void run(Scanner scan) throws SQLException {
		
		int opcion;
		GestorBBDD gestorBBDD = new GestorBBDD();
		Socio socio= new Socio();
		int id;
		ArrayList <Socio> socios = new ArrayList <Socio>();

		do {
			Menu.mostrarMenuSocios();
			opcion = scan.nextInt();

			switch (opcion) {
			case Menu.INSERTAR_SOCIO:
				
				socio = FormulariosDeDatos.pedirDatosSocio(scan);
				gestorBBDD.conectar();
				gestorBBDD.insertarSocio(socio);
				gestorBBDD.cerrar();
				
				break;
				
			case Menu.MODIFICAR_SOCIO:
				
				id= FormulariosDeDatos.pedirIdSocio(scan);
				gestorBBDD.conectar();
				socio =gestorBBDD.getSocio(id);
				socio = FormulariosDeDatos.modificarDatosSocio(socio, scan);
				gestorBBDD.modificarSocio(socio);
				gestorBBDD.cerrar();
				
				break;	

			case Menu.ELIMINAR_SOCIO:
				
				id = FormulariosDeDatos.pedirIdSocio(scan);
				gestorBBDD.conectar();
				gestorBBDD.eliminarSocio(id);
				gestorBBDD.cerrar();
				
				break;
				
			case Menu.VER_SOCIOS:
				
				gestorBBDD.conectar();
				socios = gestorBBDD.getSocios();
				Visor.mostrarSocios(socios);
				gestorBBDD.cerrar();
				
				break;
			
			case Menu.SALIR:

			}
			System.out.println("");
		} while (opcion != Menu.SALIR);
		

	}
}
