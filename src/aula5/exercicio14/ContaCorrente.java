package aula5.exercicio14;

public class ContaCorrente implements Conta{

	private String titular;
	private double saldo;
	
	public ContaCorrente(String titular) {
		this.titular = titular;
	}
	
	@Override
	public double sacar(double valor) throws ContaException {
		if((valor + 10) > saldo) {
			throw new ContaException("Saldo insuficiente");
		}
		
		this.saldo -= (valor + 10);
		
		return valor;
	}

	@Override
	public void depositar(double valor) throws ContaException {
		if(valor < 10000) {
			valor += (valor * 0.01);
		}else {
			throw new ContaException("Depósito maior que o permitido!");
		}
		this.saldo += valor;
		
	}

	@Override
	public String verExtrato() {
		return "Conta Corrente do cliente: " + this.titular + ", com saldo: R$" + this.saldo;
	}

}
