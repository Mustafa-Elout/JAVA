package excepciones;

import java.util.Scanner;

public class test {
	/**
	 * Aquí tenemos un array en el que tenemos una serie de palabras de lenguaje
	 * obsceno, las cuales no deben utilizarse
	 */

	static String tpalabros[] = {" caca "," culo "," pedo "," pis "};

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tud mensajes, o pulsa . Para finalizar");
		String linea="";
		boolean error;
		do {
			error=false;
			try {
				linea=leerLineaOK (sc);  
				/**
				 * El catch se ejecuta cuadno salta la excepcion en el método
				 * Hemos creado nuestra propia excepcion
				 */
			}catch (BurradasNOException ex) {
				System.out.println("Error no se permite lenguaje obsceno.["+ex.getMessage()+"]");
				error=true;
			}
			if (!error)System.out.println("OK");
		}
		while(!linea.equals("."));
		System.out.println("Fin de programa");
	}
	/**
	 * En este método leemos las palabras que se quieran introducir las comparamos,
	 * si salta la excepción pues ejecutamos el mensaje.
	 * @param sc
	 * @return
	 * @throws BurradasNOException
	 */
	
	public static String leerLineaOK (Scanner sc) throws BurradasNOException{
		String frase=sc.nextLine();
		for(int i=0;i<tpalabros.length;i++) {
			if(frase.indexOf(tpalabros[i])>=0) {
				throw new BurradasNOException (tpalabros[i]);
			}
		}
		return frase;
	}

}
