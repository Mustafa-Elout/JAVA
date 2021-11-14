
public class PruebaContraseña {

	public static void main(String[] args) {
		Password [] tablaDePasword=new Password [2];
		System.out.println("hola");
		//He intentado hacerlo mediante el bucle pero tenía un error tonto que no lo he encontrado
		Password contraseña1=tablaDePasword[0]= new Password("12345");
		Password contraseña2=tablaDePasword[1]= new Password("M23iesm20x");

		contraseña2.esFuerte();
	}

}
