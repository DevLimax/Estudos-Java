package classes_metodos;

public class Data {

    int dia;
    int mes;
    int ano;

    Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String formatar() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

    public String toString() {
        return this.formatar();
    }
}
