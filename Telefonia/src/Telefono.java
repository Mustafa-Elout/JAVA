
public class Telefono {

	static final int NMAXCONTACTOS = 10;
	
	private String modelo;
	private int numtelefono;
	private boolean conectado;
	private int nllamadas;
	private Contacto agenda[];
	private int ncontactos;
	private Centralita centralita;
	private boolean disponible;

	Telefono(int numtelefono,String modelo) {
		this.numtelefono=numtelefono;
		this.modelo=modelo;
		ncontactos=0;
		centralita=null;
		agenda= new Contacto [NMAXCONTACTOS];
		conectado=false;
		nllamadas=0;
	}
	
	public void setdisponible (boolean valor) {
		disponible= valor;
	}
	public boolean getdisponible() {
		return disponible;
	}
	
	public int getNumtelefono () {
		return this.numtelefono;
	}

	public boolean anotarContacto(Contacto nuevo) {
		if(ncontactos<NMAXCONTACTOS) {
			agenda[ncontactos]=nuevo;
			ncontactos++;
			return true;
		}
		return false;
	}

	public void verAgenda() {
		for(int i=0;i<ncontactos;i++) {
			System.out.println(agenda[i]);
		}
	
	}

	public boolean llamar(String nombre) {
		for (int i = 0; i < ncontactos; i++) {
			if(nombre.equals(agenda[i].getNombre())) {
				return llamar(agenda[i].getNumtelefono());
			}
		}
		System.out.println(nombre+" No está en la agenda");
		return false;
	}

	public boolean llamar(int numero) {
		if (!conectado) {
			System.out.println(" El teléfono no está conectado.");
			return false;
		}
		nllamadas++;
		System.out.println("LLamando al teléfono " + numero);
        boolean resu = centralita.llamada(this.numtelefono, numero);
        return resu;
	}

	public void conectar(Centralita ctl) {
		this.centralita=ctl;
		this.conectado=true;
		ctl.conectar(this);
		
	}

	public void desconectar() {
		this.conectado=false;
		this.centralita.desconectar(this);
		this.centralita = null;
		
	}

	@Override
	public String toString() {
		return "Teléfono [modelo=" + modelo + ", numtelefono=" + numtelefono + ", conectado=" + conectado
				+ ", nllamadas=" + nllamadas + "]";
	}

	

}

