package org.eparedes.api.stream.ejemplos;

import org.eparedes.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);

        // Convierte de Stream a List
        // Muestra por separado
        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

        // Muestra los datos juntos
//        nombres.forEach(System.out::println);


    }
}
