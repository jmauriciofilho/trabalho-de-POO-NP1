package br.com.agenda;

import br.com.controle.ControleAniversario;
import br.com.controle.ControleCompromisso;
import br.com.controle.ControleFeriados;
import br.com.controle.ControleTarefas;
import br.com.models.*;

import java.util.List;
import java.util.Scanner;

/**
 * Created by mauricio on 20/03/17.
 */
public class Formularios {

	public static String formCadastroCompromisso(Scanner scanner, ControleCompromisso c){
		int codigo = c.tamanho() + 1;
		System.out.println("Informe o titulo:");
		scanner.nextLine();
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
			System.out.println("Informe se esse compromisso se repete ou digite não para não se repetir:");
			scanner.nextLine();
			String repeticao = scanner.nextLine();
			compromissos.repetirCompromisso(repeticao);
			return c.criar(compromissos);
		}else{
			System.out.println("Informe data, mês e ano que o compromisso se iniciara:");
			int diaI = scanner.nextInt();
			String mesI = scanner.nextLine();
			int anoI = scanner.nextInt();
			System.out.println("Informe hora e minutos que compromisso se iniciara:");
			int horaI = scanner.nextInt();
			int minutoI = scanner.nextInt();
			System.out.println("Informe dia da semana de inicio do compromisso:");
			String diaDaSemanaI = scanner.nextLine();
			System.out.println("Informe data, mês e ano que o compromisso terminara:");
			int diaF = scanner.nextInt();
			String mesF = scanner.nextLine();
			int anoF = scanner.nextInt();
			System.out.println("Informe hora e minutos que o compromisso terminara:");
			int horaF = scanner.nextInt();
			int minutoF = scanner.nextInt();
			System.out.println("Informe dia da semana de termino do compromisso:");
			String diaDaSemanaF = scanner.nextLine();
			Data dataInicio = new Data(diaI, diaDaSemanaI, mesI, anoI, horaI, minutoI);
			Data dataFim = new Data(diaF, diaDaSemanaF, mesF, anoF, horaF, minutoF);
			compromissos = new Compromissos(codigo, titulo, descricao, dataInicio, dataFim);
			System.out.println("Informe se esse compromisso se repete ou digite não para não se repetir:");
			scanner.nextLine();
			String repeticao = scanner.nextLine();
			compromissos.repetirCompromisso(repeticao);
			return c.criar(compromissos);
		}
	}

	public static void formEditarCompromisso(Scanner scanner, ControleCompromisso c){
		System.out.println("Informe o codigo do compromisso:");
		int codigo = scanner.nextInt();
		System.out.println("Informe o titulo:");
		scanner.nextLine();
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
			System.out.println("Informe se esse compromisso se repete ou digite não para não se repetir:");
			scanner.nextLine();
			String repeticao = scanner.nextLine();
			compromissos.repetirCompromisso(repeticao);
			c.editar(compromissos);
		}else{
			System.out.println("Informe data, mês e ano que o compromisso se iniciara:");
			int diaI = scanner.nextInt();
			String mesI = scanner.nextLine();
			int anoI = scanner.nextInt();
			System.out.println("Informe hora e minutos que compromisso se iniciara:");
			int horaI = scanner.nextInt();
			int minutoI = scanner.nextInt();
			System.out.println("Informe dia da semana de inicio do compromisso:");
			String diaDaSemanaI = scanner.nextLine();
			System.out.println("Informe data, mês e ano que o compromisso terminara:");
			int diaF = scanner.nextInt();
			String mesF = scanner.nextLine();
			int anoF = scanner.nextInt();
			System.out.println("Informe hora e minutos que o compromisso terminara:");
			int horaF = scanner.nextInt();
			int minutoF = scanner.nextInt();
			System.out.println("Informe dia da semana de termino do compromisso:");
			String diaDaSemanaF = scanner.nextLine();
			Data dataInicio = new Data(diaI, diaDaSemanaI, mesI, anoI, horaI, minutoI);
			Data dataFim = new Data(diaF, diaDaSemanaF, mesF, anoF, horaF, minutoF);
			compromissos = new Compromissos(codigo, titulo, descricao, dataInicio, dataFim);
			System.out.println("Informe se esse compromisso se repete ou digite não para não se repetir:");
			scanner.nextLine();
			String repeticao = scanner.nextLine();
			compromissos.repetirCompromisso(repeticao);
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
		scanner.nextLine();
		String descricao = scanner.nextLine();
		System.out.println("Informe a prioridade da tarefa: 1 - para alta, 2 - para média, 3 - para baixa");
		int prioridade = scanner.nextInt();
		System.out.println("Informe a data de conclusão da tarefa:");
		scanner.nextLine();
		String data = scanner.nextLine();
		boolean concluida = false;
		Tarefas tarefa = new Tarefas(codigo, descricao, prioridade, data, concluida);
		return ct.criar(tarefa);
	}

	public static void formEditarTarefa(Scanner scanner, ControleTarefas ct){
		System.out.println("Informe o código da tarefa: ");
		int codigo = scanner.nextInt();
		System.out.println("Informe a descrição da tarefa:");
		scanner.nextLine();
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
		System.out.println("Informe o código da tarefa que deseja remover:");
		int codigo = scanner.nextInt();
		Tarefas tarefa = new Tarefas(codigo);
		return ct.remover(tarefa);
	}

	public static void formMostrarTarefas(ControleTarefas ct){
		List<Tarefas> tarefas = ct.buscarTodos();
		for (int i = 0; i < tarefas.size(); i++){
			if (!tarefas.get(i).isConcluida() && tarefas.get(i).getPrioridade() == 1) {
				tarefas.get(i).mostrar();
			}
		}
		for (int i = 0; i < tarefas.size(); i++){
			if(!tarefas.get(i).isConcluida() && tarefas.get(i).getPrioridade() == 2) {
				tarefas.get(i).mostrar();
			}
		}
		for (int i = 0; i < tarefas.size(); i++){
			if(!tarefas.get(i).isConcluida() && tarefas.get(i).getPrioridade() == 3){
				tarefas.get(i).mostrar();
			}
		}
		for (int i = 0; i < tarefas.size(); i++){
			if (tarefas.get(i).isConcluida()){
				tarefas.get(i).mostrar();
			}
		}
	}

	public static void formCompletarTarefa(Scanner scanner, ControleTarefas ct){
		System.out.println("Informe o código da tarefa a ser completada:");
		int codigo = scanner.nextInt();
		Tarefas tarefa = ct.buscar(codigo);
		tarefa.completarTarefa();
		ct.editar(tarefa);
	}

	public static String formCadastroAniversario(Scanner scanner, ControleAniversario ca){
		int codigo = ca.tamanho() + 1;
		System.out.println("Informe o nome do aniversariante:");
		scanner.nextLine();
		String nome = scanner.nextLine();
		System.out.println("Informe o dia do aniversario:");
		String data = scanner.nextLine();
		System.out.println("Informe a data da festa:");
		String dataFesta = scanner.nextLine();
		System.out.println("Informe a hora da festa:");
		String horaFesta = scanner.nextLine();
		Aniversario aniversario = new Aniversario(codigo, nome, data, dataFesta, horaFesta);
		return ca.criar(aniversario);
	}

	public static void formEditarAniversario(Scanner scanner, ControleAniversario ca){
		System.out.println("Informe o código do aniversario:");
		int codigo = scanner.nextInt();
		System.out.println("Informe o nome do aniversariante:");
		scanner.nextLine();
		String nome = scanner.nextLine();
		System.out.println("Informe o dia do aniversario:");
		String data = scanner.nextLine();
		System.out.println("Informe a data da festa:");
		String dataFesta = scanner.nextLine();
		System.out.println("Informe a hora da festa:");
		String horaFesta = scanner.nextLine();
		Aniversario aniversario = new Aniversario(codigo, nome, data, dataFesta, horaFesta);
		ca.editar(aniversario);
	}

	public static String formRemoverAniversario(Scanner scanner, ControleAniversario ca){
		System.out.println("Informe o código do aniversário que deseja remover:");
		int codigo = scanner.nextInt();
		Aniversario aniversario = new Aniversario(codigo);
		return ca.remover(aniversario);
	}

	public static void formMostrarAniversario(ControleAniversario ca){
		List<Aniversario> aniversarios = ca.buscarTodos();
		for (int i = 0; i < aniversarios.size(); i++){
			aniversarios.get(i).mostrar();
		}
	}

	public static void formMostraFeriados(ControleFeriados cf){
		Feriados[] feriados = cf.buscarTodos();
		for (int i = 0; i < feriados.length; i++){
			feriados[i].mostrar();
		}
	}
}
