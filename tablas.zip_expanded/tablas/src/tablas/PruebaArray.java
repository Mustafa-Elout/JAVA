package tablas;

import java.util.Arrays;
/**
 * Pruebas de la librería de Arrays de Java
 * @author alberto
 *
 */

public class PruebaArray {
	
	public static void main (String args[]) {
		
		// Creo una tabla de 20 enteros
		int [] mitabla = new int [20];
		
		// Relleno la tabla con el valor 5
		Arrays.fill(mitabla,5);
		
		// Muestro el contenido de la tabla
		System.out.println(" Contenido de la tabla:1 "+Arrays.toString(mitabla));
		
		// Relleno la tabla con valores aleatorios
		for (int i=0;i< mitabla.length; i++){
			mitabla[i] = (int) (Math.random()*20)+1; // Asigno valores entre 1 a 10
		}
		
		// Muestro el contenido de la tabla
		System.out.println(" Contenido de la tabla:2 "+Arrays.toString(mitabla));
		
		// Ordeno la tabla
		Arrays.sort(mitabla);
		
		// Muestro el contenido de la tabla
		System.out.println(" Contenido de la tabla:3 "+Arrays.toString(mitabla));
				
		// Busco valores 
		// Devuelve la posición donde está o un valor negativo que indica donde debería estar(-1).
		System.out.println(" ¿Está el   5? = " + Arrays.binarySearch(mitabla,  5));
		System.out.println(" ¿Está el   3? = " + Arrays.binarySearch(mitabla,  3));
		System.out.println(" ¿Está el  15? = " + Arrays.binarySearch(mitabla, 15));
		System.out.println(" ¿Está el -42? = " + Arrays.binarySearch(mitabla,-42));
	}
}
