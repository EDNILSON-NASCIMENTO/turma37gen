programa
{
	
	funcao inicio()
	{

	//variaveis
		cadeia nome
		inteiro anoNascimento
		inteiro idade
	//entradas
		escreva("Digite o nome da pessoa : ")
		leia(nome)
		escreva("Digite o ano de nascimento : ")
		leia(anoNascimento)
	//processamentos
		idade = (2021-anoNascimento)
	//saidas
		escreva("Oi ",nome," sua idade aprox é ",idade," anos!\n")	

		se(idade>=28){
			escreva("Vc é cringe!!\n")	
		}
		
		senao se (idade>=15){
			escreva("Vc é jovem!!!\n")
		}
		
		senao se (idade>=2){
			escreva("Vc é criança!!\n")
		}
		
		senao se (idade < 0) {
			escreva("Vc informou um ano de nascimento incorreto!!! \n")
		}
		senao {
			escreva("Vc é bebezinho/a \n")
		}
			
		escreva("FIM DE PROGRAMA!!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 636; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */