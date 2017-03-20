package br.com.controle;

import br.com.models.Tarefas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauricio on 11/03/17.
 */
public class ControleTarefas {
<<<<<<< HEAD
	private List<Tarefas> tarefas;
=======
    private List<Tarefas> tarefas;
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
	private int posicao = 0;

	public ControleTarefas(){
		tarefas = new ArrayList<>();
	}

<<<<<<< HEAD
	public Tarefas buscar(int codigo){
=======
	public String buscar(int codigo){
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a

		for (int i = 0; i < tarefas.size(); i++) {
			if (codigo == tarefas.get(i).getCodigo()){
				this.posicao = i;
<<<<<<< HEAD
				return tarefas.get(i);
=======
				return tarefas.get(i).getDescricao();
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
			}
		}
		return null;
	}

	public String criar(Tarefas t){
		if (buscar(t.getCodigo())==null){
			tarefas.add(t);
			return "Adicionado com sucesso.";
		}
		return "Tarefa não adicionado.";
	}

	public void editar(Tarefas t){
		if (buscar(t.getCodigo())!=null){
			tarefas.set(this.posicao, t);
		}
	}

	public String remover(Tarefas t){
		if (buscar(t.getCodigo())!=null){
			tarefas.remove(this.posicao);
			return "Removido com sucesso.";
		}
		return "Tarefa não removida.";
	}

<<<<<<< HEAD
	public int tamanho(){
		return tarefas.size();
	}

=======
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
	public List<Tarefas> buscarTodos(){
		return tarefas;
	}
}
