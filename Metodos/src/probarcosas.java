import java.util.Random;
import java.util.Scanner;

public class probarcosas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int fichaordenador;
		Random r=new Random();
		fichaordenador=(int)(r.nextDouble()*500+1);
		System.out.println(fichaordenador);
	}

}
