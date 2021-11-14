package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int num1;
		int num2;
		char operador;
		try {
		System.out.println("Introduce un número");
		num1=sc.nextInt();
		System.out.println("Introduce un operador (+,-,*,/)");
		operador=sc.next().charAt(0);
		System.out.println("Introduce un número");
		num2=sc.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("Error, no has introducido un entero");
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void calcular(int num1, int num2, char operador) {
		int resu;
		switch (operador) {
		case '+':
			resu=num1+num2;
			break;

		default:
			break;
		}
	}

}
