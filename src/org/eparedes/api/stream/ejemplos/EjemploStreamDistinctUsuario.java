package org.eparedes.api.stream.ejemplos;

import org.eparedes.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia", "Pato Guzman")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
                .distinct();
        nombres.forEach(System.out::println);

    }
}
