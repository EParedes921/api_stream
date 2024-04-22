package org.eparedes.api.stream.ejemplos;

import org.eparedes.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuarioSum {
    public static void main(String[] args) {

        IntStream largoNombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia", "Pato Guzman")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);

        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println("suma de caracteres: " + stats.getSum());
        System.out.println("max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Promedio: " + stats.getAverage());

    }
}
