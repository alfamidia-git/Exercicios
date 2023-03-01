package aula2;

public class Aluno {

	String nome;
	double nota1;
	double nota2;
	double nota3; 
	
	public Aluno(String nome, double nota1, double nota2, double nota3) {
		this.nome = nome;
		
		if((nota1 +  nota2 + nota3) <= 100) {
			this.nota1 = nota1;
			this.nota2 = nota2;
			this.nota3 = nota3;
		}else {
			System.out.println("Atenção, a somatória das notas do aluno "+ nome + " é maior que 100");
		}
	}
	
	private double obterMenorNota() {
		
		if(this.nota1 <= this.nota2 && this.nota1 <= this.nota3) {
			return nota1;
		}else if(this.nota2 <= this.nota1 && this.nota2 <= this.nota3) {
			return nota2;
		}else {
			return nota3;
		}
	}
	
	private double obterMaiorNota() {
		
		if(this.nota1 >= this.nota2 && this.nota1 >= this.nota3) {
			return nota1;
		}else if(this.nota2 >= this.nota1 && this.nota2 >= this.nota3) {
			return nota2;
		}else {
			return nota3;
		}
	}
	
	private double obterMedia() {
		return (this.nota1 + this.nota2 + this.nota3) / 3;
	}
	
	
	public String obterInformacoes() {
		return "O aluno " + this.nome + " teve a média: " + this.obterMedia() + ". Sua maior nota foi: " 
	+ this.obterMaiorNota() + ". Sua menor nota foi: " + this.obterMenorNota(); 
	}
}






