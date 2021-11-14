import java.util.Random;
import java.util.Scanner;

public class ejercicio04_1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		Random r=new Random();
		int num[]=new int [100];
		
		float media=0;
		int contposiciones=0;
		
		//Rellenar la tabla
		System.out.println("Introduza los valores en la tabla");
		for(int i=0;i<num.length;i++) {
			System.out.print("Posisción "+i+" :");
			num[i]=r.nextInt(500)+1;
			System.out.println(num[i]);
			
		}
		int max=num[0];
		int min=num[0];
		
		//Calcular el máximo
		for (int i=0;i<num.length;i++) {
			if (num[i]>max) {
				max=num[i];
			}else {
				min=num[i];
			}
		}

		
		
		//Clacular el mínimo
		for (int i=0;i<num.length;i++) {
			if (num[i]<min) {
				min=num[i];
			}
		}
		
		
		//Calcular la media
		float suma=0;
		for(int i=0;i<num.length;i++) {
			suma+=num[i];
			media=suma/num.length;
		}
		
		
		System.out.println("El máximo es "+max);
		System.out.println("El mínimo  es "+min);
		System.out.println("La media es "+media);

	}

}
