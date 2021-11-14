package tablas;

import java.util.Arrays;
import java.util.Iterator;
/**
 * Ejemplos de algoritmos sobre varias tablas
 * @author alberto
 *
 */
public class EjemplosVariasTablas {


	public static void main ( String argv[]){
		
		int primera[] = new int[6];
		int segunda[] = new int[10];
		int nueva[];
		
		// Relleno ambas tablas con valores aleatorios y los ordeno
		rellenarAzar(primera,10,30);
		rellenarAzar(segunda,15,35);
		Arrays.sort(primera);
		Arrays.sort(segunda);
		
		// PRUEBA MEZCLA
		nueva = mezclaTablas(primera,segunda);
		System.out.println("1 º         " +Arrays.toString(primera));
		System.out.println("2 º         " +Arrays.toString(segunda));
		System.out.println("Mezcla      " +Arrays.toString(nueva));
		
		// PRUEBA DISTINTOS
		nueva = obtenerDistintos(primera);
		System.out.println("Distintos 1º"+ Arrays.toString(nueva));
	
		System.out.println("Distintos 2º"+ Arrays.toString(obtenerDistintos(segunda)));
	
		System.out.println("Distintos Mx"+ Arrays.toString(obtenerDistintos(mezclaTablas(primera,segunda))));

		// PRUEBA SUMA
		System.out.println("Suma        "+ Arrays.toString(sumaTablas(primera,segunda)));
		
	}
	
	/**
	 * Rellena un tabla con valores aleatorios en valor mínimo y un valor máximo
	 * @param tabla - tabla a rellenar
	 * @param valorMin - valor mínimo
	 * @param valorMax - valor máximo
	 */
	public static void rellenarAzar ( int tabla[], int valorMin, int valorMax){
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int)(valorMin + Math.round(Math.random()*(valorMax-valorMin)));
		}
	}
	
	/**
	 * Realiza la mezcla de dos tablas ordenadas
	 * @param t1 - Primera tabla
	 * @param t2 - Segunda tabla
	 * @return - Devuelve una tabla resultante de la mezcla ordenada
	 */
	public static int [] mezclaTablas ( int t1[], int t2[]){
		// Creo la tabla resultante
		int tr[] = new int [ t1.length + t2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		//  Hay datos de la dos tablas 
 		while ( i < t1.length && j < t2.length){
			if (  t1[i] < t2[j]){
				tr[k] = t1[i];
				i++;
			}
			else {
				tr[k] = t2[j];
				j++;
			}
			k++;
		}
			
 		// Copio lo que queda de t1 o de t2
 		while ( i < t1.length){
 			tr[k] = t1[i];
			i++;
			k++;
		}
 		while ( j < t2.length){
 			tr[k] = t2[j];
			j++;
			k++;
		}
 		
 		return tr;
	}
	
	/**
	 * Obtiene una nueva tabla con valores no repetidos de la tabla pasada como parámetro 
	 * @param tabla - tabla que puede tener valores repetidos
	 * @return - nueva tabla sin valores repetidos
	 */
	public static int [] obtenerDistintos  ( int tabla[]){
		int contador = 0;
		// Tabla auxiliar para guardar los elementos 
		// del  mismo tamaño ya puede que todos sean distintos
		int taux [] = new int [ tabla.length];
	    int caux = 0;  // Valores introducidos en la tabla auxiliar
		for (int valor : tabla) {
			boolean esta = false;
			for ( int i=0; i< caux; i++){
				if ( valor == taux[i]) {
			        esta = true;
			        break;
				}
			}
			if ( !esta){
				taux[caux] = valor;
				caux++;
			}
		}
		
		// Creo una tabla de resultado con el tamaño justo
		// Copio los valores distintos
		int resu [] = new int [ caux];
		for ( int i=0; i < caux; i++){
			resu[i] = taux[i];
		}
		
		return resu;
	}
	
	/**
	 * Suma los valores de las posiciones de dos tablas, si una tabla es mayor que la otra se tomanrán
	 * los valores que faltan como 0 de la tabla más pequeña.
	 * @param t1 primera tabla
	 * @param t2 segunda tabla
	 * @return tabla suma tendrá el tamaño de la tabla más grande
	 */
	public static int[] sumaTablas ( int t1[], int t2[]){
		int tsuma[];
		// Obtengo el tamaño más grande
		int tamaño = ( t1.length > t2.length)? t1.length: t2.length;
		tsuma = new int[tamaño];
		for (int i=0; i < tamaño; i++){
			int suma =0;
			if ( i < t1.length){
				suma += t1[i];
			}
			if ( i < t2.length){
				suma += t2[i];
			}
			tsuma[i] = suma;
		}
		return tsuma;
	}
}
