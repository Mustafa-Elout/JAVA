package tablas;

public class EjemploTresEnRaya {
	// Defino un tipo enumerado con los tres valores posibles
	enum Fichas  { ROJO,AZUL,LIBRE};
	
	static public void main ( String []argv){
		
	// Creo una matriz con un estado de la partida.
	Fichas tablero [][] = { {Fichas.ROJO, Fichas.ROJO, Fichas.AZUL },
							{Fichas.ROJO, Fichas.AZUL, Fichas.LIBRE},
							{Fichas.ROJO, Fichas.LIBRE,Fichas.LIBRE}
						};
	// Compruebo si las rojas ganan
	if ( esGanador( tablero, Fichas.ROJO)) System.out.println(" ROJO GANADOR"); 
						else System.out.println(" ROJO NO GANADOR");
	
	}
	
	public static boolean esGanador ( Fichas t[][], Fichas color){
	  
	  // Compruebo filas y columnas
	  for (int i=0; i < 3; i++){
		  if ( ( t[i][0] == color) &&  (t[i][1] == color) &&  (t[i][2] == color) ||
               ( t[0][i] == color) &&  (t[1][i] == color) &&  (t[2][i] == color) )
                return true; // Ganador
	  }
	  // Compruebo diagonales
	  if ( ( t[0][0] == color) &&  (t[1][1] == color) &&  (t[2][2] == color) ||
      	   ( t[0][2] == color) &&  (t[1][1] == color) &&  (t[2][0] == color) ){
		  return true; // Ganador  
	  }
      // Si no ha terminado es que no es ganador
	  return false;
	}	

	
}
