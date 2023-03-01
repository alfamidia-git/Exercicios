package aula5.exercicio14;

public interface Conta {

	public double sacar(double valor) throws ContaException;
	
	public void depositar(double valor) throws ContaException;
	
	public String verExtrato();
}
