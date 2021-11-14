import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Random r=new Random();
		int tabla[]=new int [20]; 
		int num;
		
		
		System.out.println("Introduzca el número que quieras que comprobeos");
		num=sc.nextInt();
		
		rellenarTabla(r, tabla);
		System.out.println("El "+num+" se repite "+comprobarValor(tabla, num)+" veces");
		
		
	}

	private static void rellenarTabla(Random r, int[] tabla) {
		for(int i=0;i<tabla.length;i++) {
			tabla[i]=r.nextInt(20)+1;
			System.out.print(tabla[i]);
			System.out.print(", ");
		}
		System.out.println();
	}

	private static int comprobarValor(int[] t1, int num1) {
		int cont=0;
		for(int i=0;i<t1.length;i++) {
			
			if(t1[i]==num1) {
				cont++;
			}
			
		}
		return cont;
	}

}
