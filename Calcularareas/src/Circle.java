
public class Circle extends Shape{
	int ancho;
	

		
	public Circle(int ancho) {
		super();
		this.ancho = ancho;
	}



	void area() {
		double area=Math.PI*ancho*ancho;
		System.out.println(area);
	}

}
