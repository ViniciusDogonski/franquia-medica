/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import DAO.PessoaDAO;
import Ui.GUI;

/**
 *
 * @author Vinicius Augusto
 */
public class Programa {

    GUI gui = new GUI();
    PessoaDAO pessoaDAO = new PessoaDAO();

    public Programa() {

        int opcaoUsuario;
        do {

            opcaoUsuario = gui.pegaOpcaoUsuario();
            switch (opcaoUsuario) {
                case 1:

                    Pessoa p = gui.criaPessoa();

                    boolean pessoaInserido = pessoaDAO.adicionado(p);

                    if (pessoaInserido) {
                        System.out.println("pessoa inserido com sucesso");
                    } else {
                        System.out.println("pessoa nao inserido");
                    }

                    break;
                case 2:
                    pessoaDAO.mostrarTodos();
                    break;
                case 3:
                    /*System.out.println("Jogador procurado:");
                    String procurado = s.nextLine();
                    System.out.println("Novo nome:");
                    String novoNome = s.nextLine();
                    if (jogadorDAO.alterarNome(procurado, novoNome)) {
                        System.out.println("jogador alterado");
                    } else {
                        System.out.println("jogador não encontrado");
                    }*/

                    break;
                case 4:
                    /*System.out.println("Jogador procurado:");
                    String nomeExclusao = s.nextLine();

                    if (jogadorDAO.remover(nomeExclusao)) {
                        System.out.println("jogador excluído");
                    } else {
                        System.out.println("jogador não excluído");
                    }*/

                    break;
                case 5:
                    System.out.println("sair");
                    System.out.println("5");

                    break;

                default:
                    System.out.println("sair");

                    break;

            }
        } while (opcaoUsuario != 5);

    }

    public static void main(String[] args) {
        new Programa();
    }

}
