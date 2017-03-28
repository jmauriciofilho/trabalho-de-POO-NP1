package br.com.controle;

import br.com.models.Aniversario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauricio and on 11/03/17.
 */
public class ControleAniversario {
	private List<Aniversario> aniversarios;
	private int posicao = 0;

	public ControleAniversario(){
		aniversarios = new ArrayList<>();
	}

	public String buscar(int codigo){

		for (int i = 0; i < aniversarios.size(); i++) {
			if (codigo == aniversarios.get(i).getCodigo()){
				this.posicao = i;
				return aniversarios.get(i).getNomeAniversariante();
			}
		}
		return null;
	}

	public String criar(Aniversario a){
		if (buscar(a.getCodigo())==null){
			aniversarios.add(a);
			return "Adicionado com sucesso.";
		}
		return "Aniversário não adicionado.";
	}

	public void editar(Aniversario a){
		if (buscar(a.getCodigo())!=null){
			aniversarios.set(this.posicao, a);
		}
	}

	public String remover(Aniversario t){
		if (buscar(t.getCodigo())!=null){
			aniversarios.remove(this.posicao);
			return "Removido com sucesso.";
		}
		return "Aniversário não removido.";
	}

	public int tamanho(){
		return aniversarios.size();
	}

	public List<Aniversario> buscarTodos(){
		return aniversarios;
	}
}
