public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 23);
        Pessoa p2 = p1;

        p2.nome = "Mauricio";

        // Agora com a atribuição de variaveis com classe, faz com que variaveis ocupem o mesmo espaço na memoria;
        System.out.println(p1.nome);
    }
}
