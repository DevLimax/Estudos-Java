package poo.desafiocomposicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Progresso {

    UUID id;
    Aula aula;
    boolean concluida;

    public Progresso(Aula aula) {
        this(aula, false);
    }

    public Progresso(Aula aula, boolean concluida) {
        this.id = UUID.randomUUID();
        this.aula = aula;
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Progresso{" +
                "id=" + id +
                ", aula=" + aula +
                ", concluida=" + concluida +
                '}';
    }
}
