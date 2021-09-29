programa
{
	
	funcao inicio()
	{
		const inteiro HORA=24
		const inteiro DIA=31
		
		cadeia agenda[HORA][DIA]
		inteiro auxDia=0,auxHora=0
		caracter op

		faca {
			escreva("Digite o dia do evento : ")
			leia(auxDia)
			auxDia--
			escreva("Digite a hora do evento : ")
			leia(auxHora)
			escreva("Evento : ")
			leia(agenda[auxHora][auxDia])
			escreva("Continua S/N : ")
			leia(op)
		} enquanto (op=='S')

		para (inteiro linha=0;linha<HORA; linha++){
			para (inteiro coluna=0; coluna<DIA; coluna++){
				se (agenda[linha][coluna] != ""){
					escreva("Evento no dia ",(coluna+1)," hora : ",linha," : ",agenda[linha][coluna])
					escreva("\n")	
				}
				
			}
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 643; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {agenda, 9, 9, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */