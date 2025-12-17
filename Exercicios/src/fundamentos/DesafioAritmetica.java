package fundamentos;

public class DesafioAritmetica {
    public static void main(String[] args) {

        // Expressão A
        int result_numerador_a = (int) Math.pow(6 * (3 + 2), 2);
        int result_denominador_a = 3 * 2;
        int result_final_a = result_numerador_a / result_denominador_a;

        // Expressão B
        int result_numerador_b = (1 -5) * (2 - 7);
        int result_divisao_b = result_numerador_b / 2;
        int result_final_b = (int) Math.pow(result_divisao_b, 2);

        // Expressão C
        int result_numerador_c = (int) Math.pow((result_final_a - result_final_b), 3);
        int result_final_c = result_numerador_c / (int) Math.pow(10, 3);

        System.out.println(result_final_c);
    }
}
