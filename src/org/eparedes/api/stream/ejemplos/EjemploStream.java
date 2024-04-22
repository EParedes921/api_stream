package org.eparedes.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        // Imprimiendo un Stream
        Stream<String> nombres1 = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        nombres1.forEach(System.out::println);

        // Array a Stream
        String[] arr = {"Pato", "Paco", "Pepa", "Pepes"};
        Stream<String> nombres2 = Arrays.stream(arr);
        nombres2.forEach(System.out::println);

        // StringBuilder a Stream
        Stream<String> nombres3 = Stream.<String>builder().add("Pato")
                .add("Paco")
                .add("Pepa")
                .add("Pepess")
                .build();
        nombres3.forEach(System.out::println);

        // List a Stream
        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepa");
        lista.add("Pepesss");

//        Stream<String> nombres4 = lista.stream();
//        nombres4.forEach(System.out::println);

        lista.stream().forEach(System.out::println);
    }
}
