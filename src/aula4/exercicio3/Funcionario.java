package aula4.exercicio3;

public abstract class Funcionario {

	protected String nome;
	protected double totalHoras;
	protected double valorHoras;
	
	
	public Funcionario(String nome, double totalHoras, double valorHoras) {
		this.nome = nome;
		this.valorHoras = valorHoras;
		this.totalHoras = totalHoras;
	}
	
	public abstract double totalAReceber();
}
