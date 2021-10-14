package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Aluno;

public class TesteLista {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String turma37[] = {"Adan Vinícius da Silva Leitão","Aldair Soares de Freitas Silva","Ályson Batista Siqueira Campos","Arthur Gabriel Farias do Nascimento Souza","Arthur Leandro Bezerra Silva","Bárbara Figueirôa Amorim","Bárbara Maria dos Santos Luna","Bartolomeu Pereira de Melo Neto","Brenda Stefany Lima Cavalcanti","BRUNA GUIMARÃES DE BARROS LEAL DOS SANTOS","Camila Bazante Campos de Lima Machado","Cecília Caroline Soares de Santana","Danillo Vinícius Barbosa da Silva","EDUARDO MENDONÇA DE CASTRO LIMA","Fernanda Gonçalves Azoubel","Guilherme Carlos da Luz","Jady Linnit Alves da Silva","João Marcos Lemos de Castro","Jonatas Marques de Barros","Júlia Regina Montenegro Vanderlei ","Júlia Sobral de Mendonça","Laiane Karla da Silva","Lauro Matheus Alves Guedes dos Santos","Lucas Aci Farias Ribeiro Queiroz","MARCELO JORGE NEGROMONTE CAVALCANTE","Maria Luiza Sant'Anna Félix Damasceno de Moura","Maria Mayara Leite De Melo","Mariana Moreira Theml","Marília Gabriella Muniz Neves","Matheus de Araujo Padilha","Matheus Henrique Cândido Amâncio","Pedro Henrique Santos Araujo","Renan Uchôa Morais de Vasconcelos","Renata Vanessa Alves Floro","Renomário cosme da silva","Sylvia Carvalho Monteiro de Moraes","Vinicius Chrisóstomo da Silva","Vitor Alex Sales da Costa","Washington índio do Brasil Brochardt neto"};
					
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
