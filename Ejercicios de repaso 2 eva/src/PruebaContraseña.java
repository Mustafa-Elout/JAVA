
public class PruebaContrase�a {

	public static void main(String[] args) {
		Password [] tablaDePasword=new Password [2];
		System.out.println("hola");
		//He intentado hacerlo mediante el bucle pero ten�a un error tonto que no lo he encontrado
		Password contrase�a1=tablaDePasword[0]= new Password("12345");
		Password contrase�a2=tablaDePasword[1]= new Password("M23iesm20x");

		contrase�a2.esFuerte();
	}

}
