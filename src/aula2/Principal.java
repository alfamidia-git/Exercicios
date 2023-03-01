package aula2;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno01 = new Aluno("Fulano", 35, 35, 30);
		Aluno aluno02 = new Aluno("Ciclano", 40, 35, 30);
		Aluno aluno03 = new Aluno("Beltrano", 20, 35, 30);
		
		System.out.println(aluno01.obterInformacoes());
		System.out.println(aluno02.obterInformacoes());
		System.out.println(aluno03.obterInformacoes());
	}
}
