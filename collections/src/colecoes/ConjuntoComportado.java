package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        // Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>(); // TreeSet() é herdado do Set mas permite ordenação alfabetica/numerica.
        // Aqui diferente da lista anterior para deixarmos a lista de certa forma "comportada"/"homogênea
        // temos que declarar entre <> a classe que os nossos objetos irão conter, qlq objeto de classe diferente não sera inserido.

        listaAprovados.add("Ana larissa");
        listaAprovados.add("João pedro");
        listaAprovados.add("Natanael");
        listaAprovados.add("Leticia");
        listaAprovados.add("Felipe");

        for (String aprovado: listaAprovados) {
            System.out.println(aprovado);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(14);
        nums.add(3);
        nums.add(32);
        nums.add(52);
        nums.add(6);

        for (int numero: nums) {
            System.out.println(numero);
        }

    }
}
