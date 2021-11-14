import java.util.Random;
import java.util.ArrayList;

public class Eje03 {

	public static void main(String[] args) {
		
		Random rd= new Random();
		
		int tamaño = rd.nextInt(11)+10; //Entre 10 y 20
		
		ArrayList <Integer> al =new ArrayList <Integer>();
		
		//Introducir valores aleatorios
		for (int i=1; i<=tamaño;i++) {
			Integer valor =rd.nextInt(101);
			al.add(valor);
		}
		System.out.println(al);
		
		int suma=0;
		for (Integer valor:al) {
			suma+=valor;
		}
		System.out.println(" Suma de valores = "+ suma);
		
		al.removeIf(valor -> valor%2==0);
		System.out.println(al);
		
		for (int i=0;i< al.size();i++) {
			int valor= al.get(i);
			if(valor%3==0) {
				al.set(i, 0);
			}
		}
		System.out.println(al);
		
		for (int i=0;i< al.size();i++) {
			int valor= al.get(i);
			if(valor%5==0) {
				al.add(i, 555);
				i++;
			}
		}
		System.out.println(al);
	}

}
