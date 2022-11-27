package br.com.bytebank.banco.teste;

public class Teste {

    public static void main(String[] args) {
        int[] idades = new int[5];

//        int idade1 = 19;
//        int idade2 = 29;
//        int idade3 = 39;
//        int idade4 = 49;
//        int idade5 = 59;

//        idades[0] = 19;
//        idades[1] = 29;
//        idades[2] = 39;
//        idades[3] = 49;
//        idades[4] = 59;

        for(int i = 0; i < idades.length; i++) {
            idades[i] = (i+1)*10 + 9;
        }
        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

//        int idade1 = idades[3];
//        System.out.println(idade1);
//        System.out.println(idades.length);



    }
}
