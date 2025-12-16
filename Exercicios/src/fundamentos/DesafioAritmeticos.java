package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        // Expressão númerica A
        int result_divisor_a = (int) Math.pow(6 * (3 +2), 2);
        int result_dividendo_a = 3 * 2;
        int result_final_a = result_divisor_a / result_dividendo_a;

        // Expressão númerica B
        int result_divisor_b = (1 - 5) * (2 - 7);
        int result_dividendo_b = 2;
        int result_divisao_b = result_divisor_b / result_dividendo_b;
        int result_final_b = (int) Math.pow(result_divisao_b, 2);

        System.out.println(result_final_b);
    }
}
