import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Eje02 {

	public static void main(String[] args) throws IOException {
		
		File fichero=new File("src/holapepe.txt");
		if(!fichero.exists()) {
			System.out.println("No exixte el fichero");
			return;
		}
		Scanner scf=new Scanner(fichero);
		while(scf.hasNextLine()) {
			String linea=scf.nextLine();
			String cadena="";
			for(int i=linea.length()-1;i>=0;i--) {
				cadena+=linea.charAt(i);
			}
			System.out.println(cadena);
			
		}
		scf.close();
	}

}
