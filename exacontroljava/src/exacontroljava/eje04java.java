package exacontroljava;

import java.util.Scanner;

public class eje04java {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int letraOpcion=0;
		int contHolas=0;
		int contAdios=0;
		
		do
		{
			System.out.println("1.-Saludar");
			System.out.println("2.-Despedirse");
			System.out.println("3.-Terminar");
			System.out.println("Elegir opción (1-3)");
			letraOpcion=sc.nextInt();
			switch (letraOpcion) {
			case 1:System.out.println("Hola");
			contHolas++;break;
			case 2:System.out.println("Adiós");
			contAdios++;break;
			case 3:System.out.println("Total de saludos = " + contHolas);
					System.out.println("Total de despedidas = " + contAdios);break;
			default: System.out.println("Opción errónea");		
			}
		}
		while (letraOpcion!=3);

	}

}
