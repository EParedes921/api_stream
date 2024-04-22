package org.eparedes.api.stream.ejemplos;

import org.eparedes.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres1 = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre =  usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        // Convierte de Stream a List
        // Muestra por separado
        List<Usuario> lista = nombres1.collect(Collectors.toList());
        lista.forEach(System.out::println);

        // Muestra los datos juntos
//        nombres1.forEach(System.out::println);


    }
}
