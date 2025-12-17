public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.id = 212;
        p1.nome = "Lenovo v14 gen 2";
        p1.preco = 3200.0;
        p1.desconto = 0.25;

        p2.id = 303;
        p2.nome = "Mouse Gamer Redragon Wireless";
        p2.preco = 180;
        p2.desconto = 0.40;

        System.out.printf("Produto: %s\nPreço: R$%.2f\nPreço com desconto de %.0f%%: R$%.2f\n", p1.nome, p1.preco, p1.desconto * 100, p1.precoDesconto());
        System.out.println("=================================");
        System.out.printf("Produto: %s\nPreço: R$%.2f\nPreço com desconto de %.0f%%: R$%.2f", p2.nome, p2.preco, p2.desconto * 100, p2.precoDesconto());
        System.out.println("=================================");
        System.out.println(p2);
    }
}
