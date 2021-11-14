package exacontroljava;

import java.util.Scanner;

public class eje04de10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		//el número de trabajdores de la empresa
		float trabajadores;
		//el sueldo de cada trabajador
		int sueldo;
		//la antigüedad de caada trabajador
		int antiguedad;
		//un contador para ver los trabajador que tiene más de 20 años de antigüedad
		float contmas20=0;
		//el porcentaje de los trabajadores que tienen más de 20 años de antigüedad sobre todos los trabajadores
		float pormas20;
		//para saber el sueldo que cobran los que más de 20 años de antigüedad
		float sueldomas20=0;
		//para saber el sueldo total
		float sueldototal=0;
		//para saber el porcentaje que representa los trabajadores que tienen más de 20 años de antigüedad
		float porsueldomas20;
		
		System.out.println("Introduce el número de trabajadores");
		trabajadores=sc.nextInt();
		for (int i=0;i<trabajadores;i++)
		{
			System.out.print("Sueldo: ");
			sueldo=sc.nextInt();
			sueldototal=sueldototal+sueldo;
			System.out.print("Antigüedad: ");
			antiguedad=sc.nextInt();
			if (antiguedad>20)
			{
				contmas20++;
				sueldomas20=sueldomas20+sueldo;
			}
		}
		pormas20=(contmas20/trabajadores)*100;
		System.out.println("El " + pormas20 +"% de la plantilla tiene más de 20 años de antigüedad en la empresa");
		porsueldomas20=(sueldomas20/sueldototal)*100;
		System.out.println("Su sueldo representa el "+ porsueldomas20 +"% del total de salarios");
	}
	

}
