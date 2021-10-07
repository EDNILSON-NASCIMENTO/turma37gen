package app;

import java.util.Scanner;

import entities.Pessoa;

public class CadAmigo {

	public static void main(String[] args) {
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		Pessoa cad1 = new Pessoa();
		
		System.out.println("CADASTRO DE AMIGOS");
		
		System.out.print("Digite o nome do amigo : ");
		cad1.nome = leia.next();
		System.out.print("Digite o ano de nascimento : ");
		cad1.anoNascimento = leia.nextInt();
		System.out.print("Digite 1-masculino, 2-feminina, 3-neutre :");
		char op = leia.next().charAt(0);
		if (op=='1') {
			cad1.pronome = 'o';
		} else if (op=='2') {
			cad1.pronome = 'a';
		} else {
			cad1.pronome = 'e';
		}
		System.out.printf("Bom dia Sr%c. %s, sua idade aproxima é %d anos.\n",cad1.pronome,cad1.nome.toUpperCase(),cad1.calcularIdade(2021));
		
		System.out.println(cad1.toString());
		
		
	}

}
