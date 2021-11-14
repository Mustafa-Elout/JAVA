import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Random r=new Random();
		Scanner sc=new Scanner (System.in);

		System.out.println("Introduzca el tamaño de la tabla");
		
		int num;
		num=sc.nextInt();
		int tabla[]=new int[num];
		int moda=0, fmoda=0, valor, fmodatm;
		
		rellenarTabla(r, tabla);
		System.out.println();
		moda = averiguarModa(tabla, moda, fmoda);
		System.out.println("El valor que más se repite (moda) es "+moda);
		System.out.println("Se repite "+comprobarValor(tabla, moda)+" veces");
		
	}

	private static int averiguarModa(int[] tabla, int moda, int fmoda) {
		int valor;
		int fmodatm;
		for (int i=0; i<tabla.length;i++) {
			fmodatm=0;
			valor=tabla[i];
			for(int j=0;j<tabla.length;j++) {
				if (tabla[j]==valor) fmodatm++;
			}
			if (fmodatm> fmoda) {
				fmoda=fmodatm;
				moda=valor;
			}
		}
		return moda;
	}

	private static void rellenarTabla(Random r, int[] tabla) {
		for (int i=0;i<tabla.length;i++) {
			tabla[i]=r.nextInt(20)+1;
			System.out.print(tabla[i]);
			System.out.print(", ");
		}
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
