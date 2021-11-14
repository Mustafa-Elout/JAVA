package biblioteca;

public class ListaLibros {
	
   Nodo primero;
   Nodo ultimo;
   
    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
       
        primero = null;
    }

   
    // Completar los metodos
    
    // Incluye un nuevo libro en la lista
    public void pon(Libro valor){
    	Nodo nuevo=new Nodo();
        nuevo.valor=valor;
        nuevo.sigiente=primero;
        primero=nuevo;
        if(ultimo == null) {
        	ultimo=primero;
        }
        
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
        
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
	public Libro quitar(int id) {
		Libro informacion = null;
		Nodo actual = primero;
		Nodo anterior = null;
		boolean existe = false;
		while ((actual != null) && (!existe)) {
			if(actual.valor.id == id) {
				existe=true;
			}
			if (existe==true) {
				informacion = actual.valor;
			}else {
				anterior = actual;
				actual = actual.sigiente;
			}	
		}
		if (actual == null) {
			anterior.sigiente = actual.sigiente;
		} else {
			if (actual == primero) {
				primero = actual.sigiente;
			}
		}

		return informacion;
	}
   
    // Devuelve el id del libro o -1 si no esta
	public int buscarId(String titulo) {

		Nodo actual = primero;
		int noEsta = -1;
		boolean encontrado = false;

		while (actual != null && (!encontrado)) {
			encontrado = (actual.valor.titulo.equals(titulo));
			if (encontrado) {
				noEsta = actual.valor.id;
			}
			actual = actual.sigiente;
		}

		return noEsta;
	}
    // Muestra los libros almacenados
	public void verCatalogo() {
		int numNodos = 0;
		Nodo aux = primero;
		while (aux != null) {
			numNodos++;
			System.out.println(numNodos + " : " + aux.valor);
			aux = aux.sigiente;
		}
	}

	public Libro getPrimero() {
		if (estaVacia()) {
			return null;
		} else {
			return primero.valor;
		}
	}



	
 
}
