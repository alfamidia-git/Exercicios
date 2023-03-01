package aula5.exercicio14;

public class ContaPoupanca implements Conta{

	private String titular;
	private double saldo;
	
	
	public ContaPoupanca(String titular) {
		this.titular = titular;
	}
	
	@Override
	public double sacar(double valor) throws ContaException {
		if((valor + 5) > saldo) {
			throw new ContaException("Saldo insuficiente");
		}
		
		this.saldo -= (valor + 5);
		
		return valor;
	}

	@Override
	public void depositar(double valor) throws ContaException {
		
		if(valor > 10000) {
			throw new ContaException("Depósito maior que o permitido!");
		}
		
		if(valor < 3000) {
			valor +=  (valor * 0.03);
		}
		this.saldo += valor;
		
	}

	@Override
	public String verExtrato() {
		return "Conta Poupança do cliente: " + this.titular + ", com saldo: R$" + this.saldo;
	}

}
