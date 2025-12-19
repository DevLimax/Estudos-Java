package poo.encapsulamento.veiculo.model;

import java.util.Map;

public class Carro {
    private final Motor motor;
    private double velocidade = 0;
    private final double velocidadeMaxima;

    public Carro() {
        this(1, 177);
    }

    public Carro(double litragem, double velocidadeMaxima) {
        this.motor = new Motor(litragem);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void ligar() {
        motor.ligar();
    }

    public void desligar() {
        motor.desligar();
    }

    public void acelerar() {
        if (!motor.is_ligado()) {
            return;
        }

        if (velocidade >= velocidadeMaxima) {
            return;
        }
        double incrementoBase = 10; // KM
        double incremento = incrementoBase * motor.getFatorAceleracao();

        double new_velocidade = velocidade + incremento;
        velocidade = Math.min(new_velocidade, velocidadeMaxima);
    }

    public void frear() {
        if(velocidade <= 0) {
            return;
        }

        double decrementoBase = 20;
        double nova_velocidade = velocidade - decrementoBase;
        velocidade = Math.max(nova_velocidade, 0);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    @Override
    public String toString() {
        return String.format("Carro{velocidaMaxima= %.1f, velocidade= %.1f}", velocidadeMaxima, velocidade);
    }
}
