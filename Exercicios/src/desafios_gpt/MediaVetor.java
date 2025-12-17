package desafios_gpt;

import java.util.Scanner;

public class MediaVetor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] nums = new double[10];
        double total = 0;
        double media;

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Informe o %d° número: ", i + 1);
            double num = Double.parseDouble(input.next().replace(",", "."));
            nums[i] = num;
            total += nums[i];
        }

        media = total / nums.length;
        System.out.printf("A média dos 10 números inseridos é: %.1f", media);
    }
}
