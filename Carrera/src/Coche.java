
public class Coche implements comparable <Coche>{
	// Definir los atributos
	private String modelo;
	private int kilometrosRecorridos;
	private int kilometrosdesdequeArranco;
	private boolean arrancado;
	private int velocidad;
	private int velocidadMax;
	
		// Definir los métodos
		
		Coche ( String modelo, int velocidadMax){
			this.modelo=modelo;
			this.velocidadMax=velocidadMax;
			this.kilometrosdesdequeArranco=0;
			this.kilometrosRecorridos=0;
			this.velocidad=0;
			this.arrancado=false;
		}
		
		public boolean arrancar(){
			if (arrancado=true) {
				infoError("Motor ya está arrancado");
				return false;
			}
			arrancado=true;
		  return arrancado;	
		}

		public boolean parar(){
			if(arrancado=false) {
				infoError("Motor ya está parado");
				return false;
			}
			arrancado=false;
			kilometrosdesdequeArranco=0;
			velocidad=0;
			return arrancado;	
		}

		public boolean acelera( int cantidad){
			if (arrancado=true) {
				velocidad+=cantidad;
				if(velocidad>velocidadMax) velocidad=velocidadMax;
				return true;
			}else {
				infoError("Motor parado, no se puede acelerar");
				return false;
			}
	
		}
		
	      public boolean frena ( int cantidad){
	    	  if(arrancado=true) {
	    		  velocidad=velocidad-cantidad;
	    		  if(velocidad<0)velocidad=0;
	    		  return true;
	    	  }else {
	    		  infoError("Motor parado, no se puede frenar");
	    		  return false;
	    	  }
		 
		}
		
	     public boolean recorre (){
	    	 if(arrancado=true) {
	    		 kilometrosRecorridos+=velocidad;
	    		 kilometrosdesdequeArranco+=velocidad;
	    		 return true;
	    	 }else {
	    		 infoError("Motor parado, no se puede avanzar");
	    		 return false;
	    	 }
	     }
		
	     public String info() {
			return "Coche [modelo=" + modelo + ", kilometrosRecorridos=" + kilometrosRecorridos
					+ ", kilometrosdesdequeArranco=" + kilometrosdesdequeArranco + ", arrancado=" + arrancado
					+ ", velocidad=" + velocidad + "]";
		}

		
		
	     public int getKilometros() {
			return kilometrosdesdequeArranco;
		}

	   
	    private void infoError( String mensaje){
		   System.err.println();
	   }	
	}


