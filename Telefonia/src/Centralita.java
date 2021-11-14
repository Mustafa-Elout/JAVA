
public class Centralita {

	
	private Telefono tablaTelefonos[];
	private int ntelefonos;
	private int llamadasrealizadas;
	
	Centralita (int capacidad){
		tablaTelefonos=new Telefono[capacidad];
		ntelefonos=0;
		llamadasrealizadas=0;
	}
	
	public boolean conectar(Telefono tele) {
		if (ntelefonos==tablaTelefonos.length)return false; //No cabe
		
		for(int i=0;i<tablaTelefonos.length;i++) {
			if (tablaTelefonos[i]==null) {
				tablaTelefonos[i]=tele;
				ntelefonos++;
				return true;
			}
		}
		return false;
	}
	public boolean desconectar (Telefono tele) {
		for(int i=0;i<tablaTelefonos.length;i++) {
			if (tele== tablaTelefonos[i]) {
				tablaTelefonos[i]=null;
				ntelefonos--;
				return true;
			}
		}
	  return false;
	}
	
	public boolean llamada (int origen, int destino ) {
		boolean estaorigen=false;
		boolean estadestino=false;
		for (int i=0;i<tablaTelefonos.length;i++) {
			Telefono t= tablaTelefonos[i];
			if (t != null) {
				if(t.getNumtelefono()==origen) {
					estaorigen=true;
				}
				if(t.getNumtelefono()==destino) {
					estadestino=true;
				}
			}
		}
		if(estaorigen && estadestino) {
			llamadasrealizadas++;
			System.out.println(">>>>>> Llamada de "+origen+ " a "+ destino);
			return true;
		}else {
			System.out.println(">>>>>> El teléfono "+destino+" no está conectado");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Centralita [ntelefonos=" + ntelefonos + ", llamadasrealizadas=" + llamadasrealizadas + "]";
	}


	
	
	
}


