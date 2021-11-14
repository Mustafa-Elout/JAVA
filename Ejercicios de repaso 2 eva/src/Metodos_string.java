
public class Metodos_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uno="yo";
		String dos="java";
		//System.out.println(lastChars(uno, dos));
		//catDog("catfdfgsfcatfvdogdfdog");
		sameStarChar("xy*yds");
		System.out.println("hola");

	}
	public static String lastChars(String a, String b) {
		String resu;
		if(a.length()<0) {
			resu="@";
		}else {
			resu=a.substring(0,1);
		}
		if(b.length()<0) {
			resu+="@";
		}else {
			resu+=b.substring(b.length()-1,b.length());
		}
		//resu=a.substring(0,1)+b.substring(b.length()-1,b.length());
		return resu;
	}
	public static boolean catDog(String str) {
		int contDog=0;
		int conCat=0;
		for (int i = 0; i < str.length()-2; i++) {
			if(str.substring(i, i+3).equals("cat"))conCat++;
			if(str.substring(i, i+3).equals("dog"))contDog++;
		}
		if(contDog==conCat)return true;
		
			return false;
	}
	public static boolean sameStarChar(String str) {
		for (int i = 0; i < str.length()-1; i++) {
			if(str.substring(i,i+1).equals("*") )
			{
				if(str.substring(i-1,i).equals(str.substring(i,i+1))) {
				System.out.println("bien");
				return true;
				}
			}
			
		}
		System.out.println("mal");
		return false;
	}

}
