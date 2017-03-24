package br.com.agenda;
/**
 * Created by mauricio on 11/03/17.
 */
public class Menu {

	public static void menuInicial(){
		System.out.println("==========Menu Inical==========");
		System.out.println("=Escolha uma opção:============");
		System.out.println("=0 - Menu Agenda===============");
		System.out.println("=1 - Menu Compromissos=========");
		System.out.println("=2 - Menu Feriados=============");
		System.out.println("=3 - Menu Tarefas==============");
		System.out.println("=4 - Menu Aniversários=========");
		System.out.println("=8 - Sair======================");
	}

	public static void menuAgenda(){
		System.out.println("==========Menu Agenda==========");
		System.out.println("=Escolha uma opção:============");
		System.out.println("=1 - Agenda por mês============");
		System.out.println("=2 - Voltar====================");
	}

	public static void menuCompromissos(){
		System.out.println("==========Menu Compromissos==========");
		System.out.println("=Escolha uma opção:==================");
		System.out.println("=1 - Adicionar Compromisso===========");
		System.out.println("=2 - Editar Compromisso==============");
		System.out.println("=3 - Remover Compromisso=============");
		System.out.println("=4 - Ver todos os compromissos=======");
		System.out.println("=5 - Voltar==========================");
	}

	public static void menuFeriados(){
		System.out.println("==========Menu Feriados==========");
		System.out.println("=Escolha uma opção:==============");
		System.out.println("=1 - Ver todos os feriados=======");
		System.out.println("=2 - Voltar======================");
	}

	public static void menuTarefas(){
		System.out.println("==========Menu tarefas===============");
		System.out.println("=Escolha uma opção:==================");
		System.out.println("=1 - Adicionar tarefa================");
		System.out.println("=2 - Editar tarefa===================");
		System.out.println("=3 - Remover tarefa==================");
		System.out.println("=4 - Ver todas as tarefas============");
		System.out.println("=5 - Completar tarefa.===============");
		System.out.println("=6 - Voltar==========================");
	}

	public static void menuAniversarios(){
		System.out.println("==========Menu Aniversariante==========");
		System.out.println("=Escolha uma opção:====================");
		System.out.println("=1 - Adicionar aniversario=============");
		System.out.println("=2 - Editar aniversario================");
		System.out.println("=3 - Remover aniversario===============");
		System.out.println("=4 - Ver todos os aniversarios=========");
		System.out.println("=5 - Voltar============================");
	}
}
