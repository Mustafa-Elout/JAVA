
public class Square extends Shape{
	int ancho;
	
	
	public Square(int ancho) {
		super();
		this.ancho = ancho;
	}

	void area() {
		System.out.println(ancho*ancho);
	}

}
