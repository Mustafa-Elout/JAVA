package tablas;

public class EjemploTresEnRaya2 {
	// Defino un tipo enumerado con los tres valores posibles
	enum Fichas {
		ROJO, AZUL, LIBRE
	};

	static public void main ( String []argv){
		
	// Creo una matriz con un estado de la partida.
	Fichas tablero [][] = { {Fichas.ROJO, Fichas.ROJO, Fichas.AZUL },
							{Fichas.ROJO, Fichas.AZUL, Fichas.LIBRE},
							{Fichas.ROJO, Fichas.LIBRE,Fichas.LIBRE}
						};
	// Compruebo si las rojas ganan
	for (int i=1; i < 50; i++) {
		
		verTablero(tablero);
		if ( esGanador( tablero, Fichas.ROJO)){
			System.out.println(" GANA EL ROJO");
		}
			else 
		if ( esGanador( tablero, Fichas.AZUL)){
			System.out.println(" GANA EL AZUL");
		}
			else {
				System.out.println(" No hay ganador");
			}
		generarTablero(tablero);
		
	   }
	
	}

	public static boolean esGanador(Fichas t[][], Fichas color) {

		// Compruebo filas y columnas
		for (int i = 0; i < 3; i++) {
			if ((t[i][0] == color) && (t[i][1] == color) && (t[i][2] == color)
					|| (t[0][i] == color) && (t[1][i] == color) && (t[2][i] == color))
				return true; // Ganador
		}
		// Compruebo diagonales
		if ((t[0][0] == color) && (t[1][1] == color) && (t[2][2] == color)
				|| (t[0][2] == color) && (t[1][1] == color) && (t[2][0] == color)) {
			return true; // Ganador
		}
		// Si no ha terminado es que no es ganador
		return false;
	}

	// El generador no es del todo correcto.
	// Puede existir a la vez dos ganadores ROJO y AZULE
	public static void generarTablero(Fichas t[][]) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int num = (int) Math.round(Math.random() * 2);
				switch (num) {
				case 0:
					t[i][j] = Fichas.AZUL;
					break;
				case 1:
					t[i][j] = Fichas.ROJO;
					break;
				case 2:
					t[i][j] = Fichas.LIBRE;
					break;
				}
			}
		}
	}

	public static void verTablero(Fichas t[][]) {

		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				// los enumerados se convierten a String automáticamente
				System.out.print(t[i][j] + " ");
			}
		}
		System.out.println();
	}

}
