package entities;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("Emitindo som...IRCCCC IRCCC IRCCC");
	}
	
}
