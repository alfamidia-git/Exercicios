package aula6.exercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Turma {

	private int identificacao;
	private Map<Long, Aluno> alunos;
	
	public Turma(int identificacao) {
		this.identificacao = identificacao;
		alunos = new HashMap<>();
	}
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos.put(aluno.getMatricula(), aluno);
	}
	
	public void removerAluno(Aluno aluno) {
		this.alunos.remove(aluno.getMatricula());
	}
	
	public void removerAluno(long matricula) {
		this.alunos.remove(matricula);
	}
	
	public String detalhes() {
		return "TURMA: " + identificacao + " - Alunos: " + 
				this.alunos.values().stream().map(aluno -> aluno.getNome()).collect(Collectors.toList()).toString();
	}
	
	public String toString() {
		return this.identificacao + "";
	}
}
