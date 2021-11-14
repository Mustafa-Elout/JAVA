package tablas;

import java.util.Scanner;
/**
 * Ejemplo de algoritmos básicos sobre tablas
 * Búsqueda secuencial
 * Búsqueda dicotómica o binaria
 * Ordenación de tablas por el método de la burbuja.
 * @author alberto
 * @version 1.0
 */


public class EjemploBuscaryOrdenar {

	/**
	 * Prueba los métodos
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int tabla[] = new int [20];
		int valor;
		int posicion;

		// Relleno la tabla con valores aleatoriso entre 1 y 50;
		for (int i=0; i< tabla.length;i++){
			tabla[i] = (int)(Math.random()*50)+1;
		}
		
		// Prueba de busqueda secuencial.
		
		EjemplosTablas.mostrarTablaHorizontal(tabla);
		System.out.print("Introduce un valor a buscar:");
		valor = sc.nextInt();
		posicion = buscarSecuencial(tabla, valor);
		
		if (posicion == -1) {
			System.out.println("No se encuentra");
		} else {
			System.out.println("El valor está en la posición:" + posicion);
		}
		
		// Prueba de ordenación y busqueda binaria
		ordenarBurbuja(tabla);
		System.out.println("--->Tabla ordenada:");
		EjemplosTablas.mostrarTablaHorizontal(tabla);
		System.out.print("Introduce un valor a buscar:");
		valor = sc.nextInt();
		posicion = buscarBinaria(tabla, valor);
		
		if (posicion == -1) {
			System.out.println("No se encuentra");
		} else {
			System.out.println("El valor está en la posición:" + posicion);
		}
			
		sc.close();
		
	}

	/**
	 *  Búsqueda secuencial 
	 *  Realiza la búsqueda secuencia sobre una tabla
	 * @param ventor -- tabla unidimensional o vector donde buscar
	 * @param valor  -- valor a buscar
	 * @return la posición en el vector o -1 si no se encuentra
	 */
	public static int buscarSecuencial(int[] vector, int valor) {
			int pos = -1; // Supongo que no está

			for (int i = 0; i < vector.length; i++) {
				if (valor == vector[i]) {
					pos = i; // Guardo la posición y salgo del ciclo
					break;
				}
			}
			return pos;
		}

	
	/**
	 *  Búsqueda binaria 
	 *  Realiza la búsqueda secuencia sobre una tabla
	 * @param ventor -- tabla unidimensional o vector donde buscar
	 * @param valor  -- valor a buscar
	 * @return la posición en el vector o -1 si no se encuentra
	 */
	
	public static int buscarBinaria(int[] vector, int valor) {
				int izda,dcha,medio;
				izda = 0;
				dcha = vector.length -1;
				while ( izda <= dcha){
					medio = (izda + dcha)/2;
					if ( vector[medio] == valor){
						return medio; // Termina el método
					}
					else if ( vector [medio] < valor){
						izda = medio +1;
						}
						else{
						dcha = medio -1;
						}
				}
				return -1;
		}

    /**
     * Ordena la tabla unidimensional por el método de la burbuja con un indicador de intercambio.
     * @param vector
     */
	public static void ordenarBurbuja ( int [] vector){
			
			boolean intercambio = true;
			int aux;
			int i = 1;
			while ( intercambio){
				intercambio = false;
				for ( int j= 0; j < vector.length-i; j++){
					if ( vector[j]>vector[j+1]){
						aux = vector[j];
						vector[j]= vector[j+1];
						vector[j+1] = aux;
						intercambio = true;
					}
				}
			}
			i++;
		}
}


