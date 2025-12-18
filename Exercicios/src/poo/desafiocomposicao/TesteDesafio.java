package poo.desafiocomposicao;

import java.util.ArrayList;
import java.util.regex.MatchResult;

public class TesteDesafio {

    public static void main(String[] args) {

        // Criando os cursos, modulos, aulas.
        Curso c1 = new Curso(1, "Curso de Python Completo");
        Curso c2 = new Curso(2, "Formação Java");
        Curso c3 = new Curso(3, "Estrategias de codificação");

        Modulo m1_curso1 = new Modulo(312, "Fundamentos", c1);
        Modulo m2_curso1 = new Modulo(351, "POO na pratica", c1);
        Modulo m1_curso2 = new Modulo(542, "Introdução ao java", c2);
        Modulo m2_curso2 = new Modulo(123, "Spring com java", c2);
        Modulo m1_curso3 = new Modulo(642, "Estruturas de cogido", c3);
        Modulo m2_curso3 = new Modulo(311, "Metodologia de implementação", c3);

        Aula a1_mod1_curso1 = new Aula(1, "Print e Input no python", 0.34, m1_curso1); // modulo 1 curso 1
        Aula a2_mod1_curso1 = new Aula(2, "estrutura de controle - FOR", 0.51, m1_curso1); // modulo 1 curso 1
        Aula a1_mod2_curso1 = new Aula(3523, "Herança", 0.22, m2_curso1); // modulo 2 curso 1
        Aula a2_mod2_curso1 = new Aula(5522, "Polimorfismo", 0.36, m2_curso1); // modulo 2 curso 1

        m1_curso1.aulas.add(a1_mod1_curso1);
        m1_curso1.aulas.add(a2_mod1_curso1);
        m2_curso1.aulas.add(a1_mod2_curso1);
        m2_curso1.aulas.add(a2_mod2_curso1);

        // curso 2
        Aula a1_mod1_curso2 = new Aula(4342, "Oque é o Java?", 0.42, m1_curso2);
        Aula a2_mod1_curso2 = new Aula(31231, "Instalação do Intellij Idea", 0.12, m2_curso2);

        m1_curso2.aulas.add(a1_mod1_curso2);
        m1_curso2.aulas.add(a2_mod1_curso2);

        c1.modulos.add(m1_curso1);
        c1.modulos.add(m2_curso1);

        c2.modulos.add(m1_curso2);
        c2.modulos.add(m2_curso2);

        c3.modulos.add(m1_curso3);
        c3.modulos.add(m2_curso3);

        // Criando Aluno, Inscrição e Progresso

        Aluno aluno1 = new Aluno(43, "João pedro", "jplinma@gmail.com");
        Aluno aluno2 = new Aluno(21, "Maria Isis", "misis@gmail.com");

        aluno1.matriculas.add(
                new Inscricao(315432, aluno1, c1)
        );
        aluno1.matriculas.add(
                new Inscricao(341231, aluno1, c3)
        );

        for (Inscricao matricula: aluno1.matriculas) {
            matricula.progresso.adicionar_aula();
        }

        System.out.printf("Dados:\nid: %d\nnome: %s\nemail: %s\n", aluno1.id, aluno1.nome, aluno1.email);
        System.out.println("Matriculas:");
        for (Inscricao matricula: aluno1.matriculas) {
            System.out.println("===========================");
            System.out.printf("id: %d\ncurso: %s\ndata de inscrição: %tD\nprogresso: %.1f%%\n",
                    matricula.id, matricula.curso.nome, matricula.data_inscricao, matricula.progresso.percentual_progresso);
        }
    }
}
