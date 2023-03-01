package aula3.exercicio2;

import java.util.Arrays;

public class Pedido {
		private Item[] itens = new Item[10];
		private Status status;
		private double valorTotal;
		
		public Pedido() {
			status = Status.AGUARDANDO;
		}
		public void adicionarItem(Item item, double valor) {
			for(int i = 0; i < itens.length; i++) {
				if(itens[i] == null) {
					itens[i] = item;
					valorTotal += valor;
					return;
				}
			}
		}
		
		public void alteraStatusDoPedido(Status status) {
			this.status = status;
		}
		
		public String retornaItens() {
			String retorno = "";
			
			for(int i = 0; i < itens.length; i++) {
				if(itens[i] != null) {
					retorno += itens[i] + ", ";
				}
			}
			
			return retorno;
		}

		@Override
		public String toString() {
			return "Pedido [itens=" +  this.retornaItens() + "\nstatus=" + status + "\nvalorTotal=" + valorTotal
					+ "]";
		}
		
		
		
}
