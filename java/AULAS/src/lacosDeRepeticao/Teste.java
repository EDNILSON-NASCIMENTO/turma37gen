package lacosDeRepeticao;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {

		
		    Random random = new Random();
		    Set<Integer> numeros = new HashSet<>();

		    for(int i = 0; i < 20; i++) {
		        numeros.add(random.nextInt(10)+1);
		    }
		    
		    for (Integer numero : numeros) {
		    	System.out.println(numero);
		    }
		
		
	}

}
