package lacosDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class TesteTipo {
	
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("como vc se define 1-feminina 2-masculino ou 3-neutro :");
		char pronome = leia.next().charAt(0);
		
		System.out.println("Bom dia "+tratamento(pronome));
		
		System.out.println("Digite o tamanho da linha :");
		int tamanho = leia.nextInt();
		linha(tamanho);
		System.out.println();
		System.out.println("Digite um numero inteiro positivo : ");
		int numero = leia.nextInt();
		String mensagem = parImpar(numero);
		//System.out.println(parImpar(numero));
		parImparSemRetorno(numero);
		if (mensagem == "impossivel realizar...negativo") {
			System.out.println("Não use numeros negativos");
		}
	//FIM DA FUNÇÃO MAIN-PRINCIPAL
	}
	
	public static String tratamento(char pronome) {
		String resposta;
		if (pronome =='1') {
			resposta = "Sra.";
		} else if (pronome =='2') {
			resposta = "Sr.";
		} else {
			resposta = "Sre.";
		}
		return resposta; 
	}
	
	
	public static void linha(int tamanho) {
		
		for (int x=1; x<=tamanho; x++) {
			if (x<=20) {
				System.out.print("░");//176
			} else if (x<=40) {
				System.out.print("▒");//177
			}
			else {
				System.out.print("▓");//178
			}
						
		}
		
	}
	
	public static String parImpar(int valor) {
		
		String resposta;
		
		resposta = (valor<0) ? "impossivel realizar...negativo":(valor==0)? "Zero é neutro":(valor%2==0)?"Valor par":"valor impar";
		
		return resposta;
	}
	
public static void parImparSemRetorno(int valor) {
		
	
			System.out.println((valor<0) ? "impossivel realizar...negativo":(valor==0)? "Zero é neutro":(valor%2==0)?"Valor par":"valor impar");
		
	
	}
	
//FIM DO PROGRAMA
}
