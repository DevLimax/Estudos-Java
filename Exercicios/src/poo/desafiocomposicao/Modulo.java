package poo.desafiocomposicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Modulo {

    int id;
    String nome;
    Curso curso;
    final List<Aula> aulas = new ArrayList<>();

    public Modulo(int id, String nome, Curso curso) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Modulo modulo = (Modulo) o;
        return id == modulo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", aulas=" + aulas +
                '}';
    }
}
