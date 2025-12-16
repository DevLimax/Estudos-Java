package fundamentos;

import java.util.Scanner;

public class DesafioTempCelsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double temp_celsius;
        double temp_fahrenheit;

        System.out.print("Digite a temperatura em Celsius: ");
        temp_celsius = input.nextDouble();
        input.close();

        temp_fahrenheit = (temp_celsius * 1.8) + 32;
        System.out.printf("A Temperatura %.1fC° em Fahrenheit fica -> %.1fF°", temp_celsius, temp_fahrenheit);

    }
}
