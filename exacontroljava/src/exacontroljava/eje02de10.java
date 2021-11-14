package exacontroljava;

import java.util.Scanner;

public class eje02de10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner (System.in);
		int num;
		System.out.println("Itroduce un número");
		num=sc.nextInt();
		if (num>=30 && num<=100)
		{
			System.out.println("El " + num + " se encuentra entre 30 y100");
		}
		else
		{
			System.out.println("El " + num + " no se encuentra entre 30 y100");
		}
	}

}
