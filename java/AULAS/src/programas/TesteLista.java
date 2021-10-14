package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Aluno;

public class TesteLista {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String turma37[] = {"Adan Vin�cius da Silva Leit�o","Aldair Soares de Freitas Silva","�lyson Batista Siqueira Campos","Arthur Gabriel Farias do Nascimento Souza","Arthur Leandro Bezerra Silva","B�rbara Figueir�a Amorim","B�rbara Maria dos Santos Luna","Bartolomeu Pereira de Melo Neto","Brenda Stefany Lima Cavalcanti","BRUNA GUIMAR�ES DE BARROS LEAL DOS SANTOS","Camila Bazante Campos de Lima Machado","Cec�lia Caroline Soares de Santana","Danillo Vin�cius Barbosa da Silva","EDUARDO MENDON�A DE CASTRO LIMA","Fernanda Gon�alves Azoubel","Guilherme Carlos da Luz","Jady Linnit Alves da Silva","Jo�o Marcos Lemos de Castro","Jonatas Marques de Barros","J�lia Regina Montenegro Vanderlei ","J�lia Sobral de Mendon�a","Laiane Karla da Silva","Lauro Matheus Alves Guedes dos Santos","Lucas Aci Farias Ribeiro Queiroz","MARCELO JORGE NEGROMONTE CAVALCANTE","Maria Luiza Sant'Anna F�lix Damasceno de Moura","Maria Mayara Leite De Melo","Mariana Moreira Theml","Mar�lia Gabriella Muniz Neves","Matheus de Araujo Padilha","Matheus Henrique C�ndido Am�ncio","Pedro Henrique Santos Araujo","Renan Uch�a Morais de Vasconcelos","Renata Vanessa Alves Floro","Renom�rio cosme da silva","Sylvia Carvalho Monteiro de Moraes","Vinicius Chris�stomo da Silva","Vitor Alex Sales da Costa","Washington �ndio do Brasil Brochardt neto"};
					
		System.out.println(turma37.length);
		List<Aluno> lista37 = new ArrayList<>();
				
		for (int x=0; x<turma37.length; x++) {
			lista37.add(new Aluno("GEN-"+(x+1),turma37[x]));
		}
		
		for (Aluno aluno37 : lista37) {
			System.out.println("Matricula "+aluno37.getMatricula()+" "+aluno37.getNome().toUpperCase()+" nota "+aluno37.getNota());
		}
		System.out.println("Digite a matricula do aluno para inserir a nota : ");
		String auxMatricula = leia.next().toUpperCase();
		
		for (Aluno aluno37 : lista37) {
			if (aluno37.getMatricula().equals(auxMatricula)){
				System.out.println("Digite a nota :");
				int auxNota = leia.nextInt();
				aluno37.setNota(auxNota);
				System.out.println("Alune selecionado :");
				System.out.println("Matricula "+aluno37.getMatricula()+" "+aluno37.getNome().toUpperCase()+" nota "+aluno37.getNota());
				break;
			}
				
		}
		
		
		
		
		
		
		
		

	}

}
