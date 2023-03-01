package aula7.exercicio1;

import java.time.LocalDate;

public class Compra {
	private String descricao;
	private LocalDate dataCompra;
	
	public Compra(String descricao, LocalDate dataCompra) {
		super();
		this.descricao = descricao;
		this.dataCompra = dataCompra;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	@Override
	public String toString() {
		return "Compra [descricao=" + descricao + ", dataCompra=" + dataCompra + "]";
	}
	
	
}
