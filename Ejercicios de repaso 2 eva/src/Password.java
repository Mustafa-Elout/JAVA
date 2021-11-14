
public class Password {
	String contrase�a;
	
	public Password (String cadena) {
		contrase�a=cadena;
	}
	
	public boolean esFuerte() {
		boolean haydigitos    = false;
		boolean hayminusculas = false;
		boolean haymayusculas = false;
		boolean haynoalfanumerico = false;
		if(contrase�a.length()>=8) {
			for ( int i=0 ; i < contrase�a.length(); i++){
				char letra = contrase�a.charAt(i);
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


