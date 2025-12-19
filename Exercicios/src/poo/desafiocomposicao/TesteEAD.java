package poo.desafiocomposicao;

import java.util.ArrayList;
import java.util.List;

public class TesteEAD {
    public static void main(String[] args) {

        CatalogoCursos catalogo = new CatalogoCursos();

        Curso curso = catalogo.listarTodos().getFirst();
        System.out.println(curso.getDuracaoTotal());
        System.out.println(curso.modulos.getFirst().getDuracaoTotal());

    }
}
