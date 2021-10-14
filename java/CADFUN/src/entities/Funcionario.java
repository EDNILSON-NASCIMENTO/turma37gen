package entities;

public class Funcionario {
    
	private String matricula;
	private String nome;
	protected int horasTrabalhadas;
	protected double valorHora;
	
	
	
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	public double calcularSalario() {
		
		
		return (this.horasTrabalhadas*this.valorHora);
				
	}
	
	
	public double calcularSalarioFerias() {
		
		return (calcularSalario()*1.3);  
				
	}
	
	
		
}
