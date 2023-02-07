package clases;



import java.util.Date;
import java.util.Scanner;



public class FormulariosDeDatos {
	

	
	//libro


	public static Libro pedirDatosLibro(Scanner scan) {
		Libro libro = new Libro();
		String titulo;
		String autor;
		int numPag;
		scan.nextLine();
		
		System.out.println("Introduce el titulo del libro");
		titulo= scan.nextLine();
		
		
		System.out.println("Introduce el autor del libro");
		autor= scan.nextLine();
		
		
		System.out.println("Introduce el número de páginas del libro");
		numPag=scan.nextInt();
		
		libro.setTitulo(titulo);
		libro.setAutor(autor);
		libro.setNumPag(numPag);
		
		return libro;
		
	}
	
	public static Libro modificarDatosLibro (Libro libro,Scanner scan) {
		System.out.println("");
		String nuevoTitulo;
		String nuevoAutor;
		int nuevoNumPag;
		
		scan.nextLine();
		System.out.println("Introduce el nuebo titulo del libro");
		nuevoTitulo= scan.nextLine();
		
		
		System.out.println("Introduce el nuebo autor del libro");
		nuevoAutor= scan.nextLine();
		
		
		System.out.println("Introduce el nuebo número de páginas del libro");
		nuevoNumPag=scan.nextInt();
		
		libro.setTitulo(nuevoTitulo);
		libro.setAutor(nuevoAutor);
		libro.setNumPag(nuevoNumPag);
		
		return libro;
	}
	
	
	
	public static int pedirIdLibro (Scanner scan) {
		int id;
		System.out.println("Introduce la ID del libro");
		id= scan.nextInt();
		
		return id;
	}
	
	
	
	//socio

	public static Socio pedirDatosSocio(Scanner scan) {
		Socio socio = new Socio();
		String nombre;
		String apellido;
		String direccion;
		String poblacion;
		String provincia;
		String dni;
		scan.nextLine();
		
		System.out.println("Introduce el nombre");
		nombre= scan.nextLine();
		
		
		System.out.println("Introduce el apellido");
		apellido= scan.nextLine();
		
		
		System.out.println("Introduce la dirección ");
	    direccion=scan.nextLine();
	    
	    System.out.println("Introduce la poblacion");
	    poblacion=scan.nextLine();
	    
	    System.out.println("Introduce la provincia");
	    provincia=scan.nextLine();
	    
	    System.out.println("Introduce el dni");
	    dni=scan.nextLine();
	    
		socio.setNombre(nombre);
		socio.setApellido(apellido);
		socio.setDireccion(direccion);
		socio.setPoblacion(poblacion);
		socio.setProvincia(provincia);
		socio.setDni(dni);
		
		return socio;
		
	}
	
	public static Socio modificarDatosSocio (Socio socio,Scanner scan) {
		String nuevoNombre;
		String nuevoApellido;
		String nuevaDireccion;
		String nuevaPoblacion;
		String nuevaProvincia;
		String nuevoDni;
		
		scan.nextLine();
		System.out.println("Introduce el nuebo nombre del socio");
		nuevoNombre= scan.nextLine();
		
		
		System.out.println("Introduce el nuebo apellido del socio");
		nuevoApellido= scan.nextLine();
		
		
		System.out.println("Introduce la nueba dirección del socio");
		nuevaDireccion=scan.nextLine();
		
		System.out.println("Introduce la nueba poblacion ");
		nuevaPoblacion=scan.nextLine();
		
		System.out.println("Introduce la nueba provincia");
		nuevaProvincia=scan.nextLine();
		
		System.out.println("Introduce el nuebo DNI");
		nuevoDni=scan.nextLine();
		
		socio.setNombre(nuevoNombre);
		socio.setApellido(nuevoApellido);
		socio.setDireccion(nuevaDireccion);
		socio.setPoblacion(nuevaPoblacion);
		socio.setProvincia(nuevaProvincia);
		socio.setDni(nuevoDni);
		
		return socio;
	}
	
	public static int pedirIdSocio (Scanner scan) {
		int id;
		System.out.println("Introduce la ID del libro");
		id= scan.nextInt();
		
		return id;
	}
	
	public static Prestamo pedirDatosPrestamo(Scanner scan) {
		Prestamo prestamo = new Prestamo();
		int id_libro;
		int id_socio;
		Date fecha = new Date();
		boolean devuelto=false;
		
		System.out.println("Introduce la id del libro");
		id_libro= scan.nextInt();
		
		System.out.println("Introduce la id del socio");
		id_socio= scan.nextInt();
		
		prestamo.setIdLibro(id_libro);
		prestamo.setIdSocio(id_socio);
		prestamo.setFecha(fecha);
		prestamo.setDevuelto(devuelto);
		
		
		return prestamo;
			
		
	}
	
	
	
	
	


}
