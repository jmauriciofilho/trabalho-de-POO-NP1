package br.com.controle;

import br.com.models.Tarefas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauricio on 11/03/17.
 */
public class ControleTarefas {
	private List<Tarefas> tarefas;
	private int index = 0;

	public ControleTarefas(){
		tarefas = new ArrayList<>();
	}

	public String buscar(int codigo){

		for (int i = 0; i < tarefas.size(); i++) {
			if (codigo == tarefas.get(i).getCodigo()){
				index = i;
				return tarefas.get(i).getDescricao();
			}
		}
		return null;
	}

	public String criar(Tarefas t){
		if (buscar(t.getCodigo())==null){
			tarefas.add(t);
			return "Adicionado com sucesso.";
		}
		return "Compromisso não adicionado.";
	}

	public void editar(Tarefas t){
		if (buscar(t.getCodigo())!=null){
			tarefas.set(index, t);
		}
	}

	public String remover(Tarefas t){
		if (buscar(t.getCodigo())!=null){
			tarefas.remove(t);
			return "Removido com sucesso.";
		}
		return "Compromisso não removido.";
	}

	public List<Tarefas> buscarTodos(){
		return tarefas;
	}
}
