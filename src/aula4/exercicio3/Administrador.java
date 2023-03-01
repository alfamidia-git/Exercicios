package aula4.exercicio3;

public class Administrador extends Funcionario{

	private final double BONIFICACAO = 0.06;
	
	public Administrador(String nome, double totalHoras, double valorHoras) {
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
