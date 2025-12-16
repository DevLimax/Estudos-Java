package classes_metodos;

public class Pessoa {

    String name;
    double peso; // em KG como unidade de peso

    Pessoa () {}

    Pessoa (String name, double peso) {
        this.name = name;
        this.peso = peso;
    }

    void comer(Comida comida) {
        this.peso += comida.peso;
        System.out.printf("%s comeu %s\n", this.name, comida.name);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", peso=" + peso +
                '}';
    }

}
