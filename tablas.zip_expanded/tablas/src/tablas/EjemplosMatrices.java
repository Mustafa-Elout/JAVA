package tablas;

import java.util.Scanner;
/**
 * Ejemplos básicos sobre matrices, arrays bidimensionales
 * @author alberto
 *
 */
public class EjemplosMatrices {
	
	/**
	 * Prueba los distintos métodos sobre matrices
	 * @param argv
	 */
	public static void main ( String [] argv){
		
		
		int cifras[][] = new int [10][5]; // 10 filas y 5 columnas
		Scanner sc = new Scanner(System.in);
		
		// Ejemplo de sobrecarga en el nombre de un método
		rellenarMatriz(cifras);
		muestraValores(cifras);
		
		rellenarMatriz(cifras,8);
		muestraValores(cifras);
		
		rellenarMatriz(cifras,20,50);
		muestraValores(cifras);
		
		System.out.print("Introduce un valor a buscar:");
		int valor = sc.nextInt();
		
		boolean encontrado = false;
		int i=0,j=0;
		
		// BUSQUEDA DE UN ELEMENTO EN UNA MATRIZ
		for (i=0;i < cifras.length; i++){
			for (j=0; j< cifras[i].length; j++)
				if ( valor == cifras[i][j]){
					encontrado = true;
					break; // Salgo de este ciclo
				}
		   if (encontrado) break; // Salgo de este ciclo
		}
		if ( encontrado) System.out.printf("El elemento está en la posición :[%d][%d]\n",i,j);
		else System.out.println("El elemento no se encuentra.");
		
		
		// Prueba la suma de columnas
		int vsumas[] = sumaColumnas( cifras);
		
		System.out.print("SUMA =");
		for  (i=0; i< vsumas.length; i++) System.out.printf("%4d  ",vsumas[i]);	
		
		System.out.println();
		// PRUEBAS SI UNA MATRIZ ES SIMETRIA
		int matriztest1 [][] = { { 2, 5, 3, 6 },
							  	 { 5, 7, 8, 1 },
							 	 { 3, 8, 5, 4 },
								 { 6, 1, 4, 9 }
							   };  // Matriz simetrica tabla(i,j) = tabla (j,i)
		int matriztest2 [][] = { { 2, 5, 3, 6 },
								 { 5, 7, 8, 0 },
								 { 1, 8, 5, 4 },
								 { 6, 1, 4, 9 }
			   					};  // Matriz no simetrica;

		muestraValores(matriztest1);
		if ( esSimetrica( matriztest1)) System.out.println("1º Es simétrica");
					else System.out.println("1º No es simétrica");
		
		muestraValores(matriztest1);
		if ( esSimetrica( matriztest2)) System.out.println("2º Es simétrica");
					else System.out.println("2º No es simétrica");
		
		
		// PRUEBA EL MÉTODO PAR E IMPAR
		
		int valores [] = { 10, 5, 2,3,6, 12, 23, 8, 6 ,4 };
		
		int tablaparImpar[][] =  separaParImpar( valores);
		
		System.out.println("\nPARES");
		for  (i=0; i< tablaparImpar[0].length; i++) System.out.printf("%4d  ",tablaparImpar[0][i]);	
		
		System.out.println("\nIMPARES");
		for  (i=0; i< tablaparImpar[1].length; i++) System.out.printf("%4d  ",tablaparImpar[1][i]);	
		
		
		sc.close();
		
		
	    int resultados[][] = new int[3][];
	    int tvalores1[] = { 10,23,45};
	    int tvalores2[] = { 8, 134,12, 5, 1003, 4534};
	    
	    resultados[0] = new int [2];
	    resultados[0][0] = 123;
	    resultados[0][1] = 20;	    
	    resultados[1] = tvalores1;
	    resultados[2] = tvalores2;
	    
	    muestraValores(resultados);
		
	    
	}	
		
	// METODOS A PROBAR
	
