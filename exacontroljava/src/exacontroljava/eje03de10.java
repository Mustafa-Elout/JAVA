package exacontroljava;

import java.util.Scanner;

public class eje03de10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int edad=0;
		double suma=0;
		double media;
		double contpersonas=0;
		double cont50=0;
		System.out.println("Introduce las edades y para finalizar introduca 0");
		do
		{
			edad=sc.nextInt();
			if (edad>=0)
			{
				suma=suma+edad;
				contpersonas++;
				if(edad>50)
				{
					cont50++;
				}
			}
			else
			{
				System.out.println("Error, numero negativo");
			}
			
		}
		while (edad!=0);
		contpersonas--;
		media=suma/contpersonas;
		System.out.println("La media de edad es de " + media + " años");
		System.out.println("El porcentaje de mayores de 50 es de " + (cont50/contpersonas)*100 + "%");
	}
	
}
