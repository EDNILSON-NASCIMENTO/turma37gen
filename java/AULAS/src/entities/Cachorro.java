package entities;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public void abanandoRabo() {
		
		System.out.println("Abanando rabo....");
	}
	
	public void emitirSom() {
		System.out.println("Emitindo som: au au au au...");
	}
	
}
