package entities;

public abstract class Conta {
	
	private int numero;
	private String cpf;
	private double saldo; 
	private boolean ativo;
	
	
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getSaldo() {
		return saldo;
	}

	/*
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	*/

	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	//metodos
	public void ativarConta() {
		ativo = true;
	}
	
	public void credito(double valor) {
		if (valor <=0) {
			System.out.println("Impossivel realizar...");
		} else {
			saldo = saldo + valor;
			System.out.println("Operação de credito realizado com sucesso.");
		}
		
				
	}
	
	public void debito(double valor) {
		
		if (valor <=0) {
			System.out.println("Impossivel realizar...");
		}
		else if (valor>saldo) {
			System.out.println("Saldo indisponivel...");
		}
		else if (saldo >= valor) {
			saldo = saldo - valor;
			System.out.println("Operação de débito realizado com sucesso.");
		}
		
		
	}
	
	
	/*
	 
	 - debito  [@]
	 + credito  - void
*/
	
	
}
