package exacontroljava;

import java.util.Scanner;

public class eje01Bjava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int estatura;
		int estaturaMayor;
		int estaturaMenor;
		float estaturaMedia;
		int nalumnos;
		
		
		nalumnos=40;
		System.out.println("Introduce los datos de las estatuas");
		estatura=sc.nextInt();
		estaturaMayor=estatura;
		estaturaMenor=estatura;
		estaturaMedia=estatura;
		
		for (int i=2; i<=40; i++)
		{
			estatura=sc.nextInt();
			if (estatura>estaturaMayor)
			{
				estaturaMayor=estatura;
			}
			else
			{
				if(estatura<estaturaMenor)
				{
					estaturaMenor=estatura;
				}
			}
			estaturaMedia=estaturaMedia+estatura;
		}
		
		estaturaMedia=estaturaMedia/nalumnos;
		System.out.println("Estatura Máxima" + estaturaMayor);
		System.out.println("Estatura Mínima " + estaturaMenor);
		System.out.println("Estatura Media " + estaturaMedia);
		
		
		}
	}



