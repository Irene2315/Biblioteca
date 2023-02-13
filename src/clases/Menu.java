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
	
	public static final int REALIZAR_PRESTAMO = 1;
	public static final int DEVOLVER_LIBRO = 2;
	public static final int COSULTAR_PRESTAMOS_NO_DEVUELTOS = 3;
	public static final int CONSULTAR_PRESTAMOS_SOCIO = 4;
	public static final int CONSULTAR_DISPONIBILIDAD_DE_LIBRO = 5;
	


	
	

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
		System.out.println(REALIZAR_PRESTAMO+ ". Realizar prestamo");
		System.out.println(DEVOLVER_LIBRO+". Devolver libro");
		System.out.println(COSULTAR_PRESTAMOS_NO_DEVUELTOS+ " .Consultar prestamos no devueltos");
		System.out.println(CONSULTAR_PRESTAMOS_SOCIO+ ".consultar prestamos de un socio");
		System.out.println(CONSULTAR_DISPONIBILIDAD_DE_LIBRO+".consultar disponibilidad de un libro");
		System.out.println("0. SALIR");
		System.out.println("");
	}
}
