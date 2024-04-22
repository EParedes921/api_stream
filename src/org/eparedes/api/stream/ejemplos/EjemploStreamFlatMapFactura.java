package org.eparedes.api.stream.ejemplos;

import org.eparedes.api.stream.ejemplos.models.Factura;
import org.eparedes.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("John", "Doe");
        Usuario u2 = new Usuario("Pepe", "Perez");

        u1.addFactura(new Factura("Compras tecnologias"));
        u1.addFactura(new Factura("Compras muebles"));

        u2.addFactura(new Factura("Bicicleta"));
        u2.addFactura(new Factura("Notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);
//        List<Usuario> usuarios = new ArrayList<>();
//        usuarios.add(u1);
//        usuarios.add(u2);

        //Forma 1 de imprimir las facturas
        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                        .concat(f.getUsuario().toString())));

        //Forma 2 de imprimir las facturas
        /*for (Usuario u: usuarios){
            for (Factura f:u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }*/
    }
}
