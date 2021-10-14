package lacosDeRepeticao;

public class Lancamentos {

	public static void main(String[] args) {
		
		int max = 9;
		int min = 0;
		int lancamentos[] = new int[10];
		int valor;
		/*
		for (int i = min; i<=max; i++) {
			valor = (int) (Math.random()*(10))+1;
			lancamentos[i] = valor;
			System.out.println(lancamentos[i]);
		}
		*/
		int y=0;
		while (y<10) {
			
			valor = (int) (Math.random()*(10))+1;
			for (int numero : lancamentos) {
				if (numero == valor) {
					valor = (int) (Math.random()*(10))+1;
				} else {
					lancamentos[y]= valor;
				}
				y++;	
			}
			
			
		}
		
		
		
		
				
		

	}

}
