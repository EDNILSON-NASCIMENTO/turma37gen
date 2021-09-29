programa
{
	inclua biblioteca Util
/*
 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva 
 * esse vetor. A seguir determine e imprima a média aritmética dos 
 * lançamentos, contabilize e apresente também quantas foram as 
 * ocorrências da maior pontuação.

 */
	
	
	funcao inicio()
	{
		inteiro lancamentos[10] //0-9
		inteiro total=0
		real media=0.00
		inteiro maiorValor=0
		inteiro quantasVezesMaiorValor=0


		para (inteiro x=0; x<10; x++){
			lancamentos[x]=Util.sorteia(1,6)
			escreva("Lancamento ",(x+1)," = ",lancamentos[x],"\n")
			total += lancamentos[x]  //somatorio
			se (lancamentos[x]>= maiorValor){
				se (lancamentos[x]==maiorValor){
					quantasVezesMaiorValor++ //toda vez que ele repete
				}
				senao se (lancamentos[x]>maiorValor){
					quantasVezesMaiorValor = 1 //primeira vez do numero
				}
				maiorValor = lancamentos[x]
			}
			
		}
		media = total / 10.00
		escreva("\nMedia ",media)
		escreva("\nMaior valor ",maiorValor)
		escreva("\nO maior valor aparece ",quantasVezesMaiorValor," nos lancamentos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 800; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */