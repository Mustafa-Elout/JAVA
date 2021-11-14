import java.util.Scanner;

public class Ejercicio02 {

	//Leer 10 números, almacenarlos en una tabla y mostrarlos en orden inverso
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num[]=new int[10];
		int aux;
		
		System.out.println("Introduzca los valores de la tabla");
		
		RellenarTabla(sc, num);
		InvertirTabala(num);
		MostrarTablaInversa(num);
	}

	private static void MostrarTablaInversa(int[] num) {
		System.out.println("Contenido de la tabla");
		for (int i=0;i<num.length;i++) {
			System.out.println("Valor para el parámetro Nº "+i+" = "+num[i]);
		}
	}

	private static void InvertirTabala(int[] num) {
		int aux;
		for (int i=0;i<num.length/2;i++) {
			aux=num[i];
			num[i]=num[num.length-i-1];
			num[num.length-(i+1)]=aux;
		}
	}

	private static void RellenarTabla(Scanner sc, int[] num) {
		for (int i=0;i<num.length;i++) {
			System.out.print("Introduzca valor de la posición "+i+":");
			num[i]=sc.nextInt();
		}
	}
	

}
