package poo.desafiocomposicao;

import java.util.ArrayList;
import java.util.List;

public class TesteEAD {
    public static void main(String[] args) {

        CatalogoCursos catalogo = new CatalogoCursos();
        Curso curso_1 = catalogo.listarTodos().getFirst();

        Aluno a1 = new Aluno(
                "João pedro",
                "jplinma@gmail.com"
        );
        Aluno a2 = new Aluno(
                "Ana alice",
                "anlice@gmail.com"
        );

        Inscricao nova_inscricao = new Inscricao(curso_1, a1 );
        a1.matriculas.add(nova_inscricao);

        nova_inscricao.progressos.add(
                new Progresso(
                        curso_1.modulos.getFirst().aulas.getFirst(),
                        true
                )
        );
        nova_inscricao.progressos.add(
                new Progresso(
                        curso_1.modulos.getFirst().aulas.get(1),
                        true
                )
        );
        nova_inscricao.progressos.add(
                new Progresso(
                        curso_1.modulos.getFirst().aulas.get(2),
                        true
                )
        );
        nova_inscricao.progressos.add(
                new Progresso(
                        curso_1.modulos.get(1).aulas.getFirst(),
                        true
                )
        );

        System.out.println(a1);
        System.out.println(a1.matriculas.getFirst());
        System.out.printf("%.1f%%", nova_inscricao.getPercentualProgresso());
    }
}
