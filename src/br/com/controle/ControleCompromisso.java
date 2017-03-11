package br.com.controle;

import br.com.models.Compromissos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauricio on 08/03/17.
 */
public class ControleCompromisso {

	private List<Compromissos> compromissos;
	private int index = 0;

	public ControleCompromisso(){
		compromissos = new ArrayList<>();
	}

	public String buscar(int codigo){

		for (int i = 0; i < compromissos.size(); i++) {
			if (codigo == compromissos.get(i).getCodigo()){
				index = i;
				return compromissos.get(i).getTitulo();
			}
		}
		return null;
	}

	public String criar(Compromissos c){
		if (buscar(c.getCodigo())==null){
			compromissos.add(c);
			return "Adicionado com sucesso.";
		}
		return "Compromisso não adicionado.";
	}

	public void editar(Compromissos c){
		if (buscar(c.getCodigo())!=null){
			compromissos.set(index, c);
		}
	}

	public String remover(Compromissos c){
		if (buscar(c.getCodigo())!=null){
			compromissos.remove(c);
			return "Removido com sucesso.";
		}
		return "Compromisso não removido.";
	}

	public List<Compromissos> buscarTodos(){
		return compromissos;
	}
}
