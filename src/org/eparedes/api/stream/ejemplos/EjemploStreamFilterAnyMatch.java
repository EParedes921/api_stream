package org.eparedes.api.stream.ejemplos;

import org.eparedes.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        // Forma Funcional
        boolean existe = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(u -> new Usuario(u.split(" ")[0], u.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(2));
        System.out.println(existe);


        // Forma Tradicional
//        List<String> lista = Arrays.asList("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia");
//        List<Usuario> usuarios = new ArrayList<>();
//        for (String l:lista){
//            usuarios.add(new Usuario(l.split(" ")[0], l.split(" ")[1]));
//        }
//        boolean resultado = false;
//        for (Usuario u:usuarios){
//            System.out.println(u);
//            if(u.getId().equals(2)){
//                resultado = true;
//                break;
//            }
//        }
//        System.out.println(resultado);
    }
}
