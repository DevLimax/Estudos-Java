package poo.desafiocomposicao;

import java.util.ArrayList;
import java.util.List;

public class  CatalogoCursos {

    private final List<Curso> cursos = new ArrayList<>();

    public CatalogoCursos() {
        cadastrarCursosPadrao();
    }

    // ===== Cadastro inicial =====
    private void cadastrarCursosPadrao() {

        // ===== Curso Java =====
        Curso cursoJava = new Curso("Java Completo");

        Modulo javaBasico = new Modulo("Java Básico");
        javaBasico.aulas.add(new Aula("Introdução ao Java", 1.5));
        javaBasico.aulas.add(new Aula("Variáveis e Tipos de Dados", 2.0));
        javaBasico.aulas.add(new Aula("Estruturas de Controle", 2.5));

        Modulo javaPOO = new Modulo("Programação Orientada a Objetos");
        javaPOO.aulas.add(new Aula("Classes e Objetos", 2.0));
        javaPOO.aulas.add(new Aula("Herança e Polimorfismo", 2.5));
        javaPOO.aulas.add(new Aula("Encapsulamento", 1.5));

        cursoJava.modulos.add(javaBasico);
        cursoJava.modulos.add(javaPOO);

        // ===== Curso Python =====
        Curso cursoPython = new Curso("Python para Iniciantes");

        Modulo pythonFundamentos = new Modulo("Fundamentos do Python");
        pythonFundamentos.aulas.add(new Aula("Sintaxe Básica", 1.5));
        pythonFundamentos.aulas.add(new Aula("Listas e Dicionários", 2.0));
        pythonFundamentos.aulas.add(new Aula("Funções", 1.5));

        Modulo pythonIntermediario = new Modulo("Python Intermediário");
        pythonIntermediario.aulas.add(new Aula("Manipulação de Arquivos", 2.0));
        pythonIntermediario.aulas.add(new Aula("Módulos e Pacotes", 1.5));

        cursoPython.modulos.add(pythonFundamentos);
        cursoPython.modulos.add(pythonIntermediario);

        // ===== Curso JavaScript =====
        Curso cursoJavaScript = new Curso("JavaScript Moderno");

        Modulo jsBasico = new Modulo("JavaScript Básico");
        jsBasico.aulas.add(new Aula("Introdução ao JavaScript", 1.0));
        jsBasico.aulas.add(new Aula("Variáveis e Funções", 2.0));
        jsBasico.aulas.add(new Aula("Arrays e Objetos", 2.0));

        Modulo jsWeb = new Modulo("JavaScript para Web");
        jsWeb.aulas.add(new Aula("DOM e Eventos", 2.5));
        jsWeb.aulas.add(new Aula("Fetch API", 2.0));

        cursoJavaScript.modulos.add(jsBasico);
        cursoJavaScript.modulos.add(jsWeb);

        // Adicionando ao catálogo
        cursos.add(cursoJava);
        cursos.add(cursoPython);
        cursos.add(cursoJavaScript);
    }

    // ===== Listar todos os cursos =====
    public List<Curso> listarTodos() {
        return cursos;
    }

    // ===== Buscar curso pelo nome =====
    public Curso buscarPorNome(String nome) {
        for (Curso curso : cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null; // não encontrado
    }
}
