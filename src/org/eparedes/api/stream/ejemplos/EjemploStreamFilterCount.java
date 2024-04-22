package org.eparedes.api.stream.ejemplos;

import org.eparedes.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(u -> new Usuario(u.split(" ")[0], u.split(" ")[1]))
                .peek(System.out::println)
                .count();
        System.out.println(count);

    }
}
