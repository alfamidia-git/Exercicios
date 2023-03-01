package aula4.exercicio1;

public class Funcionario {

	private String nome;
	private String funcao;
	private String setor;
	
	public Funcionario(String nome, String funcao, String setor) {
		this.nome = nome;
		this.funcao = funcao;
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", funcao=" + funcao + ", setor=" + setor + "]";
	}
	
	
}
