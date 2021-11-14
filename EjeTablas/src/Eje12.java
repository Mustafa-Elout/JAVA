
public class Eje12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t1 [] = { 3,2,5,6,10,1};
		int t2 [] = { 3,2,5,6,10,1};
		int t3 [] = { 6,5,11 };
		int t4 [] = { 2,3,6,5,1,10};
		
		
		/*
		 * t1 y t2, son iguales, incluidas y equivalente
		 * t3 y t1, no son iguales, t3 esta incluida en t1, no son equivalentes
		 * t4 y t1, no son iguales, si estan incluidas y si son equivalentes
		 */

		System.out.println(" Son iguales t1 y t2 "+ Iguales(t1,t2));
		System.out.println(" Son iguales t3 y t1 "+ Iguales(t3,t1));
		System.out.println(" Son iguales t4 y t1 "+ Iguales(t4,t1));
		
		System.out.println(" Está incluida t1 en t2 "+ Incluido (t1,t2));
		System.out.println(" Está incluida t3 en t1 "+ Incluido (t3,t1));
		System.out.println(" Está incluida t4 en t1 "+ Incluido (t4,t1));
		
		System.out.println(" Son equivalesntes t1 y t2 " + Equivalentes (t1,t2));
		System.out.println(" Son equivalesntes t3 y t2 " + Equivalentes (t3,t2));
		System.out.println(" Son equivalentes t4 y t1 " + Equivalentes (t4,t1));
	}

    //	Devuelve verdadero, si ambas tablas tienen
	// el mismo tamaño y todos los elementos de Ta tienen el mismo valor y posición en la tabla Tb.
	
	static boolean Iguales ( int Ta[ ], int Tb[ ]){
	boolean resu= true;
	for (int i = 0; i < Tb.length; i++) {
		if (Ta[i] != Tb[i]) {
			resu=false;
			break;
		}
	}
	
	 return resu;
	}
	// Devuelve verdadero, si todos los elementos de  Ta,
	// aparecen en la tabla Tb, aunque estén en otras posiciones.

	static boolean Incluido ( int Ta[ ], int Tb[ ]){
	 boolean resu=true;
	 for (int i = 0; i < Ta.length; i++) {
		 int valor=Ta[i];
		 boolean esta=false;
		 for (int j = 0; j < Tb.length; j++) {
				if (valor==Tb[j]) {
					esta=true;
					break;
				}
			}
		 if (esta==false)
			 resu=false;break;
	}
		
	return resu;	
	}
	
	// Devuelve verdadero, si todos los elementos de Ta están en Tb 
	// y todos los de Tb están en Ta.
	static boolean Equivalentes (int Ta[ ], int Tb[ ]){
		
		
	return Incluido(Ta, Tb)&& Incluido(Tb,Ta);	
	}
	
}
