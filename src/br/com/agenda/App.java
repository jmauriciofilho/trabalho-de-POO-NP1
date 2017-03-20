package br.com.agenda;

import br.com.controle.ControleAniversario;
import br.com.controle.ControleCompromisso;
import br.com.controle.ControleFeriados;
import br.com.controle.ControleTarefas;
import br.com.models.Compromissos;
import br.com.models.Tarefas;

import java.util.Scanner;

/**
 * Created by mauricio on 08/03/17.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleCompromisso c = new ControleCompromisso();
        ControleAniversario ca = new ControleAniversario();
        ControleTarefas ct = new ControleTarefas();
        ControleFeriados cf = new ControleFeriados();
        int opcao = 0;
        do {
            Menu.menuInicial();
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    do {
                        Menu.menuCompromissos();
                        opcao = scanner.nextInt();
                        switch (opcao){
                            case 1:
                                Formularios.formCadastroCompromisso(scanner, c);
                                break;
                            case 2:
                                Formularios.formEditarCompromisso(scanner, c);
                                break;
                            case 3:
                                Formularios.formRemoverCompromisso(scanner, c);
                                break;
                            case 4:
                                Formularios.formMostrarCompromissos(c);
                                break;
                            case 5:
                                System.out.println("Menu anterior.");
                                break;
                        }
                    }while (opcao != 5);
                    break;
                case 2:
                    do {
                        Menu.menuFeriados();
                        opcao = scanner.nextInt();
                        switch (opcao){
                            case 1:
                                Formularios.formMostraFeriados(cf);
                                break;
                            case 2:
                                System.out.println("Menu anterior.");
                                break;
                        }
                    }while (opcao != 2);
                    break;
                case 3:
                    do {
                        Menu.menuTarefas();
                        opcao = scanner.nextInt();
                        switch (opcao){
                            case 1:
                                Formularios.formCadastrarTarefa(scanner, ct);
                                break;
                            case 2:
                                Formularios.formEditarTarefa(scanner, ct);
                                break;
                            case 3:
                                Formularios.formRemoverTarefa(scanner, ct);
                                break;
                            case 4:
                                Formularios.formMostrarTarefas(ct);
                                break;
                            case 5:
                                Formularios.formCompletarTarefa(scanner, ct);
                                break;
                            case 6:
                                System.out.println("Menu anterior.");
                                break;
                        }
                    }while (opcao != 6);
                    break;
                case 4:
                    do {
                        Menu.menuAniversarios();
                        opcao = scanner.nextInt();
                        switch (opcao){
                            case 1:
                                Formularios.formCadastroAniversario(scanner, ca);
                                break;
                            case 2:
                                Formularios.formEditarAniversario(scanner, ca);
                                break;
                            case 3:
                                Formularios.formRemoverAniversario(scanner, ca);
                                break;
                            case 4:
                                Formularios.formMostrarAniversario(ca);
                                break;
                            case 5:
                                System.out.println("Menu anterior.");
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
