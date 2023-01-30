package clases;

public class Menu {
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int VER_LIBROS = 3;
	public static final int SALIR = 0; 

	public static void mostrarMenuPrincipal() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("--------------");
		System.out.println("1. Gestionar Libros");
		System.out.println("2. Gestionar Socios");
		System.out.println("3. Gestionar Prestamos");
		System.out.println("0. SALIR");
		System.out.println("");
	}
	
	public static void mostrarMenuLibros() {
		System.out.println("MENU LIBROS");
		System.out.println("------------");
		System.out.println("1. Isertar libro");
		System.out.println("2. Eliminar libro");
		System.out.println("3. Ver libros");
		System.out.println("0. SALIR");
		System.out.println("");
		
	}
	
	public static void mostrarMenuSocios() {
		System.out.println("MENU SOCIOS");
		System.out.println("-----------");
		System.out.println("1. Ver socios");
		System.out.println("0. SALIR");
		System.out.println("");
	}
	
	public static void mostrarMenuPrestamos() {
		System.out.println("MENU PRESTAMOS");
		System.out.println("--------------");
		System.out.println("1. Realizar prestamo");
		System.out.println("0. SALIR");
		System.out.println("");
	}
}
