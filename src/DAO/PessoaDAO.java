/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Objects.Pessoa;

/**
 *
 * @author Vinicius Augusto
 */
public class PessoaDAO {

    private Pessoa[] pessoas = new Pessoa[500];


    public  PessoaDAO(){

          Pessoa p1 = new Pessoa();
        p1.setNome("josephina");
        this.adicionado(p1);

        Pessoa p2 = new Pessoa();
        p2.setNome("jaspion");
          this.adicionado(p2);

}
    
    
  public boolean adicionado(Pessoa p) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            pessoas[proximaPosicaoLivre] = p;
            return true;
        } else {
            return false;
        }

    }
    
    public boolean ehVazio() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                return false;
            }
        }
        return true;

    }
    
    private int proximaPosicaoLivre() {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                return i;
            }

        }
        return -1;
    }
    
    
        public void mostrarTodos() {
        boolean temPessoas = false;
        for (Pessoa p : pessoas) {
            if (p != null) {
                System.out.println(p);
                temPessoas = true;
            }
        }
        if (!temPessoas) {
            System.out.println("não existe pessoas cadastrado");
        }
    }


}
