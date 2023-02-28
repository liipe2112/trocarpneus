package trocarpneus;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", "Uno");
		System.out.println("Pneus atuais: " + Arrays.toString(carro.getPneus()));
		carro.adicionarPneusFerrari();
		System.out.println("Pneus novos: " + Arrays.toString(carro.getPneus()));
	}
}
