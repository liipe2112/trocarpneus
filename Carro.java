package trocarpneus;

import java.util.Iterator;

public class Carro {
	private String marca;
	private String modelo;
	private String[] pneus;
	
	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.pneus = new String[4];
	}
	
	public void trocarPneus(String[] novosPneus) {
		if (novosPneus.length == 4) {
			this.pneus = novosPneus;
			System.out.println("Pneus trocados com sucesso!");
		} else {
			System.out.println("Erro: número inválido de pneus!");
		}
	}
	
	public void adicionarPneusFerrari() {
		String[] novosPneus = {"Ferrari", "Ferrari", "Ferrari", "Ferrari"};
		trocarPneus(novosPneus);
	}

	public String[] getPneus() {
		return pneus;
	}

	public void setPneus(String[] pneus) {
		this.pneus = pneus;
	}
}
