import java.util.Scanner;

public class Ejerccicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num[]=new int [10];
		
		RellenarTabla(sc, num);
		MostrarPares(num);
		MostrarImpares(num);
	}

	private static void RellenarTabla(Scanner sc, int[] num) {
		System.out.println("Introduzca los valores de la tabla");
		for (int i=0; i<num.length;i++) {
			System.out.print("Introduzca el valor de la posición "+i+":");
			num[i]=sc.nextInt();
		}
	}

	private static void MostrarPares(int[] num) {
		for (int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
	}

	private static void MostrarImpares(int[] num) {
		for (int i=0;i<num.length;i++) {
			if(num[i]%2!=0) {
				System.out.println(num[i]);
			}
		}
	}

}
