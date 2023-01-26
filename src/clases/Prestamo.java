package clases;

import java.sql.Date;

public class Prestamo {
	
	private int idLibro;
	private int idSocio;
	private Date fecha;
	private String devuelto;
	
	public Prestamo(int idLibro, int idSocio, Date fecha, String devuelto) {
		super();
		this.idLibro = idLibro;
		this.idSocio = idSocio;
		this.fecha = fecha;
		this.devuelto = devuelto;
	}
	
	public Prestamo () {
		
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public int getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDevuelto() {
		return devuelto;
	}

	public void setDevuelto(String devuelto) {
		this.devuelto = devuelto;
	}

	@Override
	public String toString() {
		return "Prestamo [idLibro=" + idLibro + ", idSocio=" + idSocio + ", fecha=" + fecha + ", devuelto=" + devuelto
				+ "]";
	}
	
	
	
}
