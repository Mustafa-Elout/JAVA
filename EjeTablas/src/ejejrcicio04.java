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
		CalcularM�ximo(num, max);
		CalculaM�nimo(num, min);
		CalcularMedia(num, media, contposiciones);
	}

	private static int RellenarTabla(Random r, int[] num, int contposiciones) {
		//Rellenar la tabla
		System.out.println("Introduza los valores en la tabla");
		for(int i=0;i<num.length;i++) {
			System.out.print("Posisci�n "+i+" :");
			num[i]=(int)(r.nextInt(500)+1);
			System.out.println(num[i]);
			contposiciones++;
		}
		return contposiciones;
	}

	private static void CalcularM�ximo(int[] num, int max) {
		//Calcular el m�ximo
		for (int i=0;i<num.length;i++) {
			if (num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("El m�ximo es "+max);
	}

	//Clacular el m�nimo
	private static void CalculaM�nimo(int[] num, int min) {
	
		for (int i=0;i<num.length;i++) {
			if (num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("El m�nimo  es "+min);
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
