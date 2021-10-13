package entities;

public class Terceiro extends Funcionario{
	
	private double adicional;

	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
	
	@Override
	public double calcularSalario() {
		
		//colocando a mãe no meio
		//return (super.getHorasTrabalhadas()*super.getValorHora())+this.adicional;
		
		return (horasTrabalhadas * valorHora)+adicional; 
		
				
	}
	
	@Override
	public double calcularSalarioFerias() {
		
		return (calcularSalario()*1.3);  
				
	}

}
