import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random r=new Random();
		int num[]=new int [20];
		int media;
		int cont=0;
		int suma=0;
		
		System.out.println("Introduzca los valores en la tabla");
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
			suma+=num[i];
			cont++;
		}
		media=suma/cont;
		System.out.println("La media es "+media);
		System.out.println("Estos son los valores que superan la media");
		for(int i=0;i<num.length;i++) {
			if(num[i]>media) {
				System.out.print(num[i]);
				System.out.print(", ");
			}
		}

	}

}
