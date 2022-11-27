package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayDeReferencias {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];

        contas[0] = new ContaCorrente(111,111);
        contas[1] = new ContaCorrente(111, 222);

        System.out.println(contas[1]);
        System.out.println(contas[1].getNumero());

        ContaCorrente ref = contas[1];

        System.out.println(ref);

    }
}
