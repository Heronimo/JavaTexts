import java.util.Arrays;

public class Test {
	public static void main(String args[]) {
		String[] mots = new String[] {"bonjour", "à", "tous", "I"};
		Arrays.stream(mots).forEach(mot -> {
			System.out.print(mot+" ");
		});
	}	
}
