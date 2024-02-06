package examen;

public class Palabras {
	String frase,div1,div2,div4;
	String [] div3;
	public Palabras (String frase) {
		this.frase = frase;
	}
	public String primeraMayuscula() {
		 div1 = frase.substring(0,1);
		 div4 = frase.substring(1,frase.length());
		 div2 = div1.toUpperCase();
		 String prim = div2 + div4;
		 return prim;
	}
	public String invertirCadena() {
		  int b=frase.length();
		
		 b=b-1;
		    String  div1 ="";
		 for (int i= 0;i<frase.length();i++){

		 
			 	div1 = div1 +frase.charAt(b);
		       b--;
	
		}

        return div1;
		
	}
	public String vocalesMayuscula() {
		String voca= "";
		voca = voca + frase;
		voca = voca.replace("a", "A");
		voca= voca.replace("e", "E");
		voca = voca.replace("i", "I");
		voca = voca.replace("o", "O");
		voca = voca.replace("u", "U");
	return voca;
	}
    public boolean palindromo() {
		  int b=frase.length();
			
		 b=b-1;
		    String  div1 ="";
		 for (int i= 0;i<frase.length();i++){

		 
			 	div1 = div1 +frase.charAt(b);
		       b--;
	
		}

    	boolean pal = div1.equals(frase);
    	return pal;
    }
}
