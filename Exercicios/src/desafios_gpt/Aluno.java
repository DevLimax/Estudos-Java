package desafios_gpt;

public class Aluno {

    String nome;
    double[] notas = new double[3];

    public Aluno() {
        this("");
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    double calcularMedia() {

        double somaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }
        return somaNotas / notas.length;
    }
}
