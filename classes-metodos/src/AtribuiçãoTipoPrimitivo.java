public class AtribuiçãoTipoPrimitivo {
    public static void main(String[] args) {

        int a = 5;
        int b = a;

        a++;
        b--;

        // A atribuição de valores primitivos sempre cria um novo espaço na memoria para as variaveis, por mais que (b) tenha
        // recebido o valor de (a) ele não ocupa o mesmo espaço na memoria, isso faz com que eles tenham valores iguais, mas, separados;
        // oque altera em (a) não reflete em (b) e vice-versa.
        System.out.println(a);
        System.out.println(b);
    }
}
