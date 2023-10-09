package operacoesBasicasList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa tarefa: tarefaList) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(tarefa);
			}
		}
		
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricaoTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		listaTarefa.adicionarTarefa("Ligar notebook");
		listaTarefa.adicionarTarefa("Abrir o Eclipse");		
		listaTarefa.adicionarTarefa("Estudar java");
		listaTarefa.removerTarefa("asdijas");
		listaTarefa.obterDescricaoTarefas();
		System.out.println("o numero total de tarefas é : " + listaTarefa.obterNumeroTotalTarefas());
	}
	
}
