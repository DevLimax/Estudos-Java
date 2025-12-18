package composicao.onetoone;

import java.util.Objects;

public class Senha {

    int id;
    String valor;

    public Senha(int id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Senha senha = (Senha) o;
        return id == senha.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
