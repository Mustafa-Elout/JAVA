package exacontroljava;

import java.util.Scanner;

public class eje01A {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Introduzca los números");
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		System.out.print(num1 + ":");
		for (int i=1; i<=num1; i++)
		{
			System.out.print("-");
		}
		System.out.println(">");
		
		System.out.print(num2 + ":");
		for (int i=1; i<=num2; i++)
		{
			System.out.print("-");
		}
		System.out.println(">");
		
		System.out.print(num3 + ":");
		for (int i=1; i<=num3; i++)
		{
			System.out.print("-");
		}
		System.out.println(">");
	}

}
