package trocarpneus;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", "Uno");
		carro.setNomePneus(0, "Fiat");
		carro.setNomePneus(1, "Fiat");
		carro.setNomePneus(2, "Fiat");
		carro.setNomePneus(3, "Fiat");
		System.out.println("Pneus atuais: " + Arrays.toString(carro.getPneus()));
		carro.adicionarPneusFerrari();
		System.out.println("Pneus novos: " + Arrays.toString(carro.getPneus()));
	}
}
