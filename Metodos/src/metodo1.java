
public class metodo1 {

	public static void main(String[] args) {
		/*1.- Escribir el método mostrarTablaMultiplicar y que muestre por pantalla la tabla de multiplicar del número recibido como parámetro.
		 *   Escribir un programa que pruebe la función.
		 */
		//mostrarTablaMultiplicar(5);
		/*
		 * 3.- Una función llamada calcFactorial que reciba como parámetro un número entero y que 
		 * me devuelve el calculo del factorial.  Factorial de 5, 5! = 5x4x3x2x1
		 */
		calcFactorial(5);
	}
    //Ejercicio 1
	public static void  mostrarTablaMultiplicar ( int num )
	{
	System.out.println("Tabla de multiplicar del" + num);
		for (int i=1; i<=10;i++)
		{
			System.out.println(num + " x " + i + " = " + i*num);
		}
	}
	//Ejercicio 3
	static int calcFactorial ( int numero)
	{
		int factorial=1;
		System.out.print("Factorial de "+ numero +","+numero+"!=");
		while ( numero!=0) {
			  factorial=factorial*numero;
			  if (numero>1)
			  {
			  System.out.print(numero + "x");
			  }
			  else
			  {
				  System.out.print(numero);
			  }
			  numero--;
			}
		System.out.println("="+factorial);
		
		return numero;
		
	}
}
