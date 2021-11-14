package ALMACÉN;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

import javax.naming.InitialContext;

public class almacen {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int tamaño;
		int opcion;
		System.out.println("De que tamaño desea el almacén");
		tamaño=sc.nextInt();		
		int [] almacen= new int [tamaño];
		init(almacen);
		
		do {
			mostarMenu();
			opcion=sc.nextInt();
			ejecutarOpcion(opcion, almacen);
			System.out.println();
			
		}while(opcion!=0);
		
	
		
		
		

	}
	//Inicializar la tabla a 0
	public static void init (int almacen[]){
		for (int i = 0; i < almacen.length; i++) {
			almacen[i] = 0;
		}
	}
	//Mostrar el menú
	public static void mostarMenu () {
		System.out.println("--- MENÚ DE  CONTROL DEL ALMACÉN -----");
		System.out.println(" 1.- Mostrar contenido del Almacén");
		System.out.println(" 2.- Poner un Valor  ");
		System.out.println(" 3.- Buscar un Valor ");
		System.out.println(" 4.- Borrar un Valor");
		System.out.println(" 5.- Contar posiciones ocupadas.");
		System.out.println(" 6.- Contar posiciones libres.");
		System.out.println(" 0.- Terminar");
            System.out.print(" Introduzca una opción:[1-6]:");
	}
	//Mostrar el almacen
	public static void mostrarAlmacen (int tabla []) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i]+", ");
		}
	}
	//Poner un valor
	public static boolean ponerValor (int num, int tabla []) {
		for (int i = 0; i < tabla.length; i++) {
			if(tabla[i]==0) {
				tabla[i]=num;
				System.out.println("Insertado en la posición "+i);
				return true;
			}
		}
		System.out.println("Esta lleno");
		return false;
	}
	//Buscar un valor
	public static boolean buscarValor (int num, int tabla []) {
		for (int i = 0; i < tabla.length; i++) {
			if(tabla[i]==num) {
				System.out.println("Encontrado en la posición "+i);
				return true;
			}
		}
		System.out.println("No encontrado");
		return false;
	}
	//Borrar un valor
	public static boolean borrarValor (int num, int tabla []) {
		for (int i = 0; i < tabla.length; i++) {
			if(tabla[i]==num) {
				tabla[i]=0;
				System.out.println("Borrado");
				return true;
			}
		}
		return false;
	}
	//Posiciones ocupadas
	public static int posOcup (int tabla[]) {
		int cont=0;
		for (int i = 0; i < tabla.length; i++) {
			if(tabla[i]!=0)cont++;
		}
		return cont;
	}
	//Posiciones libres
	public static int posLibres (int tabla[]) {
		int cont=0;
		for (int i = 0; i < tabla.length; i++) {
			if(tabla[i]==0)cont++;
		}
		return cont;
	}
	
	//Ejecutar la opción
	public static void ejecutarOpcion (int opcion,int tabla[]) {
		Scanner sc=new Scanner (System.in);
		
		switch (opcion) {
		case 1:mostrarAlmacen(tabla);break;
		case 2:int num=0;
		System.out.println("Introduzca el valor que desea insertar");
		num=sc.nextInt();
			ponerValor(num, tabla); break;
		case 3:int num1=0;
		System.out.println("Introduzca el valor que desa buscar");
		num1=sc.nextInt();
			buscarValor(num1, tabla);break;
		case 4:int num2=0;
		System.out.println("Introduzca el valor que desea eliminar");
		num2=sc.nextInt();
			borrarValor(num2, tabla);break;
		case 5:System.out.println("Hay "+posOcup(tabla)+" posiciones ocupadas");break;
		case 6:System.out.println("Hay "+posLibres(tabla)+" posiciones libres");
		}
	}
	
	

}
