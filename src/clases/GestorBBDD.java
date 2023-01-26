package clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD extends Conector  {
	PreparedStatement preparedSt;
	
	public void insertarLibro(Libro libro) throws SQLException {
		
		preparedSt= con.prepareStatement("INSERT INTO `libros` "
				+ "(`id`, `titulo`, `autor`, `num_pag`) "
				+ "VALUES (?,?,?,?)");
		preparedSt.setInt(1, libro.getId());
		preparedSt.setString(2, libro.getTitulo());
		preparedSt.setString(3, libro.getAutor());
		preparedSt.setInt(3, libro.getNum_pag());
		
		preparedSt.execute();
		
	}
	
	public void eliminarLibro(int id) throws SQLException {
		
		preparedSt= con.prepareStatement("DELETE FROM libros WHERE `libros`.`id` = ?");
		//preparedSt.execute(preparedSt);
	}
	//public Libro getLibro(int id) {
		
	//}
	
}
