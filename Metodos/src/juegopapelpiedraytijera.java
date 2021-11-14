import java.util.Random;
import java.util.Scanner;

public class juegopapelpiedraytijera {

	static final int PIEDRA = 1;
	static final int PAPEL  = 2;
	static final int TIJERA = 3;
	public static void main(String[] args) {
		int fichajugador;
		int fichaordenador=0;
		int contPartidasGanadasJugador=0;
		int contpartidasganadasordenador=0;
		char continuar=0;
		
	Scanner sc=new Scanner (System.in);
	/*
	 * Hay cosas que no se como utilizar, por ejemplo lo que nos has
	 * dicho de lo de arriba, líneas 6,7,8
	 */
		
		System.out.println("EL JUEGO DE PIEDRA/PAPEL/TIJERA");
		do
		{
			System.out.println("Iroduzca tu jugada usuario");
			fichajugador=sc.nextInt();
			System.out.println("Iroduzca tu jugada ordenador");
			int aleatorio;
			/*Aquí creo un número aleatorio entre 1o5 para trucar el juego
			 * unas veces y otras no.
			 */
			Random r=new Random();
			aleatorio=(int)(r.nextDouble()*5+1);
			//Esta es la parte aleatoria
			if(aleatorio%2==0) {
			fichaordenador=generarValor ( fichaordenador, fichajugador);
			System.out.println(fichaordenador);
			}else {
				//Esta es la parte trucada
				fichaordenador=(int)(r.nextDouble()*3+1);
				System.out.println(fichaordenador);
			}
			calcularGanador(fichajugador, fichaordenador);
			/*
			 * En esta parte es para imprim el resultado
			 */
			if (calcularGanador(fichajugador, fichaordenador)==1) {
				System.out.println( "El usuario gana porque " +fichajugador+ " gana a "+fichaordenador);
				contPartidasGanadasJugador++;
			}
			if (calcularGanador(fichajugador, fichaordenador)==2) {
				System.out.println( "El ordenador gana porque " +fichajugador+ " gana a "+fichaordenador);
				contpartidasganadasordenador++;
			}
			if (calcularGanador(fichajugador, fichaordenador)==0) {
				System.out.println( "Ninguno gana " + fichajugador + " y " +fichaordenador);
			}
			
			
			System.out.println("¿Quiere continuar?");
			continuar=sc.next().charAt(0);
			
		}while (continuar == 's');
		System.out.println("Partidas ganadas por el ordenador "+contpartidasganadasordenador);
		System.out.println("Partidas ganadas por el usuario " + contPartidasGanadasJugador);
	}
	static int calcularGanador (int jugador1, int jugador2)
	{
		int ganador=0;
		if (jugador1==jugador2) {
			ganador=0;
		}
		if (jugador1==1 && jugador2==3) {
			ganador=1;
		}
		if (jugador1==1 && jugador2==2) {
			ganador=2;
		}
		if (jugador1==3 && jugador2==1) {
			ganador=2;
		}
		if (jugador1==1 && jugador2==3) {
			ganador=1;
		}
		if (jugador1==2 && jugador2==1) {
			ganador=1;
		}
		if (jugador1==2 && jugador2==3) {
			ganador=2;
		}
		if (jugador1==3 && jugador2==2) {
			ganador=1;
		}
		return ganador;
	}
	 static int generarValor (int fichaordenadortrucada, int deljugador) {
		
		 if (deljugador==1){
			fichaordenadortrucada=2;
		 }
		 if (deljugador==3){
				fichaordenadortrucada=1;
			 }
		 if (deljugador==2){
				fichaordenadortrucada=3;
			 }
		 return fichaordenadortrucada;
	 }
	
	

}
