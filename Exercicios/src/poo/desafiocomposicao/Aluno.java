package poo.desafiocomposicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

    int id;
    String nome;
    String email;

    final List<Inscricao> matriculas = new ArrayList<>();

    public Aluno(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id == aluno.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", matriculas=" + matriculas +
                '}';
    }
}
