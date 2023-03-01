package aula4.exercicio3;

public class Contador extends Funcionario{
	
	private final double BONIFICACAO = 0.03;

	public Contador(String nome, double totalHoras, double valorHoras) {
		super(nome, totalHoras, valorHoras);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double totalAReceber() {
		double totalLiquido = this.totalHoras * this.valorHoras;
		totalLiquido += totalLiquido * this.BONIFICACAO;
		return totalLiquido;
	}

}
