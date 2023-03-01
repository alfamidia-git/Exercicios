package aula2;

public class Jogador {
	String nome;
	int gols;
	int assistencias;
	
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public void adicionarGols(int gols) {
		this.gols = gols;
	}
	
	public void adicionarAssistencias(int ass) {
		this.assistencias = ass;
	}
	
	public void verGols() {
		System.out.println("O jogador " + this.nome + " fez " + this.gols + " gols");
	}
	
	public void verAssistencias() {
		System.out.println("O jogador " + this.nome + " deu " + this.assistencias + " assistencias");
	}
}
