import java.util.Scanner;

public class ahorcado {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String palabra="Star Wars";
		String pista="Película";
		char palabrafinal[]=new char [palabra.length()];
	

		int espacio=palabra.indexOf(" ");
		for (int i = 0; i < palabrafinal.length; i++) {
			palabrafinal[i]='-';
			if(espacio>=0)
			palabrafinal[espacio]=' ';
		}
		int error=0;
		boolean acierto=false;
		char letra;
	
		System.out.print(pista+" a Adivinar:");
		System.out.println(palabrafinal);
		do {
			System.out.println("Introduce una letra:");
			letra=sc.next().charAt(0);
			 
				
			for(int i=0;i<palabra.length()-1 ;i++) {
				if(palabra.substring(i,i+1)==letra.toCharArray();) {
					
				}
			}
			if(palabra.indexOf(letra)>=0) {
			int letraesta=palabra.indexOf(letra);
			palabrafinal[letraesta]=letra;
			}else error++;
		
			
			System.out.print(pista+" a Adivinar:");
			System.out.print(palabrafinal);
			System.out.print("> ERROR:");
			mostrarError(error);
			System.out.println();
			
			
		}while(error<8);
	}

	private static void mostrarError(int error) {
		switch(error) {
		case 1:System.out.println("A");break;
		case 2:System.out.println("AH");break;
		case 3:System.out.println("AHO");break;
		case 4:System.out.println("AHOR");break;
		case 5:System.out.println("AHORC");break;
		case 6:System.out.println("AHORCA");break;
		case 7:System.out.println("AHORCAD");break;
		case 8:System.out.println("AHORCADO");break;
		}
	}

}
