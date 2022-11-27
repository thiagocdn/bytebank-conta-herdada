package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencias {
    public static void main(String[] args) {
        Object[] referencias = new Object[5];

        referencias[0] = new ContaCorrente(111,111);
        referencias[1] = new ContaPoupanca(111, 222);

        referencias[3] = new Cliente();

//        System.out.println(referencias[1]);
//        System.out.println(referencias[1].getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1];

        System.out.println(ref);

    }
}
