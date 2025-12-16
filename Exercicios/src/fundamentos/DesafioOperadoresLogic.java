package fundamentos;

public class DesafioOperadoresLogic {
    public static void main(String[] args) {


        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean tv30pol = trabalho1 ^ trabalho2;
        boolean tv50pol = trabalho1 && trabalho2;

        boolean tomouSorvete = trabalho1 | trabalho2;
        boolean familiaTriste = tomouSorvete != true;

        if (tv50pol) {
            System.out.println("Legal, como você realizou os 2 trabalhos na semana, sua familia comprou a televisão de 50 polegadas e comemoraram tomando sorvete!");
        } else if (tv30pol) {
            System.out.println("Legal, como você realizou somente 1 trabalho na semana, sua familia comprou a televisão de 30 polegadas e comemoraram tomando sorvete!");
        }
        else {
            System.out.println("Bom, como você não trabalhou nenhum dia da semana, infelizmente sua familia não conseguiu ir ao shopping comprar a tv e nem tomar sorvete");
        }
    }
}
