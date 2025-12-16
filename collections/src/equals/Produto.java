package equals;

import java.util.Objects;

public class Produto {

    int id;
    String nome;

    Produto (int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public boolean deepEquals(Produto produto) {

        boolean mesmo_id =  this.id == produto.id;
        boolean mesmo_nome = this.nome.equals(produto.nome);

        return mesmo_id && mesmo_nome;
    }
}
