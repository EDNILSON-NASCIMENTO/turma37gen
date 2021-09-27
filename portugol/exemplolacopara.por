programa
{
	
	funcao inicio()
	{

		//TAMANHO FIXO - PARA
		inteiro tamanho
		escreva("Qual o tamanho da linha : ")
		leia(tamanho)
		
		para (inteiro x=1;x<=10;x++){
			escreva(x+" PARABENS FERNANDA!!!\n")	
			linha(tamanho)
			escreva("\n")
		}
	
		
	}
	//desvio condicional - função
	funcao linha(inteiro tamanho){
		para (inteiro x=1; x<=tamanho; x++){
			escreva("-")
		}
		escreva("\n")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */