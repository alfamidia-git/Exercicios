package aula5.exercicio14;

public class ContaSalario implements Conta{

	private String titular;
	private double saldo;
	
	public ContaSalario(String titular) {
		this.titular = titular;
	}
	
	@Override
	public double sacar(double valor) throws ContaException {
		if((valor) > saldo) {
			throw new ContaException("Saldo insuficiente");
		}
		
		this.saldo -= valor;
		
		return valor;
	}

	@Override
	public void depositar(double valor) throws ContaException {
		if(valor > 10000) {
			throw new ContaException("Depósito maior que o permitido!");
		}
		
		this.saldo += valor;
		
	}

	@Override
	public String verExtrato() {
		return "Conta Salário do cliente: " + this.titular + ", com saldo: R$" + this.saldo;
	}

}
