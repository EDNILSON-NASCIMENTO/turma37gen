programa {

	funcao inicio(){

		 cadeia nome
		 inteiro anoNascimento
		 inteiro idade
		 inteiro anoAtual
		 //camelCase - PascalCase
		 //entradas
		 escreva("Qual o seu nome : ")
		 leia(nome)
		 escreva("Qual o seu ano de nascimento : ")
		 leia(anoNascimento)
		 escreva("Qual o ano atual : ")
		 leia(anoAtual)
		 //processamento
		 idade = anoAtual - anoNascimento
		 //saida
		 escreva("Oi, ",nome," sua idade é ",idade," anos aproximadamente!!!")
		
	}
	
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 30; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */