package exacontroljava;

import java.util.Scanner;

public class eje03Bjava {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int digito;
		int resultado=0;
		int potencia;
		
		System.out.println("Introduzca los dígitos hasta pulsar -1");
		digito=sc.nextInt();
		potencia=1;
		while (digito>=0)
		{
			resultado=resultado+digito*potencia;
			potencia=potencia*10;
			digito=sc.nextInt();
		}
		System.out.println("El valor final es= " + resultado);
	}

}
