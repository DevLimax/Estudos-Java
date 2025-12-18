package composicao.onetomany;

public class ItemPedido {

    int id;
    Produto produto;
    int quantidade;
    double preco;

    public ItemPedido(int id, Produto produto, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = produto.preco * quantidade;
    }

    public ItemPedido(int id, Produto produto) {
        this.id = id;
        this.produto = produto;
        this.quantidade = 1;
        this.preco = produto.preco * quantidade;
    }
}
