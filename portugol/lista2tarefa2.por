programa
{
	
	funcao inicio()
	{
/*
 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente 
 * código e número de horas trabalhadas de um operário. E calcule o 
 * salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número 
 * de horas exceder a 50 calcule o excesso de pagamento armazenando-o 
 * na variável E, caso contrário zerar tal variável. A hora excedente 
 * de trabalho vale R$ 20,00. No final do processamento imprimir o 
 * salário total e o salário excedente.
 */
	//variaveis
	const real VALORHORANORMAL=10.00
	const real VALORHORAEXTRA=20.00
	const inteiro HORASNORMAIS=50
	
	cadeia C
	inteiro N=0
	real salario=0.00
	inteiro E=0
	real salarioTotal=0.00
	real salarioExcedente=0.00
	//entradas
	escreva("Digite o codigo do funcionario : ")
	leia(C)
	escreva("Digite o numero de horas trabalhadas : ")
	leia(N)
	//processamentos
	se (N > HORASNORMAIS){
		E=N - HORASNORMAIS
		salario = HORASNORMAIS * VALORHORANORMAL
		salarioExcedente = E * VALORHORAEXTRA
		salarioTotal = salario + salarioExcedente
	}
	senao {
		salario = N * VALORHORANORMAL
		salarioTotal = salario + salarioExcedente
	}
	//saidas
	escreva("FOLHA DE PAGAMENTO")
	escreva("\nSalario             R$ : ",salario)
	escreva("\nNumero de horas extras : ",E)
	escreva("\nSalario excedente   R$ : ",salarioExcedente)
	escreva("\nSalario Total       R$ : ",salarioTotal)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1262; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */