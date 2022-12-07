package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {
    public static void main(String[] args) {
        Integer idadeRef = Integer.valueOf(29); // Autoboxing
        System.out.println(idadeRef.intValue()); // Unboxing

        Double dRef = Double.valueOf(3.2); // Autoboxing
        System.out.println(dRef.doubleValue()); // Unboxing

        Boolean bRef = Boolean.TRUE; // Autoboxing
        System.out.println(bRef.booleanValue()); // Unboxing

//        Number refNumero = Integer.valueOf(29);
//        Number refNumero = Double.valueOf(29.9);
        Number refNumero = Float.valueOf(29.9f);

        System.out.println(refNumero);

        List<Number> lista = new ArrayList<>();

        lista.add(10);
        lista.add(3.1415);
        lista.add(25.5f);
        System.out.println(lista);



    }
}
