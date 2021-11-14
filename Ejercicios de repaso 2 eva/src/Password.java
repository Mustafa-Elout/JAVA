
public class Password {
	String contraseņa;
	
	public Password (String cadena) {
		contraseņa=cadena;
	}
	
	public boolean esFuerte() {
		boolean haydigitos    = false;
		boolean hayminusculas = false;
		boolean haymayusculas = false;
		boolean haynoalfanumerico = false;
		if(contraseņa.length()>=8) {
			for ( int i=0 ; i < contraseņa.length(); i++){
				char letra = contraseņa.charAt(i);
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


