package br.com.agenda;

import br.com.controle.ControleAniversario;
import br.com.controle.ControleCompromisso;
import br.com.controle.ControleTarefas;
import br.com.models.Compromissos;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleCompromisso c = new ControleCompromisso();
        ControleAniversario ca = new ControleAniversario();
        ControleTarefas ct = new ControleTarefas();
        int opcao = 0;
        do {
            Menu.menuInicial();
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    Menu.menuCompromissos();
                    opcao = scanner.nextInt();
                    do {
                        switch (opcao){
                            case 1:
                                int codigo = c.tamanho() + 1;
                                System.out.println("Informe o titulo:");
                                String titulo = scanner.nextLine();
                                System.out.println("Informe a descrição:");
                                String descricao = scanner.nextLine();
                                System.out.println("Informe a duração:");
                                System.out.println("Se deseja que dure o dia inteiro digite: dia inteiro.");
                                String duracao = scanner.nextLine();
                                boolean diaInteiro = false;
                                if (duracao.equals("dia inteiro")){
                                    diaInteiro = true;
                                }
                                Compromissos compromissos;
                                if (diaInteiro){
                                    compromissos = new Compromissos(codigo, titulo, descricao, diaInteiro);
                                    c.criar(compromissos);
                                }else{
                                    System.out.println("Informe data e hora de inicio:");
                                    String data = scanner.nextLine();
                                    System.out.println("Informe data e hora de fim:");
                                    String dataFim = scanner.nextLine();
                                    compromissos = new Compromissos(codigo, titulo, descricao, data, dataFim);
                                    c.criar(compromissos);
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                    }while (opcao != 5);
                    break;
                case 2:
                    Menu.menuFeriados();
                    opcao = scanner.nextInt();
                    do {
                        switch (opcao){
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }while (opcao != 2);
                    break;
                case 3:
                    Menu.menuTarefas();
                    opcao = scanner.nextInt();
                    do {
                        switch (opcao){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                    }while (opcao != 5);
                    break;
                case 4:
                    Menu.menuAniversarios();
                    opcao = scanner.nextInt();
                    do {
                        switch (opcao){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                    }while (opcao != 5);
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
            }

        }while (opcao != 5);

    }
}

