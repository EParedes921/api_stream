package org.eparedes.api.stream.ejemplos;

import org.eparedes.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {

//        Usuario usuario = Stream
//                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
//                .map(u -> new Usuario(u.split(" ")[0], u.split(" ")[1]))
//                .filter(u -> u.getNombre().equals("Pepe"))
//                .findFirst().get();

        Usuario usuario = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(u -> new Usuario(u.split(" ")[0], u.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(4))
                .findFirst().orElseGet(() -> new Usuario("John", "Doe"));

        System.out.println(usuario.getNombre());

    }
}
