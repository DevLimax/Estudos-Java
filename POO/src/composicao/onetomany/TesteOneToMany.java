package composicao.onetomany;

import java.lang.classfile.constantpool.PackageEntry;

public class TesteOneToMany {
    public static void main(String[] args) {
        Produto produto1 = new Produto(100, "Notebook Acer", 6530.00);
        Produto produto2 = new Produto(132, "Notebook Lenovo", 8922.52);
        Produto produto3 = new Produto(542, "Mouse Redragon cobra", 240.30);
        Produto produto4 = new Produto(131, "Teclado mecanico - Logitech", 421.92);

        ItemPedido item1 = new ItemPedido(2918271, produto2);
        ItemPedido item2 = new ItemPedido(2817261, produto3, 5);

        Pedido pedido = new Pedido(92817212);
        pedido.itens.add(item1);
        pedido.itens.add(item2);

        System.out.println(pedido.get_valor_total());
    }
}
