import java.util.Scanner;

public class minibancojava {
static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int saldo;
		int orden=0;
		do
		{
			mostrarMenu();
			orden=elegirOrden(orden);
			procesarOrden(orden);
		}while (orden!=4);
	}
	//Mostrar el menú
	public static void mostrarMenu()
	{
		System.out.println("MI BANCO JAVA");
		System.out.println("1.- Inicializar Cuenta ");
		System.out.println("2.- Realizar Ingreso ");
		//System.out.println("3.- Realizar Reintegro ");
		System.out.println("3.- Mostrar Saldo ");
		System.out.println("4.- Terminar ");
		System.out.println("Elegir opción [1-5]:");
	}
	//Eleguir la opción
	public static int elegirOrden (int numero)
	{
		numero=sc.nextInt();
		return numero;
	}
	
	//Procesar la orden
	
	public static void procesarOrden(int saldo)
	{  
		switch (orden)
		{
		case 1: saldo = initCuenta(); break;
    	case 2: saldo = realizarIngreso(saldo); break;
    	case 3: mostrarSaldo(saldo);break;
    	case 4: terminar(); break;
    	default: System.out.println("Opción errónea.");
		}
	}
	//iniciar la cuenta

	public static int initCuenta()
	{
		System.out.println("Indique cual va a ser su saldo actual");
		int nuevosaldo;
		nuevosaldo=sc.nextInt();
		while (nuevosaldo<=0)
		{
			System.out.println("Operación no permitida");
			nuevosaldo=sc.nextInt();
		}
		return nuevosaldo;
	}
	//Realizar ingreso
	public static int realizarIngreso (int saldoactual)
	{
		int cantidad;
		System.out.println("Indique que cantidad desea ingresar");
		cantidad=sc.nextInt();
		if (cantidad<=0)
		{
			System.out.println("Operración no permitida, su ingreso debe"
					+ "ser mayor que 0 euros");
		}else
		{
			saldoactual+=cantidad;
		}
		return saldoactual;
	}
	//para ver el saldo
	
	public static void mostrarSaldo (int saldoactual)
	{
		System.out.println("Susaldo actual es de " + saldoactual + " euros");
	}
	//Finalizar
	
	public static void terminar()
	{
		System.out.println("Hasta la próxima");
	}
}
