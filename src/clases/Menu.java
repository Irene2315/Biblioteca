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
	public static final int MODIFICAR_SOCIO =2;
	public static final int ELIMINAR_SOCIO = 3;
	public static final int VER_SOCIOS = 4;
	


	
	

	public static void mostrarMenuPrincipal() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("--------------");
		System.out.println(GESTIONAR_LIBROS + ". Gestionar Libros");
		System.out.println(GESTIONAR_SOCIOS+ ". Gestionar Socios");
		System.out.println(GESTIONAR_PRESTAMOS+ ". Gestionar Prestamos");
		System.out.println(SALIR+ ". SALIR");
		System.out.println("");
	}
	
	public static void mostrarMenuLibros() {
		System.out.println("");
		System.out.println("MENU LIBROS");
		System.out.println("------------");
		System.out.println(INSERTAR_LIBRO + ". Insertar libro");
		System.out.println(MODIFICAR_LIBRO+ ". Modificar libro");
		System.out.println(ELIMINAR_LIBRO+ ". Eliminar libro");
		System.out.println(VER_LIBROS+ ". Ver libros");
		System.out.println(SALIR+ ". SALIR");
		System.out.println("");
		
	}
	
	public static void mostrarMenuSocios() {
		System.out.println("");
		System.out.println( "MENU SOCIOS");
		System.out.println("-----------");
		System.out.println(INSERTAR_SOCIO+ ". Insertar socios");
		System.out.println(MODIFICAR_SOCIO+ ". Modificar socio");
		System.out.println(ELIMINAR_SOCIO + ". Eliminar socio");
		System.out.println(VER_SOCIOS + ". Ver socios");
		
		System.out.println(SALIR + ". SALIR");
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
