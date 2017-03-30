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
		System.out.println("Cadastre um compromisso:");
		int codigo = c.tamanho() + 1;
		System.out.println("Informe o titulo:");
		scanner.nextLine();
		String titulo = scanner.nextLine();
		System.out.println("Informe a descrição:");
		String descricao = scanner.nextLine();
		System.out.println("Informe a duração:");
		System.out.println("Deseja que dure o dia inteiro? Sim ou Não");
		String duracao = scanner.next().toUpperCase();
		System.out.println("O Compromisso terá repetições? Sim ou Não");
		String repetir = scanner.next().toUpperCase();
		boolean diaInteiro = false;
		if (duracao.equals("SIM")){
			diaInteiro = true;
		}
		Compromissos compromissos;
		if (diaInteiro){
			System.out.println("Informe a data que o compromisso ocorre:");
			System.out.println("Por favor informe nesse formato: DD/MM/AAAA");
			String data = scanner.next();
			Data dataInicio = new Data(data);
			compromissos = new Compromissos(codigo, titulo, descricao, dataInicio, diaInteiro);
			if(repetir.equals("SIM")){
				System.out.println("Informe o que será repetido: DIA, MES ou ANO");
				String escolhaDiaMesAno = scanner.next().toUpperCase();
				System.out.println("Informe o número de vezes: Ex.:1, 2, 4...");
				int repeticao = scanner.nextInt();
				compromissos.repetirCompromissos(compromissos, escolhaDiaMesAno, repeticao);;
			}
			return c.criar(compromissos);
		}else{
			System.out.println("Informe a data que o compromisso se inicia:");
			System.out.println("Por favor informe nesse formato: DD/MM/AAAA");
			String dataI = scanner.next();
			System.out.println("Informe a hora que compromisso se inicia:");
			System.out.println("Por favor informe nesse formato: HH:MM");
			String horaI = scanner.next();
			System.out.println("Informe a data de termino do compromisso:");
			System.out.println("Por favor informe nesse formato: DD/MM/AAAA");
			String dataF = scanner.next();
			System.out.println("Informe a hora de termino do compromisso:");
			System.out.println("Por favor informe nesse formato: HH:MM");
			String horaF = scanner.next();
			Data dataInicio = new Data(dataI, horaI);
			Data dataFim = new Data(dataF, horaF);
			compromissos = new Compromissos(codigo, titulo, descricao, dataInicio, dataFim);
			if(repetir.equals("SIM")){
				System.out.println("Informe o que será repetido: DIA, MES ou ANO");
				String escolhaDiaMesAno = scanner.next().toUpperCase();
				System.out.println("Informe o número de vezes: Ex.:1, 2, 4...");
				int repeticao = scanner.nextInt();
				compromissos.repetirCompromissos(compromissos, escolhaDiaMesAno, repeticao);
			}
			return c.criar(compromissos);
		}
	}

	public static void formEditarCompromisso(Scanner scanner, ControleCompromisso c){
		System.out.println("Informe o código do compromisso a ser editado:");
		int codigo = scanner.nextInt();
		System.out.println("Informe o titulo:");
		scanner.nextLine();
		String titulo = scanner.nextLine();
		System.out.println("Informe a descrição:");
		String descricao = scanner.nextLine();
		System.out.println("Informe a duração:");
		System.out.println("Deseja que dure o dia inteiro? Sim ou Não");
		String duracao = scanner.nextLine().toUpperCase();
		boolean diaInteiro = false;
		if (duracao.equals("SIM")){
			diaInteiro = true;
		}
		Compromissos compromissos;
		if (diaInteiro){
			System.out.println("Informe a data que o compromisso ocorre:");
			System.out.println("Por favor informe nesse formato: DD/MM/AAAA");
			String data = scanner.next();
			Data dataInicio = new Data(data);
			compromissos = new Compromissos(codigo, titulo, descricao, dataInicio, diaInteiro);
			c.editar(compromissos);
		}else{
			System.out.println("Informe a data que o compromisso se inicia:");
			System.out.println("Por favor informe nesse formato: DD/MM/AAAA");
			String dataI = scanner.next();
			System.out.println("Informe a hora que compromisso se inicia:");
			System.out.println("Por favor informe nesse formato: HH:MM");
			String horaI = scanner.next();
			System.out.println("Informe a data de termino do compromisso:");
			System.out.println("Por favor informe nesse formato: DD/MM/AAAA");
			String dataF = scanner.next();
			System.out.println("Informe a hora de termino do compromisso:");
			System.out.println("Por favor informe nesse formato: HH:MM");
			String horaF = scanner.next();
			Data dataInicio = new Data(dataI, horaI);
			Data dataFim = new Data(dataF, horaF);
			compromissos = new Compromissos(codigo, titulo, descricao, dataInicio, dataFim);
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
		System.out.println("Cadastre uma terefa:");
		int codigo = ct.tamanho() + 1;
		System.out.println("Informe a descrição da tarefa:");
		scanner.nextLine();
		String descricao = scanner.nextLine();
		System.out.println("Informe a prioridade da tarefa: 1 - para alta, 2 - para média, 3 - para baixa");
		int prioridade = scanner.nextInt();
		System.out.println("Informe a data de conclusão da tarefa:");
		System.out.println("Por favor informe nesse formato: DD/MM/AAAA");
		String data = scanner.next();
		Data dataconclusao = new Data(data);
		boolean concluida = false;
		Tarefas tarefa = new Tarefas(codigo, descricao, prioridade, dataconclusao, concluida);
		return ct.criar(tarefa);
	}

	public static void formEditarTarefa(Scanner scanner, ControleTarefas ct){
		System.out.println("Informe o código da tarefa a ser editada: ");
		int codigo = scanner.nextInt();
		System.out.println("Informe a descrição da tarefa:");
		scanner.nextLine();
		String descricao = scanner.nextLine();
		System.out.println("Informe a prioridade da tarefa: 1 - para alta, 2 - para média, 3 - para baixa");
		int prioridade = scanner.nextInt();
		System.out.println("Informe a data de conclusão da tarefa:");
		System.out.println("Por favor informe nesse formato: DD/MM/AAAA");
		String data = scanner.next();
		Data dataconclusao = new Data(data);
		boolean concluida = false;
		Tarefas tarefa = new Tarefas(codigo, descricao, prioridade, dataconclusao, concluida);
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
		System.out.println("Cadastre um aniversário:");
		int codigo = ca.tamanho() + 1;
		System.out.println("Informe o nome do aniversariante:");
		scanner.nextLine();
		String nome = scanner.nextLine();
		System.out.println("Informe a data do aniversário:");
		System.out.println("Por favor informe nesse formato: DD/MM/AAAA");
		String dataNiver = scanner.next();
		Data data = new Data(dataNiver);
		System.out.println("Informe a data da festa:");
		System.out.println("Por favor informe nesse formato: DD/MM/AAAA");
		String dataFesta = scanner.next();
		System.out.println("Informe a hora da festa:");
		System.out.println("Por favor informe nesse formato: HH:MM");
		String horaFesta = scanner.next();
		Aniversario aniversario = new Aniversario(codigo, nome, data, dataFesta, horaFesta);
		return ca.criar(aniversario);
	}

	public static void formEditarAniversario(Scanner scanner, ControleAniversario ca){
		System.out.println("Informe o código do aniversario:");
		int codigo = scanner.nextInt();
		System.out.println("Informe o nome do aniversariante:");
		scanner.nextLine();
		String nome = scanner.nextLine();
		System.out.println("Informe a data do aniversário:");
		System.out.println("Por favor informe nesse formato: DD/MM/AAAA");
		String dataNiver = scanner.next();
		Data data = new Data(dataNiver);
		System.out.println("Informe a data da festa:");
		String dataFesta = scanner.next();
		System.out.println("Informe a hora da festa:");
		String horaFesta = scanner.next();
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
