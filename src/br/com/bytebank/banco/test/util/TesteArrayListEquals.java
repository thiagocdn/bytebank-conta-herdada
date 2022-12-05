package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
//        Conta cc1 = new ContaCorrente(11, 11);
//        Conta cc2 = new ContaCorrente(11, 11);
//        boolean igual = cc1.ehIgual(cc2);
//        System.out.println(igual);

        // Generics
        ArrayList<Conta> lista = new ArrayList<>();

        ContaCorrente cc = new ContaCorrente(123,321);
        lista.add(cc);

        ContaCorrente cc2 = new ContaCorrente(123,222);
        lista.add(cc2);

        ContaCorrente cc3 = new ContaCorrente(123,222);

//        boolean existe = lista.contains(cc2);
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for (Conta oRef : lista) {
            System.out.println(oRef);
        }

    }
}
