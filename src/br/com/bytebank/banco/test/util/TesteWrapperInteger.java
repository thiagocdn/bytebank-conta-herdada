package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29;
        Integer idadeRef = new Integer(29);

        List<Integer> numeros = new ArrayList<>();

        numeros.add(29); // Autoboxing
        numeros.add(idade);
        numeros.add(idadeRef);

    }
}
