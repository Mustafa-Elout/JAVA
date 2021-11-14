package exacontroljava;

import java.util.Scanner;

public class eje04Bjava {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int letraOpcion = 0;
		int contadorBebidas=0;
		int contadorComidas=0;
		
		do
		{
			System.out.println("1.-Beber");
			System.out.println("2.-Comer");
			System.out.println("3.-Terminar");
			System.out.println("Elegir opción(1-3)");
			
			letraOpcion=sc.nextInt();
			switch (letraOpcion)
			{
			case 1:System.out.println("Vino");
				contadorBebidas++;break;
			case 2:System.out.println("Jamón");
				contadorComidas++;break;
			case 3:System.out.println("Total de bebidas" + contadorBebidas);
				System.out.println("Total de comidas " + contadorComidas);break;
				default:System.out.println("Opción errónea");
			
			
			}
		}
		while (letraOpcion!=3);
		System.out.println("Fin de programa");
		
	}

}
