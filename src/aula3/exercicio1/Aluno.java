package aula3.exercicio1;

public class Aluno {
	private	String nome;
	private	int matricula;
	private	Double[] notas = new Double[3];
	
	public void adicionarNota(double nota) {
		if(verSomatorio() + nota > 100) {
			System.out.println("Não foi possível adicionar esta nota: "+ nota +". Tente novamente");
			
			return;
		}
		
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] == null) {
				notas[i] = nota;
				break;
			}
		}
	}
	
	public double verSomatorio() {
		double resultado = 0;
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] != null) {
				resultado += notas[i];
			}			
		}
		
		return resultado;
	}
}
