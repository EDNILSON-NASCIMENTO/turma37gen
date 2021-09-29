programa
{

/*
 * Observe a seguinte sequência lógica:     
 * 89, 119, 96, 127, 103, 135, 110, 143, 117, ...     
 * 89 + 30 = 119 [0]
 * 119 - 23 = 96 [0]
 * 96 + 30 = 127 [+1]
 * 127 - 23 = 103[-1]
 * 103 + 30 = 133[2] = 135
 * 135 - 23 = 110[2]
 * 
 * A partir da relação acima, qual é o número de 
 * elementos dessa sequência que estão entre 1000 e 1500?
 */
	
	funcao inicio()
	{
		const inteiro INCREMENTO = 30
		const inteiro DECREMENTO = 23
		inteiro valorCalculo=89
		inteiro contador=0
		
		escreva("\n",valorCalculo)		
		para (inteiro x=0; x<10000; x++){
			valorCalculo = (valorCalculo + (INCREMENTO + x))
			escreva("\n",valorCalculo)
			se (valorCalculo >=1000 e valorCalculo <=1500){
				contador++
			}
			valorCalculo = (valorCalculo - (DECREMENTO + x))
			escreva("\n",valorCalculo)
			se (valorCalculo >=1000 e valorCalculo <=1500){
				contador++
			}
			se (valorCalculo >=1500){
				pare
			}
		}
		escreva("\nO total de numeros entre 1000 e 1500 é ",contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 854; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */