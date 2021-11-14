package exacontroljava;

import java.util.Scanner;

public class eje03A {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int salario;
		int mas3000=0;
		int entre1000y3000=0;
		int menos1000=0;
		int cont=1;
		
		System.out.println("Introduce los salarios");
		while (cont<=20)
		{
			salario=sc.nextInt();
			cont++;
			if(salario>=3000)
			{
				mas3000++;
			}
			else 
			{
				if(salario>1000 && salario<3000)
				{
					entre1000y3000++;
				}
				else 
				{
					menos1000++;
				}
			}
			
		}
		System.out.println("Los que cobran más de 3000 son " + mas3000 + " personas");
		System.out.println("Los que cobran entre 1000 y 3000 son " + entre1000y3000 + " personas");
		System.out.println("Los que cobran menos de 1000 son " + menos1000 + " personas");
		
	}

}
