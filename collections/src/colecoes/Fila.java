package colecoes;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Fila {
    public static void main(String[] args) {

        // FIFO - First In/ First Out -> Primeiro a entrar, Primeiro a sair.
        Queue<String> fila = new ArrayBlockingQueue<>(5);

        fila.add("ana"); // Adiciona ou retorna um exceção.
        fila.add("bia");
        fila.add("daniel");
        fila.add("carlos");
        fila.offer("ruan"); // Adiciona ou retorna False
        System.out.println(fila.offer("Gustavo")); // diferente do .add() o .offer() so adiciona o valor se a capacidade não tiver sido atingida.

        // Retornando o primeiro objeto;
        System.out.println(fila.peek()); // retorna o primeiro valor a ter sido inserido na fila, retorna null caso não tenha elementos na fila
        System.out.println(fila.element()); // retorna o primeiro valor tambem, mas retorna uma exceção caso não haja elementos

        // Retornando o primeiro objeto e removendo em sequencia;
        System.out.println("Retornando e removendo: " + fila.poll());
        System.out.println("Retornando e removendo: " + fila.remove()); // O .remove() retorna uma exceção caso não haja elementos.
        System.out.println("Retornando e removendo: " + fila.poll()); // O .poll() retorna null caso não haja mais elementos.
    }
}
