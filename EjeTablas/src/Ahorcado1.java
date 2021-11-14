import java.util.Scanner;

public class Ahorcado1 {

	public static void main(String[] args) {
		String mensaje="AHORCADO";
		String palabra;
		String palabraAdivinar;
		String pista;
		StringBuilder listaletras = new StringBuilder();
		Scanner sc = new Scanner (System.in);
		
		int maxfallos=mensaje.length();
		int conterrores=0;
		boolean acierto=false;
		
		System.out.println("Introduce el título de la película");
		palabra=sc.nextLine();
		System.out.println("Introduce la pista");
		pista=sc.nextLine();
		
		palabraAdivinar=verCadenaSecreta(palabra,listaletras.toString());
		System.out.println(pista+" a Adivinar :"+palabraAdivinar+" ERROR:");
		

	}
	static public String verCadenaSecreta (String cadena, String listaletras) {
		StringBuilder cadenaresu=new StringBuilder();
		
		for (int i = 0; i < cadena.length(); i++) {
			char letra=cadena.charAt(i);
			if((letra==' ') || listaletras.indexOf(Character.toUpperCase(letra))!=-1 
					|| listaletras.indexOf(Character.toLowerCase(letra))!=-1) {
				cadenaresu.append(letra);
			}else {
				cadenaresu.append('-');
			}
					
		}
		return cadenaresu.toString();
		
	}

}
