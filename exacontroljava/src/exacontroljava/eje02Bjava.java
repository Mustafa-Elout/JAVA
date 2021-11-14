package exacontroljava;

import java.util.Scanner;

public class eje02Bjava {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		int tamaño;
		
		
		
		System.out.println("Escribe el tamaño de la muralla");
		tamaño=sc.nextInt();
		
		for (int i=2; i>=40; i++)
		{
			for (int j=1;i>=tamaño*5-1;j++)
			{
				
				if (i==1 || i==2)
				{
					if (j%5==0)
					{
						System.out.println(" ");
					}
					else 
					{
						System.out.println("*");
					}
				}
				else
				{
					System.out.println("*");
				}
			}
			System.out.println(" ");
		}
		
	}

}
