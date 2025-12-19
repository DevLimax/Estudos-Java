package poo.desafiocomposicao;

import java.util.*;

public class Inscricao {

    UUID id;
    Aluno aluno;
    Curso curso;
    Date data_inscricao;
    final List<Progresso> progressos;

    public Inscricao(Curso curso, Aluno aluno) {
        this.id = UUID.randomUUID();
        this.curso = curso;
        this.aluno = aluno;
        this.data_inscricao = new Date();
        this.progressos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Inscricao{" +
                "id=" + id +
                ", data_inscricao=" + data_inscricao +
                ", progressos=" + progressos +
                '}';
    }

    double getPercentualProgresso() {
        int total_aulas_assistidas = 0;
        for (Progresso progresso: progressos) {
            if (progresso.concluida) {
                total_aulas_assistidas++;
            }
        }
        return (double) total_aulas_assistidas / this.curso.getTotalAulas() * 100;
    }

}
