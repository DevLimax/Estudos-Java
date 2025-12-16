package fundamentos;

import java.util.Scanner;

public class DesafioTemperatura {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double temp_fahrenheit;
        double temp_celsius;

        System.out.print("Digite a temperatura em F°: ");
        temp_fahrenheit = input.nextDouble();

        temp_celsius = ((temp_fahrenheit - 32) * 5) / 9;
        System.out.printf("A Temperatura %.1fF° em Celsius fica -> %.1fC°", temp_fahrenheit, temp_celsius);

    }
}
