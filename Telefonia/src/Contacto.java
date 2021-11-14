
public class Contacto {
	    private int numtelefono;
	    private String nombre;
	    
		public Contacto(int numtelefono, String nombre) {
			this.numtelefono = numtelefono;
			this.nombre = nombre;
		}

		public int getNumtelefono() {
			return numtelefono;
		}

		public void setNumtelefono(int numtelefono) {
			this.numtelefono = numtelefono;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "Contacto [numtelefono=" + numtelefono + ", nombre=" + nombre + "]";
		}

		// getters, setter y toString
		
	    
}
