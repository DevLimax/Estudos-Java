package poo.desafiocomposicao;

import java.util.Objects;
import java.util.UUID;

public class Aula {
    UUID id;
    String nome;
    double duraçãoEmHoras;

    public Aula(String nome, double duraçãoEmHoras) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.duraçãoEmHoras = duraçãoEmHoras;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", duraçãoEmHoras=" + duraçãoEmHoras +
                '}';
    }
}
