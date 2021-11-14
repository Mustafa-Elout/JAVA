import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Leer 10 números, almacenarlos en una tabla y mostrar su suma.
		Scanner sc = new Scanner (System.in);
		int num []=new int [10];
		int suma=0;
		
		//Leer
		
		System.out.println("Introduce los valores de la tabla");
		for (int i=0;i<num.length;i++) {
			System.out.print("Introducir valor para el elemento "+i+":");
			num[i]=sc.nextInt();
			//suma
			suma+=num[i];
		}
		//Mostrar suma
		System.out.println("La suma es "+ suma);
		
	}

}
