package exacontroljava;

import java.util.Scanner;

public class eje02A {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num;
		int digito;
		num=sc.nextInt();
		
		while (num>0)
		{
			digito=num-(num/10)*10;
			System.out.println(digito);
			num=num/10;
		}
	}

}
