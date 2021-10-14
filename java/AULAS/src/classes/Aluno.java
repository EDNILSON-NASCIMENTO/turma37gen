package classes;

public class Aluno {
	//classe aluno
	private String matricula;
	private String nome;
	private int nota;
	public Aluno(String matricula,  String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	
}
