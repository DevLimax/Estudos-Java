package equals;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto(62, "Notebook Acer G5");
        Produto p2 = new Produto(62, "Notebook Acer G2");

        System.out.println(p1 == p2); //false
        System.out.println(p1.equals(p2)); //false

        System.out.println(p1.id == p2.id); //true
        System.out.println(p1.nome.equals(p2.nome)); //true
        // os métodos que retornam true acima estão corretos mas eles utilizam os valores das variaveis como metodo de igualdade, para termos uma igualdade
        // pelo objeto Produto() temos que alterar o método .equals() da nossa classe;

        // agora com o .equals() alterado vai dar true;
        System.out.println(p1.equals(p2));
        System.out.println(p1.deepEquals(p2));

        System.out.println(p1.toString());
        System.out.println(Integer.parseInt("3e", 16));
    }
}
