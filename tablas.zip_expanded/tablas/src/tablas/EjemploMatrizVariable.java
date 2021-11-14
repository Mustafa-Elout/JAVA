package tablas;
/**
 * Ejemplo de manejo de matriz con filas de filas de tamaño variable
 * Puede representar por ejemplo los datos de las oficinas de un edificio, donde
 * en cada planta no tienen el mismo número de oficinas.
 * @author alberto
 *
 */
public class EjemploMatrizVariable {
	public static void main ( String [] argv){
		
		// Edificio de plantas con un número variable de oficinas por plantas
		int edificio[][] = {   { 10,4,3,8,5},         // 1º Planta
				               {  15, 23 },
				               { 90 },
				               { 9,34,15,1},
				               { 6,45,12,3},
				               { 1,34,1,4},
				               { 4,4,124},
				               { 9,14,10,4},
				               { 9,4,10,6},
				               { 9,34,10,4,7,4,2}   // 10 ºPlanta
							};
		
		
		
		// Cambiar para adaptarse a una matriz de tamaño variable
		EjemplosMatrices.muestraValores(edificio);
		
		// Calcula el total de consumo por planta
		int totaledificio =0;
		for ( int i=0; i < edificio.length; i++){
			System.out.printf(" Planta nº %2d:",i+1);
			int totalplanta = 0;
			for (int j=0; j <edificio[i].length; j++){
				totalplanta += edificio[i][j];
			}
			totaledificio += totalplanta;
			System.out.printf("%5d \n",totalplanta);
		}
		System.out.printf(" TOTAL        %5d \n", totaledificio);
		
	
		// Donde está la oficina con valor más alto
		int plantai  = 0;
		int oficinaj = 0;
		int máximo   = edificio[0][0];
		
		for (int i = 0; i < edificio.length; i++) {
			for (int j = 0; j < edificio[i].length; j++) {
			     int valor = edificio[i][j];
				 if ( valor > máximo){
					 máximo = valor;
					 plantai = i;
					 oficinaj = j;
				 }
			}
		}
		System.out.println(" La oficina que con valor máximo "+ máximo+" nº "+ oficinaj +" planta nº "+ plantai);
		
	}	
	 
	   
	
	
}
