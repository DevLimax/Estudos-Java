package controle;

public class DesafioFor3 {

    // Desafio: realizar um loop For sem a utilização de tipos númericos na condição do FOR
    public static void main(String[] args) {
        for (String v = "#"; !v.equals("######"); v += "#" ) {
            System.out.println(v);
        }
    }
}
