package ALMACÉN;

public class Almacen1 {

	static private final int LIBRE = 0;
	// Array con los valores almacenados
	static int tvalores[];
	int valoresAlmacenados = 0;
	int numPosicionesLibres =0;
	
	// Constructores sin parámetros creo una tabla de 10 elementos
	public Almacen1(){
		this(10);  // Llamo al constructor con parámetros
	}

	// Constructor donde se fija tamaño máximo del Almacén
	public Almacen1( int tamaño){
		tvalores = new int [tamaño];
		init();
	}
	
	// Pone todas las posiciones a LIBRES
	public void init (){
		for (int i = 0; i < tvalores.length; i++) {
			tvalores[i] = Almacen1.LIBRE;
		}
		valoresAlmacenados = 0;
	}
	
	// Muestra una cadena con los valores de la tabla
	public int [] toString (int tabla[]){
		tabla[2]=5;
		tabla=tvalores;
		return tabla;
	}
	
	// Devuelve el números de posiciones libres
	public int numPosicionesLibres(int tabla []){
		int cont=0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla [i]==0) cont++;
		}
		return cont;
	}
	
	// Devuelve el número de posiones ocupadas
	public int numPosicionesOcupadas(int tabla []){
		int cont=0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla [i]!=0) cont++;
		}
		return cont;
	}
	
	// Devuelve verdadero o falso si está almacenado el valor en la tabla
	public boolean estaValor ( int num, int tabla []){
		boolean resu=false;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i]==num) {
				resu=true;
				break;
			}
		}
	return resu;
	}
	
	// Almacena el valor el la tabla, devuelve false sin no puede almacenarlo
	public boolean ponValor (int num, int tabla []){
		if (estaLleno(tabla)==false) {
			for (int i = 0; i < tabla.length; i++) {
				if(tabla[i]==0) {
					tabla[i]=num;
					break;
				}
			}
			return true;
		}
		
	return false;
	}
	
	// Elimina el elemento de la tabla, si no esta devuelve false
	public boolean sacarValor (int num, int tabla []){	
		for (int i = 0; i < tabla.length; i++) {
			if(tabla[i]==num) {
				tabla[i]=0;
				
				break;
				
			}return true;
		}
	return false;
	}
      // Indica si el almacén esta lleno
	public boolean estaLleno (int tabla[]){
		boolean resu=false;
		for (int i = 0; i < tabla.length; i++) {
			if(tabla[i]!=0)resu=true;
			else resu=false;
		}
	return resu;
	}

}
