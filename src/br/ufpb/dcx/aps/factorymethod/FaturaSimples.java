package br.ufpb.dcx.aps.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class FaturaSimples {
	
	
	private List<ItemFatura> itens = new ArrayList<ItemFatura>();

	public void addItem(Produto produto, int quantidade) {
		ItemFatura itemFatura = new ItemFatura(produto, quantidade);
		itemFatura.setSubTotal(produto.getPreco() * quantidade);
		itens.add(itemFatura);
	}

	@Override
	public String toString() {
		String esperado = "";
		int i = 1;
		double total = 0.0;
		
		for (ItemFatura item : itens) {
			Produto produto = item.getProduto();
			double subTotal = item.getSubTotal();
			
			String linha = i++ + ". " + produto.getNome() + 
					" " + produto.getPreco() + " x " + 
					item.getQuantidade() + " : " + subTotal + "\n";
			
			esperado += linha;
			total += subTotal;
		}
		
		esperado += 
				"Total : " + total;
		
		return esperado;
	}
}
