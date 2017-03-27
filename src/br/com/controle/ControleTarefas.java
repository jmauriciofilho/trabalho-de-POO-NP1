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
>>>>>>> 15b88e62077950ed4c7b89a6eccaf2096c00f147
	private int posicao = 0;

	public ControleTarefas(){
		tarefas = new ArrayList<>();
	}

<<<<<<< HEAD
	public String buscar(int codigo){
=======
	public Tarefas buscar(int codigo){
>>>>>>> 15b88e62077950ed4c7b89a6eccaf2096c00f147

		for (int i = 0; i < tarefas.size(); i++) {
			if (codigo == tarefas.get(i).getCodigo()){
				this.posicao = i;
<<<<<<< HEAD
				return tarefas.get(i).getDescricao();
=======
				return tarefas.get(i);
>>>>>>> 15b88e62077950ed4c7b89a6eccaf2096c00f147
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
=======
	public int tamanho(){
		return tarefas.size();
	}

>>>>>>> 15b88e62077950ed4c7b89a6eccaf2096c00f147
	public List<Tarefas> buscarTodos(){
		return tarefas;
	}
}
