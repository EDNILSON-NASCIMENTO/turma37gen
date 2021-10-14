package app;

import java.util.Scanner;

import entities.Poupanca;

public class BankEd {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		String cpf;
		int diaAniversarioConta;
		char op;
		double valor;
		int auxDia;
		
		System.out.print("Digite o numero da conta : ");
		numero = leia.nextInt();
		System.out.print("Digite o cpf do cliente : ");
		cpf = leia.next();
		System.out.print("Digite o dia de aniversário da conta : ");
		diaAniversarioConta = leia.nextInt();
		Poupanca cp1 = new Poupanca(numero,cpf,diaAniversarioConta);
		
		for (int x=1; x<=10; x++) {
			System.out.println("MOVIMENTO "+x);
			System.out.println("Saldo atual conta R$ "+cp1.getSaldo());
			System.out.print("Digite o valor R$ ");
			valor = leia.nextDouble();
			System.out.print("D-débito ou C-crédito : ");
			op = leia.next().toUpperCase().charAt(0);
			if (op =='D') {
				cp1.debito(valor);
			} 
			else if (op =='C') {
				cp1.credito(valor);
			} else {
				System.out.println("Opção escolhida invalida, perdeu o movimento!");
			}
				
			System.out.print("Continua S/N :");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'N') {
				break;
			}
		}
		System.out.println("Saldo atual R$ "+cp1.getSaldo());
		System.out.print("Informe o dia de hoje : ");
		auxDia = leia.nextInt();
		cp1.correcao(auxDia);
		System.out.println("Saldo corrigido R$ "+cp1.getSaldo());
				

	}

}
