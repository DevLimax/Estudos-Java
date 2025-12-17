public class Produto {

    int id;
    String nome;
    double preco;
    double desconto;

    double precoDesconto() {
        return this.preco * (1 - this.desconto);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                '}';
    }
}
