package poo.encapsulamento.veiculo.model;

public class Motor {
    private final double litragem;
    boolean ligado;

    Motor(double litragem) {
        this.litragem = litragem;
    }

    double getLitragem() {
        return litragem;
    }

    double getFatorAceleracao() {
        return  0.9 * litragem;
    }

    void ligar() {
        this.ligado = true;
    }

    void desligar(){
        this.ligado = false;
    }

    boolean is_ligado() {
        return this.ligado;
    }

}
