public class MedicoTeste {
    public static void main(String[] args) {

        Medico cirurgiao1 = new Medico();
        cirurgiao1.id = 2;
        cirurgiao1.nome = "Afonso Neto";
        cirurgiao1.crm = "9381231";
        cirurgiao1.salario = 15500;
        cirurgiao1.especialidade = "Musculionidade";
        cirurgiao1.esta_ativo = true;

        System.out.printf("O médico %s de CRM:%s", cirurgiao1.nome, cirurgiao1.crm);
    }
}
