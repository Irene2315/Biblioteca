package clases;

public class Menu {
	
	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	public static final int GESTIONAR_PRESTAMOS = 3;
	
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int MODIFICAR_LIBRO = 2;
	public static final int ELIMINAR_LIBRO = 3;
	public static final int VER_LIBROS = 4;
	public static final int SALIR = 0;
	
	public static final int INSERTAR_SOCIO = 1;
	public static final int ELIMINAR_SOCIO = 2;
	public static final int VER_SOCIOS = 3;
	


	
	

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
		System.out.println("");
		System.out.println("MENU LIBROS");
		System.out.println("------------");
		System.out.println("1. Insertar libro");
		System.out.println("2. Modificar libro");
		System.out.println("3. Eliminar libro");
		System.out.println("4. Ver libros");
		System.out.println("0. SALIR");
		System.out.println("");
		
	}
	
	public static void mostrarMenuSocios() {
		System.out.println("");
		System.out.println("MENU SOCIOS");
		System.out.println("-----------");
		System.out.println("1. Ver socios");
		System.out.println("0. SALIR");
		System.out.println("");
	}
	
	public static void mostrarMenuPrestamos() {
		System.out.println("");
		System.out.println("MENU PRESTAMOS");
		System.out.println("--------------");
		System.out.println("1. Realizar prestamo");
		System.out.println("0. SALIR");
		System.out.println("");
	}
}
