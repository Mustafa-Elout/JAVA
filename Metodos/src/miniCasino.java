import java.util.Random;
import java.util.Scanner;

public class miniCasino {
static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
	 	System.out.println("Bienvenid@ al Minicasino");
	 	int saldo;
	 	System.out.print("Con cuanto dinero quiere jugar: ");
	 	saldo=sc.nextInt();
	 	while (saldo<0){
	 		System.out.println("Cantidad erronea, introduzca una cantidad positiva");
	 		System.out.print("Con cuanto dinero quiere jugar: ");
	 		saldo=sc.nextInt();
	 	}
	 	
	 	int contapuestas=1;
	 	char continuar=0;
	 	int cantidad=0;
	 	
	 	do {
	 		System.out.println(contapuestas+"º Apuesta (dispone de "+(saldo)+" Euros):");
	 		contapuestas++;
	 		do {
	 			System.out.print("Que cantidad desea apostar:");
		 		cantidad=sc.nextInt();
	 			if (cantidad<0 || cantidad>saldo) {
	 				System.out.println("La cantidad introducida es incorrecta");
	 			}
	 			if (cantidad>0 && cantidad<=saldo) break;
	 		}while(cantidad>0 || cantidad<saldo);
	 		saldo=saldo-cantidad;
	 		System.out.println("A que apuesta: Par o Impar (p o i)");
	 		char opcion=0;
	 		opcion=sc.next().charAt(0);
	 		while (opcion!='p' && opcion!='i') {
	 			System.out.println("Opción errónea");
	 			System.out.println("A que apuesta: Par o Impar (p o i)");
	 			opcion=sc.next().charAt(0);
	 		}
	 		int ale=0;
	 		
			Random r=new Random();
			ale=(int)(r.nextDouble()*36);
			//System.out.println(ale);
			if (opcion=='p' && ale %2==0) {
				saldo=saldo+cantidad*2;
				System.out.println("Resultado Nº"+ale+" Par (Gana)");
			}else {
				if (opcion=='i'&& ale%2!=0) {
					saldo=saldo+cantidad*2;
					System.out.println("Resultado Nº"+ale+" Impar (Gana)");
				}else {
					if (ale %2==0) {
						System.out.println("Resultado Nº"+ale+" Par (Pierde)");
					}else {
						System.out.println("Resultado Nº"+ale+" Impar (Pierde)");
					}
				 }
				
			}
			if (saldo<=0) {
	 			System.out.println("No le queda más dinero");
	 			break;
	 		}

 			System.out.println("¿Desea continuar (S/N)?");
	 		continuar=sc.next().charAt(0);
	 		Character.toUpperCase(continuar);
	 		if (continuar=='n') break;
	 	
	 	}while(continuar=='s' || continuar=='n');
	 	System.out.println("Su resultado final es "+saldo+ " Euros");
		System.out.println("Muchas gracias por jugar con nosotros.");
		
		
		/*int aleatorio=0;
		aleatorio= (int) (Math.random() * 100);
		System.out.println(aleatorio) ;
		
		int ale=0;
		Random r=new Random();
		ale=(int)(r.nextDouble()*100);
		System.out.println(ale);*/
	}

}
