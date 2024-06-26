package org.eparedes.api.stream.ejemplos;

import org.eparedes.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
//        System.out.println(usuario.orElse(new Usuario("John", "Doe")).getNombre());
//        System.out.println(usuario.orElseGet(() -> new Usuario("John", "Doe")).getNombre());
        if(usuario.isPresent()){
            System.out.println(usuario.get().getNombre());
        } else{
            System.out.println("No se encontró el objeto!");
        }

    }
}
