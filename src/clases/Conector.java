package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	protected Connection con;

	
	public Connection getConexion() {
		return con;
	}

	public void setConexion(Connection conexion) {
		this.con = conexion;
	}
	
	public void conectar() {
		try {
			final String HOST= "localhost";
			final String BBDD= "arboles";
			final String USERNAME="root";
			final String PASSWORD="";
			
				Class.forName("com.mysql.jdbc.Driver");
				
				con = (Connection) DriverManager.getConnection("jdbc:mysql://"+HOST+ "/"+BBDD,USERNAME,PASSWORD);
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void cerrar() throws SQLException {
		con.close();
	}
	
	
}
