package teste;

import modelo.Conexao;

public class TesteConexao {
    public static void main(String[] args) {


        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Erro na conexão!");
        }

//        modelo.Conexao con = null;
//        try {
//            con = new modelo.Conexao();
//            con.leDados();
//        } catch (IllegalStateException ex) {
//            System.out.println("Erro na conexão");
//        } finally {
//            con.fecha();
//        }

    }
}
