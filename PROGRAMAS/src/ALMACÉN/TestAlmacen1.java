package ALMAC�N;

import java.util.Scanner;

public class TestAlmacen1 {

	static public void main(String[] argv) {

		Almacen1 prueba = new Almacen1();
		Scanner sc = new Scanner(System.in);
		int opcion;
		int tama�o;
		tama�o=sc.nextInt();
		
		
		mostrarMenu();
		opcion = sc.nextInt();
		while (opcion != 0) {
			procesarOpcion(opcion, prueba);
			mostrarMenu();
			opcion = sc.nextInt();
		}
		sc.close();
		
	}

	static void mostrarMenu() {
		System.out.println("--- MEN� DE  CONTROL DEL ALMAC�N -----");
		System.out.println(" 1.- Mostrar contenido del Almac�n");
		System.out.println(" 2.- Poner un Valor  ");
		System.out.println(" 3.- Buscar un Valor ");
		System.out.println(" 4.- Borrar un Valor");
		System.out.println(" 5.- Contar posiciones ocupadas.");
		System.out.println(" 6.- Contar posiciones libres.");
		System.out.println(" 0.- Terminar");
            System.out.print(" Introduzca una opci�n:[1-6]:");
	}

	// Procesa la opci�n introducida operando sobre el objeto Almacen1
	static void procesarOpcion(int opcion, Almacen1 parAlmacen) {
		// Completar......
		
		switch (opcion) {
		case 1:System.out.println(parAlmacen.toString());break;
		case 2:
		case 3:
		case 4:
		case 5: 	
		case 6:
		  
		}

	}

}
