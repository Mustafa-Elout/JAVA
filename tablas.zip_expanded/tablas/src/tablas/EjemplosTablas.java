package tablas;

import java.util.Scanner;

/**
 * Ejemplos básicos de manejo de tablas unidimensionale
 * @author alberto
 *
 */

public class EjemplosTablas {

	public static void main(String args[]) {

		int mivector[] = new int[10];

		rellenarTabla(mivector);
		mostrarTabla(mivector);
		System.out.println(" Suma de tabla = "   + sumarTabla(mivector));
		System.out.println(" Máximo de tabla = " + maximoDeTabla(mivector));
		invertirTabla(mivector);
		mostrarTablaHorizontal(mivector);
		System.out.println(" La moda de la tabla es = " + calcularModa(mivector));
		 
		
	}
	/**
	 * Rellena la tabla de enteros vector solicitando datos por consola
	 * @param vector Tabla a rellenar
	 */
	public static void rellenarTabla(int[] vector) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce los valores :");
		for (int i = 0; i < vector.length; i++) {
			System.out.printf(" Introducir valor para el elemento Nº %2d:", i);
			vector[i] = sc.nextInt();
		}
		sc.close();

	}

	/**
	 * Muestra los elementos de un tabla línea a línea
	 * @param vector
	 */
	public static void mostrarTabla(int[] vector) {
		System.out.println(" Contenido de la Tabla:");
		for (int i=0; i < vector.length; i++) {
			System.out.println(" Valor para el elemento Nº " + i + "= " + vector[i]);
		}
	}
	/**
	 * Muestra los valores en una línea en formato java
	 * @param vector
	 */
	
	public static void mostrarTablaHorizontal(int[] vector) {
		System.out.print(" { ");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]);
			if ( i < vector.length -1) System.out.print(", ");
		}
		System.out.println(" }");
		
	}
    /**
     * Calcula la suma de los elementos de un array
     * Utiliza el ciclo for-each
     * @param vector - tabla a sumar
     * @return Devuelve la suma de valores
     */
	public static int sumarTabla(int[] vector) {
		int suma = 0; // Utilizo un ciclo for-each
		for (int valor : vector) {
			suma += valor;
		}
		return suma;
	}

	/**
	 * Obtiene el valor máximo de una tabla
	 * @param vector
	 * @return valor máximo
	 */
	public static int maximoDeTabla(int[] vector) {
		int maximo = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] > maximo)
				maximo = vector[i];
		}
		return maximo;
	}

	/**
	 * Invierto el contido de un verctor
	 * @param vector - vector a invertir el contenido
	 */
	public static void invertirTabla(int[] vector) {

		int aux;
		for (int i = 0; i < vector.length / 2; i++) {
			aux = vector[i];
			vector[i] = vector[vector.length - i - 1];
			vector[vector.length - (i + 1)] = aux;
		}
	}

	/**
	 * Calcula la moda o valor que más veces se repite
	 * @param vector
	 * @return devuelve el valor más repetido
	 */
	public static int calcularModa(int[] vector) {

		int moda;     // Valor de la moda
		int fmoda;    // Frecuencia o número de repeticiones
		int valor;    // Valor de la posible moda
		int fmodatmp; // Frecuencia de la posible moda
		fmoda = 0;
		moda = 0;
		for (int i = 0; i < vector.length; i++) {
			fmodatmp = 0;
			valor = vector[i];
			// Calculo cuantas veces se repite ese valor
			for (int j = 0; j < vector.length; j++) {
				if (vector[j] == valor)
					fmodatmp++;
			}
			// Si se repite más, es la nueva moda
			if (fmodatmp > fmoda) {
				fmoda = fmodatmp;
				moda = valor;
			}
		}

		return moda;
	}

		
}
