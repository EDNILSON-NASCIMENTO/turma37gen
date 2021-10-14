package lacosDeRepeticao;

public class TesteForEach {

	public static void main(String[] args) {
		
		String alunos[] = {"MARCOS", "MATEUS","PEDRO","JOÃO"};
		
		//padrão
		/*
		for (int x=0; x<alunos.length; x++) {
			System.out.println(alunos[x]);
		}
		*/
		
		for(String nome : alunos) {
			System.out.println(nome);
			
						
		}
			
		
		

	}

}
