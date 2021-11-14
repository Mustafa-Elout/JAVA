public class TestTelefonia {

	public static void main(String[] args) {
		
		Telefono tPepe = new Telefono(885505737,"Motorola");
		Telefono tAna  = new Telefono(660311354,"Mac");
		Telefono tEva  = new Telefono(884123400,"Samsung");
		
		Centralita ctl = new Centralita(10);
		tPepe.conectar(ctl);
		tAna.conectar(ctl);
		// Eva no esta conectada.
		
		Contacto contactoEva   = new Contacto(884123400,"Eva" );
		tPepe.anotarContacto(contactoEva);
		tPepe.anotarContacto( new Contacto(tAna.getNumtelefono(),"Ana" ));
	    tPepe.verAgenda();
		
		tEva.llamar(tPepe.getNumtelefono());  // No está conectada
		
		tPepe.llamar("Ana");     // Llamada OK consultado la agenda
		tPepe.llamar(660311354); // Llamada OK con el Telefono de Ana
		tPepe.llamar("Eva");     // No disponible
		tEva.conectar(ctl);
		tPepe.llamar("Eva");     // Llamada OK consultado la agenda
		
		
		tAna.llamar("Pepe"); // No esta en la agenda
		tAna.llamar(tPepe.getNumtelefono()); // Llamada OK
		
		System.out.println("=== RESUMEN ===");
		System.out.println(tPepe);
		System.out.println(tEva);
		System.out.println(tAna);
		System.out.println(ctl);
		
		
	}

}

