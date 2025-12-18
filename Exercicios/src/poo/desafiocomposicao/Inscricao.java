package poo.desafiocomposicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Inscricao {

    int id;
    Aluno aluno;
    Curso curso;
    Date data_inscricao;
    Progresso progresso = new Progresso(this);

    public Inscricao(int id, Aluno aluno, Curso curso) {
        this.id = id;
        this.aluno = aluno;
        this.curso = curso;
        this.data_inscricao = new Date();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inscricao inscricao = (Inscricao) o;
        return id == inscricao.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Inscricao{" +
                "id=" + id +
                ", data_inscricao=" + data_inscricao +
                ", progresso=" + progresso +
                '}';
    }
}
