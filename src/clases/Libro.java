package clases;

public class Libro {
	private int id;
	private String titulo;
	private String autor;
	private int numPag;
	
	public Libro(int id, String titulo, String autor, int num_pag) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = num_pag;
	}
	
	public Libro() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNum_pag() {
		return numPag;
	}

	public void setNum_pag(int num_pag) {
		this.numPag = num_pag;
	}

	@Override
	public String toString() {
		return "Libros [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", num_pag=" + numPag + "]";
	}
	
	
}
