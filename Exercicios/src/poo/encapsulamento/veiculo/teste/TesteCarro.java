package poo.encapsulamento.veiculo.teste;

import poo.encapsulamento.veiculo.model.Carro;

public class TesteCarro {
    public static void main(String[] args) {

        Carro fiatUno = new Carro(3, 167);
        fiatUno.ligar();
        fiatUno.acelerar();
        fiatUno.acelerar();
        fiatUno.acelerar();

        System.out.println(fiatUno);

        fiatUno.frear();
        fiatUno.frear();
        fiatUno.frear();
        fiatUno.frear();
        fiatUno.frear();
        fiatUno.desligar();

        System.out.println(fiatUno);
    }
}
