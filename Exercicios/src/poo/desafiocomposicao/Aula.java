package poo.desafiocomposicao;

import java.util.Objects;

public class Aula {

    int id;
    String nome;
    double duracao;
    Modulo modulo;

    public Aula(int id, String nome, double duracao, Modulo modulo) {
        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
        this.modulo = modulo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return id == aula.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
