import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double pi=Math.PI;
		System.out.println(pi);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		Square a = new Square(x);
		Circle b = new Circle(y);
		a.area();
		b.area();

	}

}
