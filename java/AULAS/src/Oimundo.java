import java.util.Scanner;

public class Oimundo {
//programa{
	//funcao inicio(){
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome; //cadeia
		int anoNascimento; ///inteiro
		double salario; //real 
		
		
		//escreva("Digite o nome :")
		//leia(nome)
		System.out.println("Escreva o nome : ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento : ");
		//leia(anoNascimento)
		anoNascimento = leia.nextInt();
		System.out.println("Digite o salario :");
		salario = leia.nextDouble();
		
		System.out.println(nome+" sua idade é "+(2021-anoNascimento)+" anos e seu salario é R$ "+salario);
		
		
		
		
	}
	
	//}
	
//}
}
