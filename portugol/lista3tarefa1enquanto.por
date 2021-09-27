programa
{
	
	funcao inicio()
	{
/*
 * 1- Elaborar um programa que efetue a leitura sucessiva de valores 
 * numéricos e apresente no final o total do somatório, a média e o 
 * total de valores lidos. O programa deve fazer as leituras dos valores 
 * enquanto o usuário estiver fornecendo valores positivos. Ou seja, 
 * o programa deve parar quando o usuário fornecer um valor negativo.
 */
		//variaveis
		inteiro valorDigitado=0
		real media=0.00
		inteiro total=0
		real totalValoresDigitados=0.00
		
		//entradas
		enquanto (valorDigitado>=0){
			
			escreva("Digite um numero positivo ou negativo para parar : ")
			leia(valorDigitado)	
			//total += valorDigitado
			se (valorDigitado>=0){
				total = total + valorDigitado
				totalValoresDigitados++
			}
			
			
			
		}
		
		//processamentos
		media = total / totalValoresDigitados
		
		//saidas
		escreva("\nQuantidade de valores digitados : ",totalValoresDigitados)
		escreva("\nSomatorio de valores digitados  : ",total)
		escreva("\nMedia de valores digitados      : ",media)
		
		
		
 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 680; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */