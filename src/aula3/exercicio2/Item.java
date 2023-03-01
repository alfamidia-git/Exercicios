package aula3.exercicio2;

import java.util.Objects;

public class Item {
	private String nome;
	private double valor;

	public Item(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, valor);
	}

	public boolean equals(Item obj) {
		return obj.getNome().equals(this.nome);
	}
	
	
	
	
	
}
