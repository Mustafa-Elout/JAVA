package biblioteca;

public class Libro {
	
	int id;
	String titulo;
	String autor;
	Genero genero;
	int edición;
	
	Libro sigiente;
	

	

	

	public Libro(int id, String titulo, String autor, Genero genero, int edición) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.edición = edición;
		this.sigiente= null;
	}





	@Override
	public String toString() {
		return "libro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", edición=" + edición + "]";
	}
	
	
	
}
