
public class Password {
	String contraseña;
	
	public Password (String cadena) {
		contraseña=cadena;
	}
	
	public boolean esFuerte() {
		boolean haydigitos    = false;
		boolean hayminusculas = false;
		boolean haymayusculas = false;
		boolean haynoalfanumerico = false;
		if(contraseña.length()>=8) {
			for ( int i=0 ; i < contraseña.length(); i++){
				char letra = contraseña.charAt(i);
				if ( Character.isDigit(letra) )haydigitos    = true;
				if ( letra >= 'a'  && letra <= 'z')  hayminusculas = true;
				if ( letra >= 'A'  && letra <= 'Z')haymayusculas = true;
				if ( !Character.isAlphabetic(letra) && !Character.isDigit(letra)){
					haynoalfanumerico = true;
				}		
			}
		}
		if(haydigitos==true && hayminusculas==true && haymayusculas==true && haynoalfanumerico==true) {
			
			return true;
		}
		
		return false;
	}

}


