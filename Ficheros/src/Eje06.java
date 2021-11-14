import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Eje06 {

	public static void main(String[] args) throws IOException {
		File fichero=new File ("src/holapepe.txt");
		if(!fichero.exists()) {
			System.out.println("El fichero no existe");
		}
		
		Scanner sc = new Scanner (fichero);
		Scanner scf=new Scanner(System.in);
		
		System.out.println("Cuantas líneas del final desa ver");
		int LineasLeer;
		LineasLeer=scf.nextInt();

		
		
		sc.close();
	}
	

}
