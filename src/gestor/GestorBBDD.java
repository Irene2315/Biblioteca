package gestor;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import clases.Conector;
import clases.Libro;
import clases.Prestamo;
import clases.Socio;


public class GestorBBDD extends Conector  {
	PreparedStatement preparedSt;
	
	//libros
	
	public void insertarLibro(Libro libro) throws SQLException {
		
		preparedSt= con.prepareStatement("INSERT INTO `libros` "
				+ "(`id`, `titulo`, `autor`, `num_pag`) "
				+ "VALUES (?,?,?,?)");
		preparedSt.setInt(1, libro.getId());
		preparedSt.setString(2, libro.getTitulo());
		preparedSt.setString(3, libro.getAutor());
		preparedSt.setInt(4, libro.getNumPag());
		
		preparedSt.execute();
		
	}
	public void modificarLibro(Libro libro) {
		try {
			preparedSt = con.prepareStatement("UPDATE libros SET titulo= ?,autor= ?,"
					+ "num_pag= ? WHERE libros.id=?");
			preparedSt.setString(1,libro.getTitulo());
			preparedSt.setString(2,libro.getAutor());
			preparedSt.setInt(3,libro.getNumPag());
			preparedSt.setInt(4,libro.getId() );
			
			preparedSt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	public void eliminarLibro(int id) throws SQLException {
		preparedSt = con.prepareStatement("DELETE FROM libros WHERE `libros`.`id` = ?");
		preparedSt.setInt(1,id);
		preparedSt.execute();
	}
	
	public Libro getLibro(int id) {
		Libro libroSelecion = new Libro();
		try {
			preparedSt= con.prepareStatement("SELECT * FROM `libros` WHERE `id` = ?");
			preparedSt.setInt(1,id);
			
			ResultSet resultado= preparedSt.executeQuery();
			
			if(resultado.next()) {
				libroSelecion.setId(resultado.getInt("id"));
				libroSelecion.setTitulo(resultado.getString("titulo"));
				libroSelecion.setAutor(resultado.getString("autor"));
				libroSelecion.setNumPag(resultado.getInt("num_pag"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return libroSelecion;
		
		
	}
	public ArrayList <Libro>  getLibros() throws SQLException {
		preparedSt = con.prepareStatement("SELECT * FROM libros");
		ResultSet resultado= preparedSt.executeQuery();
		
		ArrayList<Libro> libros= new ArrayList <Libro>();
		Libro libro= new Libro();
		
		while(resultado.next()) {
			libro = new Libro();
			libro.setId(resultado.getInt(1));
			libro.setTitulo(resultado.getString(2));
			libro.setAutor(resultado.getString(3));
			libro.setNumPag(resultado.getInt(4));
			
			libros.add(libro);
		}
		
		return libros;
		
	}
	
	
	
	//socios
	
	public void insertarSocio(Socio socio) throws SQLException {
		preparedSt= con.prepareStatement("INSERT INTO `socios`"
				+ "(`id`, `nombre`, `apellido`, "
				+ "`direccion`, `poblacion`, `provincia`, `dni`) "
				+ "VALUES (?,?,?,?,?,?,?)");
		preparedSt.setInt(1, socio.getId());
		preparedSt.setString(2, socio.getNombre());
		preparedSt.setString(3, socio.getApellido());
		preparedSt.setString(4, socio.getDireccion());
		preparedSt.setString(5, socio.getPoblacion());
		preparedSt.setString(6, socio.getProvincia());
		preparedSt.setString(7, socio.getDni());
		
		
		preparedSt.execute();
		
	}
	
	public void modificarSocio(Socio socio) {
		try {
			
			preparedSt = con.prepareStatement("UPDATE socios SET nombre = ?, apellido = ?"
					+", direccion = ?, poblacion = ?, "
					+ "provincia = ?, dni = ? WHERE socios.id = ? ");
			
			preparedSt.setString(1,socio.getNombre());
			preparedSt.setString(2,socio.getApellido());
			preparedSt.setString(3,socio.getDireccion());
			preparedSt.setString(4,socio.getPoblacion() );
			preparedSt.setString(5,socio.getProvincia());
			preparedSt.setString(6, socio.getDni());
			preparedSt.setInt(7, socio.getId());
			
			
			preparedSt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void eliminarSocio(int id ) throws SQLException {
		preparedSt = con.prepareStatement("DELETE FROM socios WHERE `socios`.`id` = ?");
		preparedSt.setInt(1,id);
		preparedSt.execute();
	}
	
	public Socio getSocio(int id) throws SQLException {
		 Socio socioSelecion  = new Socio();
		preparedSt= con.prepareStatement("SELECT * FROM `socios` WHERE `id` = ?");
		preparedSt.setInt(1,id);
		
		ResultSet resultado= preparedSt.executeQuery();
		
		if(resultado.next()) {
			
			socioSelecion.setId(resultado.getInt("id"));
			socioSelecion.setApellido(resultado.getString("apellido"));
			socioSelecion.setDireccion(resultado.getString("direccion"));
			socioSelecion.setPoblacion(resultado.getString("poblacion"));
			socioSelecion.setProvincia(resultado.getString("provincia"));
			socioSelecion.setDni(resultado.getString("dni"));
			
		}
		
		return socioSelecion;
		
		
	}
	
	public ArrayList <Socio>  getSocios() throws SQLException {
		preparedSt = con.prepareStatement("SELECT * FROM socios");
		ResultSet resultado= preparedSt.executeQuery();
		
		ArrayList<Socio> socios= new ArrayList <Socio>();
		Socio socio= new Socio();
		
		while(resultado.next()) {
			socio = new Socio();
			socio.setId(resultado.getInt(1));
			socio.setNombre(resultado.getString(2));
			socio.setApellido(resultado.getString(3));
			socio.setDireccion(resultado.getString(4));
			socio.setPoblacion(resultado.getString(5));
			socio.setProvincia(resultado.getString(6));
			socio.setDni(resultado.getString(7));
			
			socios.add(socio);
		}
		
		return socios;
		
	}
	
	public void insertarPrestamo(Prestamo prestamo) throws SQLException {
		preparedSt= con.prepareStatement("INSERT INTO prestamos"
				+ " (id_libro, id_socio, fecha, devuelto) VALUES (?, ?,?,?) ");
		preparedSt.setInt(1, prestamo.getIdLibro());
		preparedSt.setInt(2,prestamo.getIdSocio());
		preparedSt.setDate(3,new java.sql.Date (prestamo.getFecha().getTime()));
		preparedSt.setBoolean(4, prestamo.getDevuelto());
		
		preparedSt.execute();
		
	}
	
	

	
	public void devolverLibro(int idLibro) throws SQLException {
		Prestamo prestamo = prestamoNoDevuelto(idLibro);
		
		preparedSt =con.prepareStatement("UPDATE prestamos SET devuelto=true WHERE id_libro =? and id_socio=? and fecha=?") ;
		
			preparedSt.setInt(1, prestamo.getIdLibro());
			preparedSt.setInt(2, prestamo.getIdSocio());
			preparedSt.setDate(3,new java.sql.Date(prestamo.getFecha().getTime()));
			preparedSt.execute();
			
		
		
	}

	public Prestamo prestamoNoDevuelto(int idLibro) throws SQLException {
		Prestamo prestamo = new Prestamo();
		preparedSt= con.prepareStatement("SELECT * FROM prestamos WHERE id_libro = ? AND devuelto = false");
		
			preparedSt.setInt(1, idLibro);
			ResultSet resultado= preparedSt.executeQuery();
			
			if(resultado.next()) {
				prestamo.setIdLibro(idLibro);
				prestamo.setIdSocio(resultado.getInt("id_socio"));
				prestamo.setFecha(resultado.getDate("fecha"));
				prestamo.setDevuelto(resultado.getBoolean("devuelto"));
				
			}
		return prestamo;
	}
	
	public ArrayList<Prestamo> getPrestamosNoDebueltos () throws SQLException{
		preparedSt = con.prepareStatement("SELECT * FROM prestamos WHERE devuelto = false");
		
		
		ResultSet resultado= preparedSt.executeQuery();
		
		ArrayList<Prestamo> prestamosNoDebueltos= new ArrayList <Prestamo>();
		Prestamo prestamoNo= new Prestamo();
		
		while(resultado.next()) {
			prestamoNo = new Prestamo();
			prestamoNo.setIdLibro(resultado.getInt("id_libro"));
			prestamoNo.setIdSocio(resultado.getInt("id_Socio"));
			prestamoNo.setFecha(resultado.getDate("fecha"));
			prestamoNo.setDevuelto(resultado.getBoolean("devuelto"));
			
			
			prestamosNoDebueltos.add(prestamoNo);
		}
		
		return prestamosNoDebueltos;
		
	}
	
	
	
	public ArrayList<Prestamo> getSocioPrestamos (int idSocio) throws SQLException{
		preparedSt = con.prepareStatement("SELECT * FROM prestamos WHERE id_socio = ?");
		
		preparedSt.setInt(1, idSocio);
		ResultSet resultado= preparedSt.executeQuery();
		
		ArrayList<Prestamo> prestamosSocio= new ArrayList <Prestamo>();
		Prestamo prestamoSo= new Prestamo();
		
		while(resultado.next()) {
			prestamoSo = new Prestamo();
			prestamoSo.setIdLibro(resultado.getInt("id_libro"));
			prestamoSo.setIdSocio(idSocio);
			prestamoSo.setFecha(resultado.getDate("fecha"));
			prestamoSo.setDevuelto(resultado.getBoolean("devuelto"));
			
			
			prestamosSocio.add(prestamoSo);
		}
		
		return prestamosSocio;
		
	}
	
	public Prestamo disponibilidadLibro (int idLibro) throws SQLException{
		preparedSt = con.prepareStatement("SELECT * FROM prestamos WHERE id_libro = ?");
		
		
		
		Prestamo dispoLibro = new Prestamo();
		
		preparedSt.setInt(1, idLibro);
		
		ResultSet resultado= preparedSt.executeQuery();
		
		if(resultado.next()) {
			dispoLibro.setIdLibro(idLibro);
			dispoLibro.setIdSocio(resultado.getInt("id_socio"));
			dispoLibro.setFecha(resultado.getDate("fecha"));
			dispoLibro.setDevuelto(resultado.getBoolean("devuelto"));
		}
		
		return dispoLibro;
		
	}
}
	
	
	
	
	

	

