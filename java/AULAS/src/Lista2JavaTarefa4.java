import java.util.Locale;
import java.util.Scanner;

public class Lista2JavaTarefa4 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US); //usar o padrão americano
		Scanner leia = new Scanner(System.in); //usar o teclado
		
		
		System.out.println("Digite um valor inteiro positivo ");
		int valor = leia.nextInt();
		System.out.println((valor<0) ? "impossivel realizar...negativo":(valor==0)? "Zero é neutro":(valor%2==0)?"Valor par":"valor impar");
				//LAMBDA
		/*
		if ((valor%2)==0) {
			System.out.println("Valor par");
		} else {
			System.out.println("Valor impar");
		}
		*/
		
		
		

	}

}
