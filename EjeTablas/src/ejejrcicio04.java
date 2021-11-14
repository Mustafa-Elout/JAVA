import java.util.Random;
import java.util.Scanner;

public class ejejrcicio04 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		Random r=new Random();
		int num[]=new int [100];
		int max=0;
		int min=500;
		float media=0;
		int contposiciones=0;
		
		contposiciones = RellenarTabla(r, num, contposiciones);
		CalcularMáximo(num, max);
		CalculaMínimo(num, min);
		CalcularMedia(num, media, contposiciones);
	}

	private static int RellenarTabla(Random r, int[] num, int contposiciones) {
		//Rellenar la tabla
		System.out.println("Introduza los valores en la tabla");
		for(int i=0;i<num.length;i++) {
			System.out.print("Posisción "+i+" :");
			num[i]=(int)(r.nextInt(500)+1);
			System.out.println(num[i]);
			contposiciones++;
		}
		return contposiciones;
	}

	private static void CalcularMáximo(int[] num, int max) {
		//Calcular el máximo
		for (int i=0;i<num.length;i++) {
			if (num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("El máximo es "+max);
	}

	//Clacular el mínimo
	private static void CalculaMínimo(int[] num, int min) {
	
		for (int i=0;i<num.length;i++) {
			if (num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("El mínimo  es "+min);
	}

	//Calcular la media
	private static void CalcularMedia(int[] num, float media, int contposiciones) {
		
		float suma=0;
		for(int i=0;i<num.length;i++) {
			suma+=num[i];
			media=suma/contposiciones;
		}
		System.out.println("La media es "+media);
	}
	

}
