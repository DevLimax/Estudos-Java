package composicao.onetoone;

public class TesteOneToOne {
    public static void main(String[] args) {

        Senha senha = new Senha(1, "testejoao");

        Usuario user = new Usuario(
                5321,
                "João pedro lima",
                "jplinma@gmail.com",
                senha
        );

        System.out.println(user);

    }
}
