package entities;

public class Horista {
	
		private String cpf;
		private String nome;
		private double valorHora;
		private int horasTrabalhadas;
		
		
		public Horista(String cpf, String nome) {
			super();
			this.cpf = cpf;
			this.nome = nome;
			
		}
		
		
		public double pagamentoHorista(int horasTrabalhadas, double valorHora) {
			return  valorHora * horasTrabalhadas;
		}


		public String getNome() {
			return nome;
		}


		
		
	
}
