package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("x");
        System.out.println(3);
        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(22,33);
        ContaPoupanca cp = new ContaPoupanca(33,44);

        System.out.println(cc);
        System.out.println(cp);

        println();
        println(12);
        println(true);
        println(cc);

        println("abc");

        cc.toString(); // IMPLEMENTADO NA CLASSE OBJECT!
    }

    static void println() {
//        ...
    }

    static void println(int x) {
//        ...
    }

    static void println(boolean x) {
//        ...
    }

//    static void println(ContaCorrente x) {
////        ...
//    }

//    static void println(ContaPoupanca x) {
////        ...
//    }

    static void println(Conta x) {
//        ...
    }

//    TODAS AS CLASSES TEM A CLASSE OBJECT COMO HERANÇA FINAL!!!
    static void println(Object x) {
//        ...
    }


//    ...


}
