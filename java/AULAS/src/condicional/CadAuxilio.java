package condicional;

import java.util.Locale;
import java.util.Scanner;

public class CadAuxilio {

	public static void main(String[] args) {
		
		//VARIAVEIS
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nome;
		char pronome;
		boolean chefaFamilia=false;
		boolean naoOutroAuxilio=true;
		final double AUXILIO=600.00;
		final double VALORFILHO=50.00;
		char op;
		int filhos=0;
		
		
		//ENTRADAS
		
		System.out.print("Digite o nome da pessoa : ");
		nome = leia.nextLine();
		
		System.out.print("Digite o pronome de tratamento A/O/E : ");
		pronome = leia.next().toLowerCase().charAt(0);
		System.out.print("Chefa de familia S/N : ");
		op = leia.next().toUpperCase().charAt(0);
		if (op=='S') {
			chefaFamilia = true;
		}
		System.out.print("Ja recebeu outro auxilio ? S/N :");
		op = leia.next().toUpperCase().charAt(0);
		if (op=='S') {
			naoOutroAuxilio=false;
		}
		System.out.print("Quantidade de filhos : ");
		filhos = leia.nextInt();
		
		System.out.printf("O valor de auxilio é R$ %.2f",(calcAuxilio(chefaFamilia,naoOutroAuxilio)+((naoOutroAuxilio)?(filhos*50):0)));
			

	}
	//funcao calcAuxilio()
	public static double calcAuxilio(boolean chefaFamilia, boolean naoOutroAuxilio ) {
		
		double auxilio=0.00;
		if (chefaFamilia && naoOutroAuxilio) {
			auxilio = 1200.00;
		}  else if (naoOutroAuxilio) {
			auxilio = 600.00;
		}
		
		return auxilio;
	}
	
	

}
