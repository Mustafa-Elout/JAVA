package biblioteca;

public class Libro {
	
	int id;
	String titulo;
	String autor;
	Genero genero;
	int edici�n;
	
	Libro sigiente;
	

	

	

	public Libro(int id, String titulo, String autor, Genero genero, int edici�n) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.edici�n = edici�n;
		this.sigiente= null;
	}





	@Override
	public String toString() {
		return "libro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", edici�n=" + edici�n + "]";
	}
	
	
	
}
