
public class PilaEnteros {
	
	int valores [];
	int contValores;

	
	public PilaEnteros (int tamaño) {
		valores=new int[tamaño];
		contValores=-1;
	}
	
	public boolean push (int valor) {
		if(contValores<valores.length) {
			contValores++;
			valores[contValores]=valor;
			return true;
		}
		
		return false;
	}
	
	public int pop() {
		int valorDestruir;
		if(contValores==-1) {
			return -1;
		}
		valorDestruir=valores[contValores];
		valores[contValores]=0;
		contValores--;
		System.out.println("este es el valor que destruimos--> " +valorDestruir);
		return valorDestruir;
	}
	
	public int peek() {
		if(contValores==-1) {
			return -1;
		}
		System.out.println("este es el último valor introducido-->"+valores[contValores]);
		return valores[contValores];
	}
	
	public boolean estaLleno(){
		if(contValores==valores.length) {
			return true;
		}
		return false;
	}
	
	public boolean estaVacio(){
		if(contValores==-1) {
			return true;
		}
		return false;
	}
	
}
