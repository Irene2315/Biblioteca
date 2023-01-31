package gestor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import clases.Conector;
import clases.Libro;
import clases.Socio;


public class GestorBBDD extends Conector  {
	PreparedStatement preparedSt;
	
	public void insertarLibro(Libro libro) throws SQLException {
		
		preparedSt= con.prepareStatement("INSERT INTO `libros` "
				+ "(`id`, `titulo`, `autor`, `num_pag`) "
				+ "VALUES (?,?,?,?)");
		preparedSt.setInt(1, libro.getId());
		preparedSt.setString(2, libro.getTitulo());
		preparedSt.setString(3, libro.getAutor());
		preparedSt.setInt(4, libro.getNum_pag());
		
		preparedSt.execute();
		
	}
	public Libro modificarLibro (Libro libro) {
		
	}
	public void eliminarLibro(int id) throws SQLException {
		preparedSt = con.prepareStatement("DELETE FROM libros WHERE `libros`.`id` = ?");
		preparedSt.setInt(1,id);
		preparedSt.execute();
	}
	
	public Libro getLibro(int id) throws SQLException {
		Libro libroSelecion = new Libro();
		preparedSt= con.prepareStatement("SELECT * FROM `libros` WHERE `id` = ?");
		preparedSt.setInt(1,libroSelecion.getId());
		
		ResultSet resultado= preparedSt.executeQuery();
		
		if(resultado.next()) {
			libroSelecion.setId(resultado.getInt("id"));
			libroSelecion.setTitulo(resultado.getString("titulo"));
			libroSelecion.setAutor(resultado.getString("autor"));
			libroSelecion.setNum_pag(resultado.getInt("num_pag"));
		}
		
		return libroSelecion;
		
		
	}
	
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
	
	public void eliminarSocio(int id ) throws SQLException {
		preparedSt = con.prepareStatement("DELETE FROM socios WHERE `socios`.`id` = ?");
		preparedSt.setInt(1,id);
		preparedSt.execute();
	}
	
	public Socio getSocio(int id) throws SQLException {
		 Socio socioSelecion  = new Socio();
		preparedSt= con.prepareStatement("SELECT * FROM `socios` WHERE `id` = ?");
		preparedSt.setInt(1,socioSelecion.getId());
		
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
	
	
}
	

