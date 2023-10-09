package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	private List<Pessoa> pessoaList;

	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	//comparable	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	//comparator
	public List<Pessoa> ordernarPorAltura() {
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;

	}
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		
		ordenacaoPessoa.adicionarPessoa("Clarissa", 29, 1.79);
		ordenacaoPessoa.adicionarPessoa("Amanda", 28, 1.80);
		ordenacaoPessoa.adicionarPessoa("Pedro", 1, 0.89);
		ordenacaoPessoa.adicionarPessoa("Lilly", 3, 1);
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println(ordenacaoPessoa.ordernarPorAltura());

	}
	
}
