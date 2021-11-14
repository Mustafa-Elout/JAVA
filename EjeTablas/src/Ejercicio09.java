import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Random r =new Random();
		int tabla[]=new int [10];
		for(int i=0;i<tabla.length;i++) {
			tabla[i]=r.nextInt(10)+1;
			System.out.print(tabla[i]);
			System.out.print(", ");
		}
		System.out.println();
		
	}

}
