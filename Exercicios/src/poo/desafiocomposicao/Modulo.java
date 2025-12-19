package poo.desafiocomposicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Modulo {

    UUID id;
    String nome;
    final List<Aula> aulas = new ArrayList<>();

    public Modulo(String nome) {
        this.id = UUID.randomUUID();
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", aulas=" + aulas +
                '}';
    }

    int getDuracaoTotal() {
        int total = 0;
        for (Aula aula : aulas) {
            total += aula.duraçãoEmHoras;
        }
        return total;
    }

    int getTotalAulas() {
        int total = 0;
        for (Aula aula: aulas) {
            total++;
        }
        return total;
    }
}
