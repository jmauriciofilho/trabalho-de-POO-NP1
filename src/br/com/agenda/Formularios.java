package br.com.agenda;

import br.com.controle.ControleCompromisso;
import br.com.controle.ControleTarefas;
import br.com.models.Compromissos;
import br.com.models.Tarefas;

import java.util.List;
import java.util.Scanner;

/**
 * Created by mauricio on 20/03/17.
 */
public class Formularios {

	public static String formCadastroCompromisso(Scanner scanner, ControleCompromisso c){
		int codigo = c.tamanho() + 1;
		System.out.println("Informe o titulo:");
		String titulo = scanner.nextLine();
		System.out.println("Informe a descrição:");
		String descricao = scanner.nextLine();
		System.out.println("Informe a duração:");
		System.out.println("Deseja que dure o dia inteiro? Sim ou Não");
		String duracao = scanner.nextLine();
		boolean diaInteiro = false;
		if (duracao.equals("Sim")){
			diaInteiro = true;
		}
		Compromissos compromissos;
		if (diaInteiro){
			compromissos = new Compromissos(codigo, titulo, descricao, diaInteiro);
			return c.criar(compromissos);
		}else{
			System.out.println("Informe data e hora de inicio:");
			String data = scanner.nextLine();
			System.out.println("Informe data e hora de fim:");
			String dataFim = scanner.nextLine();
			compromissos = new Compromissos(codigo, titulo, descricao, data, dataFim);
			return c.criar(compromissos);
		}
	}

	public static void formEditarCompromisso(Scanner scanner, ControleCompromisso c){
		System.out.println("Informe o codigo do compromisso:");
		int codigo = scanner.nextInt();
		System.out.println("Informe o titulo:");
		String titulo = scanner.nextLine();
		System.out.println("Informe a descrição:");
		String descricao = scanner.nextLine();
		System.out.println("Informe a duração:");
		System.out.println("Deseja que dure o dia inteiro? Sim ou Não");
		String duracao = scanner.nextLine();
		boolean diaInteiro = false;
		if (duracao.equals("Sim")){
			diaInteiro = true;
		}
		Compromissos compromissos;
		if (diaInteiro){
			compromissos = new Compromissos(codigo, titulo, descricao, diaInteiro);
			c.editar(compromissos);
		}else{
			System.out.println("Informe data e hora de inicio:");
			String data = scanner.nextLine();
			System.out.println("Informe data e hora de fim:");
			String dataFim = scanner.nextLine();
			compromissos = new Compromissos(codigo, titulo, descricao, data, dataFim);
			c.editar(compromissos);
		}
	}

	public static String formRemoverCompromisso(Scanner scanner, ControleCompromisso c){
		System.out.println("Informe o código do compromisso que deseja remover:");
		int codigo = scanner.nextInt();
		Compromissos compromissos = new Compromissos(codigo);
		return c.remover(compromissos);
	}

	public static void formMostrarCompromissos(ControleCompromisso c){
		List<Compromissos> compromissos = c.buscarTodos();
		for (int i = 0; i < compromissos.size(); i++){
			compromissos.get(i).mostrar();
		}
	}

	public static String formCadastrarTarefa(Scanner scanner, ControleTarefas ct){
		int codigo = ct.tamanho() + 1;
		System.out.println("Informe a descrição da tarefa:");
		String descricao = scanner.nextLine();
		System.out.println("Informe a prioridade da tarefa:");
		int prioridade = scanner.nextInt();
		System.out.println("Informe dara de conclusão da tarefa:");
		String data = scanner.nextLine();
		boolean concluida = false;
		Tarefas tarefa = new Tarefas(codigo, descricao, prioridade, data, concluida);
		return ct.criar(tarefa);
	}

	public static void formEditarTarefa(Scanner scanner, ControleTarefas ct){
		System.out.println("Informe o código da tarefa: ");
		int codigo = scanner.nextInt();
		System.out.println("Informe a descrição da tarefa:");
		String descricao = scanner.nextLine();
		System.out.println("Informe a prioridade da tarefa:");
		int prioridade = scanner.nextInt();
		System.out.println("Informe dara de conclusão da tarefa:");
		String data = scanner.nextLine();
		boolean concluida = false;
		Tarefas tarefa = new Tarefas(codigo, descricao, prioridade, data, concluida);
		ct.editar(tarefa);
	}

	public static String formRemoverTarefa(Scanner scanner, ControleTarefas ct){

	}
}
