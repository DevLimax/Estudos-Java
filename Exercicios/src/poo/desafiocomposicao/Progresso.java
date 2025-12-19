package poo.desafiocomposicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Progresso {

    double percentual_progresso;
    Inscricao matricula;
    int aulas_concluidas = 0;

    public Progresso(Inscricao matricula) {
        this.matricula = matricula;
    }

    public void adicionar_aula_concluida() {
        aulas_concluidas++;
        int total_aulas_curso = 0;

        for (Modulo modulo: this.matricula.curso.modulos) {
            total_aulas_curso += modulo.aulas.size();
        }

        if (total_aulas_curso > 0) {
            percentual_progresso = (double) aulas_concluidas / total_aulas_curso * 100;
        }
    }

    @Override
    public String toString() {
        return "Progresso{" +
                "percentual_progresso=" + percentual_progresso +
                ", aulas_concluidas=" + aulas_concluidas +
                '}';
    }
}
