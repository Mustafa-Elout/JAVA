import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Eje03 {

	public static void main(String[] args) throws IOException {
		File fl=new File ("src/holapepe.txt");
		File fe=new File ("src/copiaholapepe.txt");
		
		Scanner sc=new Scanner(fl);
		PrintWriter pw=new PrintWriter(fe);
		
		String linea;
		while(sc.hasNextLine()) {
			linea=sc.nextLine();
			pw.println(linea);
		}

		pw.close();
		sc.close();
		System.out.println("Copiado");
	}

}
