/*
 *  Simulación sencilla de una carrera de coches
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class CarreradeCoches {
	
	public static void main(String[] args) {
			
		Random valor = new Random();  // Variable que me genera números aleatorios
		final int META = 1500; // 500 kilómetros		
		
	
		ArrayList <Coche> parrillal = new ArrayList<Coche>();
		
		parrillal.add (new Coche ("Ferrari",300));
		parrillal.add (new Coche ("600",100));
		parrillal.add (new Coche ("BMW",220));
		parrillal.add (new Coche ("Seat",150));
		parrillal.add (new Coche ("La Cabra",10));
		
		// Test de pruebas para comporbar la detección de errores
	
		Coche c1 = parrillal.get(0);
		Coche c2 = parrillal.get(1);
		c1.acelera(10);
		c2.frena(20);
		c1.parar();
		c2.recorre();
	
		
		// Arranquen los motores
		for (Coche c: parrillal) {
			c.arrancar();
		}
		
		// Comienza la carrera
		
		do {
			for (int i = 0; i < parrillal.size(); i++) {
				parrillal.get(i).acelera(valor.nextInt(30));
				parrillal.get(i).recorre();
				parrillal.get(i).frena(valor.nextInt(10));
				System.out.println(parrillal.get(i).info());
			}
			System.out.println("----------------------------------------");
				
		} while ( ! alcanzarMeta ( parrillal, META) );

		// Ordena la tabla para mostrar la clasificación
	    Collections.sort(parrillal);
		
	    
		// Muestra la clasificación
		for(int i=0; i< parrillal.size(); i++){
			System.out.println((i+1)+"º Clasificado "+ parrillal.get(i).info());
		}
		
	
	}








	// MÉTODOS AUXILIAREs
	// Devuelve verdadero si hay algun coche que haya recorrido la distancia indicada.
	
	static public boolean alcanzarMeta (Collection <Coche> coches, int distancia){
		boolean fin = false;
		for (Coche c:coches) {
		     if ( c.getKilometros() >= distancia ){
		    	 fin = true;
		    	 break;
		     }
		}
		return fin;
	}
	
	// Ordeno por el método de la burbuja, no es le mejor pero si el más
	// sencillo
	static void ordenarClasificacion ( Coche tcoches[]){
	   
	 for ( int i = 0; i < tcoches.length-1; i++) {
	     for (int j=0; j < tcoches.length-i-1; j++){
				// Si no esta ordenado realizo el intercambio
				if ( tcoches[j].getKilometros() < tcoches[j+1].getKilometros()){
					Coche aux = tcoches[j];
					tcoches[j] = tcoches[j+1];
					tcoches[j+1] = aux;
				}
			}
	    }	
	}
}
	



