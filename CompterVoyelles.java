import java.util.Scanner; 
public class ClaseTexto {
	private String varString;
	public static void main(String arg[]){
		String varString;
		int counterV = 0;
		int counterC = 0; 
		char[] Vocales; 
		char[] Consonantes;
		Scanner TextoDeEntrada = new Scanner(System.in);
		System.out.println("Introduzca el texto que quiere analizar");	
		varString = TextoDeEntrada.nextLine();
		varString = varString.toLowerCase();
		varString = varString.replace(" ", "");
		System.out.println("Texto ingresado: "+ varString);
		char[] arrayCaracteres = varString.toCharArray();
		System.out.println("Texto ingresado: "+ arrayCaracteres);
		for(int i=0; i<arrayCaracteres.length; i++){
			if((arrayCaracteres[i] =='a') || (arrayCaracteres[i] =='e')|| (arrayCaracteres[i] =='i')|| (arrayCaracteres[i] =='o')|| (arrayCaracteres[i] =='u')){  
			    System.out.println( arrayCaracteres[i] + " -> es vocal");
			    counterV ++;
			    }
			else
			{System.out.println( arrayCaracteres[i] + " -> es consonante");
		        counterC ++;}
		}
		System.out.println("vocales "+ counterV);
		System.out.println("consonantes "+ counterC);
		}
}
