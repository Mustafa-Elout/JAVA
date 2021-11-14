package Pruebas;

public class prueba1 {

	public static void main(String[] args) {
		fecha f;
		f=new fecha(18, 2, 2021);
		System.out.printf("Hoy es día: ");
		f.imprimir();
		System.out.println();
		fecha f1 = new fecha(17, 2, 2021);
		fecha f2 = new fecha(17, 2, 2021);
		if(f1.igualA(f2)) {
			System.out.println("Son iguales");
		}	
	}

}