	/**
	 *  Rellena la matriz pasada como parámero el valor 0
	 *   
	 * @param matriz - Matriz a rellenar con el valor 0
	 */
    
	public static void rellenarMatriz ( int [][] matriz){
		
		for (int i=0; i< matriz.length; i++){
			for (int j=0; j< matriz[i].length; j++){
				matriz [i][j] = 0;
				}
			}
	}
	/**
	 * Rellena todos los elementos de la matriz con el valor indicado
	 * @param matriz - matriz a rellenar
	 * @param valor  - valor a almacenar
	 */
	public static void rellenarMatriz ( int [][] matriz, int valor){
		
		for (int i=0; i< matriz.length; i++){
			for (int j=0; j< matriz[i].length; j++){
				matriz [i][j] = valor;
				}
			}
	}
	
	
	/**
	 * Rellena la matriz con valores aleatorios entre min y max
	 * @param matriz  - Matriz a rellenar
	 * @param valorMin - Valor mínimo
	 * @param valorMax - Valor máximo
	 */
	public static void rellenarMatriz ( int [][] matriz, int valorMin, int valorMax ){
				
		for (int i=0; i< matriz.length; i++){
			for (int j=0; j< matriz[i].length; j++){
				matriz [i][j] = (int)(valorMin + Math.round(Math.random()*(valorMax-valorMin))); 
				}
			}
	}
		
	
	public static void muestraValores (int [][] matriz){
		// Muestro los valores que tiene la tabla
		System.out.println("\n MOSTRANDO VALORES DE LA MATRIZ:");
		System.out.print("+     ");
		for (int i=0; i< matriz[0].length; i++) System.out.printf("%4d  ",i);
		System.out.println();
		for (int i=0; i< matriz.length; i++){
			        System.out.printf("|%4d ",i);			
					for (int j=0; j< matriz[i].length; j++){
						System.out.printf("%4d, ",matriz [i][j]); 
						}
					System.out.println();
				}
	}

	public static int [] sumaColumnas ( int [][] matriz){
		// SUMA DE LOS ELEMENTOS DE LA MATRIZ
		// Creo un vector con el número de columnas de la matriz cifras
		int [] nuevo = new int [matriz[0].length];
				
				for (int columna=0; columna < nuevo.length; columna++){
					nuevo[columna] = 0;
					for (int fila = 0; fila< matriz.length; fila++ ){
						nuevo[columna] = nuevo[columna] + matriz[fila][columna];
					}
				}
		return nuevo;
	}
	
	public static boolean esSimetrica ( int [][] matriz){
		boolean resultado = true;
	    /* Sólo pregunto si los elementos debajo de la diagonal son  igualeS a los de arriba */
		for (int i=1; i< matriz.length;i ++){
			for (int j = 0; j < i; j++){
				if ( matriz[i][j] != matriz[j][i]){
					resultado = false;
					break;
				}
			}
		}	
		return resultado;		
	}
	
	/**
     *  Recibe como parámetro un array y genera una tabla con dos filas, una de pares 
     *  y otra de impares
     * 
     * @vector  - array de enteros
     * @return  - tabla con pares en una primera fila e impares en la segunda
       */
    public static  int[][] separaParImpar(int vector [])
    {
        int resu [][];
        // Creo una matriz con dos filas vacias
        resu = new int [2][];
        int contpares   = 0;
        int contimpares = 0;
        // Cuento el numero de pares/impares para calcular el tamaño
        for (int valor: vector){
          if ( valor % 2 == 0) contpares++;
             else contimpares++;
        }
        // Asigno a cada fila su tamaño correspondiente
        resu[0] = new int [contpares];
        resu[1] = new int [contimpares];
        int idexpares   =0;
        int ideximpares =0;
        for (int valor: vector){
          if ( valor % 2 == 0) {
              resu[0][idexpares++] = valor;
             }
             else {
              resu[1][ideximpares++] = valor;
             }
        }
        
        return resu;
    }
}
	

