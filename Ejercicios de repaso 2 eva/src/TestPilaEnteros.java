
public class TestPilaEnteros {

	public static void main(String[] args) {
		PilaEnteros p=new PilaEnteros(5);
		p.push(5);
		p.push(6);
		p.pop();
		p.push(7);
		p.push(4);
		p.peek();
		p.estaLleno();
		p.estaVacio();
	}

}
