package carrinhoCompras;

import java.util.List;
import java.util.ArrayList;


public class CarrinhoCompras {
	private List<Item> carrinhoList;
	public double total;

	public CarrinhoCompras() {
		this.carrinhoList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome){
		List<Item> itensParaRemover = new ArrayList<>();
		for (Item item: carrinhoList) {
			if(item.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(item);
			}
			
		}
		carrinhoList.removeAll(itensParaRemover);
	}
	
	public void calcularValorTotal(double preco, int quantidade) {
		total = quantidade * preco;
	}
	
	public List<Item> exibirItens() {
		return carrinhoList; 
	}
	
	public static void main(String[] args) { 
		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		carrinho.adicionarItem("PS 5", 3899.59, 1);
		carrinho.adicionarItem("Livro Codigo Limpo", 99.99, 2);
		carrinho.adicionarItem("Teclado mecânico Redragon", 299.99, 1);
		
		System.out.println("Lista: " + carrinho.exibirItens());

	}
	
}
