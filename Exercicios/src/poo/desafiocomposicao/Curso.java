package poo.desafiocomposicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Curso {

    UUID id;
    String nome;
    final List<Modulo> modulos = new ArrayList<>();

    public Curso(String nome) {
        this.id = UUID.randomUUID();
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", modulos=" + modulos +
                '}';
    }

    int getDuracaoTotal() {
        int total = 0;
        for (Modulo modulo: modulos) {
            total += modulo.getDuracaoTotal();
        }
        return total;
    }
}
