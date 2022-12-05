package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        // Generics
        ArrayList<Conta> lista = new ArrayList<>();

        ContaCorrente cc = new ContaCorrente(123,321);
        lista.add(cc);

        ContaCorrente cc2 = new ContaCorrente(123,222);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        ContaCorrente cc3 = new ContaCorrente(222,321);
        lista.add(cc3);
        ContaCorrente cc4 = new ContaCorrente(123,111);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++) {
            Conta oRef = lista.get(i);
            System.out.println(oRef.toString());
        }

        System.out.println("---------------");

        for(Conta o : lista) {
            System.out.println(o.toString());
        }
    }
}
