package clases;



import java.util.Scanner;



public class FormulariosDeDatos {
	

	
	public static Libro pedirDatosLibro(Scanner scan) {
		Libro libro = new Libro();
		String titulo;
		String autor;
		int numPag;
		
		System.out.println("Introduce el titulo del libro");
		titulo= scan.nextLine();
		
		
		System.out.println("Introduce el autor del libro");
		autor= scan.nextLine();
		
		
		System.out.println("Introduce el número de páginas del libro");
		numPag=scan.nextInt();
		
		libro.setTitulo(titulo);
		libro.setAutor(autor);
		libro.setNum_pag(numPag);
		
		return libro;
		
	}
	
	public static Libro modificarDatosLibro (Libro libro,Scanner scan) {
		String nueboTitulo;
		String nueboAutor;
		int nueboNumPag;
		
		System.out.println("Introduce el titulo del libro");
		nueboTitulo= scan.nextLine();
		
		
		System.out.println("Introduce el autor del libro");
		nueboAutor= scan.nextLine();
		
		
		System.out.println("Introduce el número de páginas del libro");
		nueboNumPag=scan.nextInt();
		
		libro.setTitulo(nueboTitulo);
		libro.setAutor(nueboAutor);
		libro.setNum_pag(nueboNumPag);
		
		return libro;
	}
	
	static int pedriIdLibro (Scanner scan) {
		int id;
		System.out.println("Introduce la ID del libro");
		id= scan.nextInt();
		
		return id;
	}




}
