package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conexao;

public class TesteConexao {
    public static void main(String[] args) {


        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Erro na conexão!");
        }

//        br.com.bytebank.banco.modelo.Conexao con = null;
//        try {
//            con = new br.com.bytebank.banco.modelo.Conexao();
//            con.leDados();
//        } catch (IllegalStateException ex) {
//            System.out.println("Erro na conexão");
//        } finally {
//            con.fecha();
//        }

    }
}
