package br.ufpb.dcx.aps.factorymethod;

public class ItemFatura {

	private Produto produto;
	private int quantidade;
	private double subTotal;

	public ItemFatura(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getSubTotal() {
		return subTotal;
	}

}
