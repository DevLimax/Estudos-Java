package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        // LIFO -> Last In / First Out -> Ultimo a entrar, Primeiro a sair.

        // Sempre chego atrasado na empresa, mas sou o primeiro sair, ate pq 1 erro eu aceito

        Deque<String> livros = new ArrayDeque<>();

        // metodos de adicionar um elemento.
        livros.push("O pequeno principe");
        livros.add("Harry potter e a pedra filosofal");
        livros.push("Dom quixote");

        System.out.println(livros);

        // metodos de retornar o primeiro elemento da lista.
        System.out.println(livros.peek());
        System.out.println(livros.element());

        // metodos de retornar o primeiro elemento, removendo após retorno
        System.out.println(livros.pop());
        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll()); // .poll() retorna null caso não haja elementos
        // System.out.println(livros.pop()); -> .pop() exige que haja elementos na lista para serem retornados;

        System.out.println(livros.size());
        System.out.println(livros.isEmpty()); // retorna True caso a lista esteja vazia.

    }
}
