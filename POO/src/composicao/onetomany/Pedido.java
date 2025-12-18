package composicao.onetomany;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    int id;
    final List<ItemPedido> itens = new ArrayList<>();

    public Pedido(int id) {
        this.id = id;
    }

    public double get_valor_total() {
        double total = 0;
        for (ItemPedido item: this.itens) {
            total += item.preco;
        }
        return total;
    }
}
