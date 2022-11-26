package br.com.bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {

        int a = 3;
        String nome = "Alura"; // Object Literal
//        String nome2 = new String("Alura");

        String nomeReplace = nome.replace("A", "a");

        String nomeLower = nome.toLowerCase();

        System.out.println(nome);
        System.out.println(nomeReplace);
        System.out.println(nomeLower);

    }
}
