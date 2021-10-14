package application;

import entities.Carro;

public class TesteCarroPadrao {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("PLX-0301","CELTA","GM");
		Carro carro2 = new Carro("PPR-0001","FOX","VOLKS");
		
		carro1.ligarCarro();
		carro1.andarCarro();
		System.out.println("marcha :"+carro1.getMarcha()+" velocidade"+carro1.getVelocidade());
		carro1.subirMarcha();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		System.out.println("marcha :"+carro1.getMarcha()+" velocidade"+carro1.getVelocidade());
		carro1.subirMarcha();
		for (int x=1; x<10;x++) {
			carro1.acelerar();
		}
		System.out.println("marcha :"+carro1.getMarcha()+" velocidade"+carro1.getVelocidade());
		for (int x=1; x<5;x++) {
			carro1.reduzir();
		}
		System.out.println("marcha :"+carro1.getMarcha()+" velocidade"+carro1.getVelocidade());
		carro1.descerMarcha();
		for (int x=1; x<5;x++) {
			carro1.reduzir();
		}
		System.out.println("marcha :"+carro1.getMarcha()+" velocidade"+carro1.getVelocidade());
		carro1.freio();
		System.out.println("marcha :"+carro1.getMarcha()+" velocidade"+carro1.getVelocidade());
		carro1.freio();
		System.out.println("marcha :"+carro1.getMarcha()+" velocidade"+carro1.getVelocidade());
		carro1.freio();
		System.out.println("marcha :"+carro1.getMarcha()+" velocidade"+carro1.getVelocidade());
		
		carro1.descerMarcha();
		carro1.descerMarcha();
		carro1.reduzir();
		carro1.pararCarro();
		System.out.println("marcha :"+carro1.getMarcha()+" velocidade"+carro1.getVelocidade());
	}

}
