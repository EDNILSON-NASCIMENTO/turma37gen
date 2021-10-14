package lacosDeRepeticao;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		 
		//ENTIDADE ALUNO
		String nome[] = new String[4];  //0-3
		int nota[] = {0,0,0,0};
		char disciplinaNota[]= new char[4];
		String disciplina[] = {"1-MATEMATICA","2-PORTUGUES","3-CIÊNCIAS","4-ARTES", "5-GEOGRAFIA","6-BIOLOGIA"};
		 
		
		
		for (int x=0; x<4;x++) {
			
			System.out.print("Digite o nome do aluno : ");
			nome[x] = leia.next();
			
			for (int i=0; i<disciplina.length; i++) {
				System.out.print(disciplina[i]+" ");
			}
			System.out.println();
			System.out.print("Digita o codigo da disciplina: ");
			disciplinaNota[x] = leia.next().charAt(0);
			System.out.print("Digite a nota ");
			nota[x] = leia.nextInt();
			System.out.println("-----------------------------------");
		}
		
		for (int y=0; y<4; y++) {
			if (disciplinaNota[y]=='1') {
				System.out.println(nome[y]+" NOTA MATEMATICA "+nota[y]);
			}
			else if (disciplinaNota[y]=='2') {
				System.out.println(nome[y]+" NOTA PORTUGUÊS "+nota[y]);
			}
		
			
		}
		
	}

}
