package poo.encapsulamento.basico;

import java.util.UUID;

public class Usuario {

    private final UUID id;
    private String primeiro_nome;
    private String segundo_nome;
    private String email;

    public Usuario() {
        this(null);
    }

    public Usuario(UUID id) {
        this.id = id != null ? id : UUID.randomUUID();
    }

    public String getPrimeiro_nome() {
        return primeiro_nome;
    }

    public void setPrimeiro_nome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome.toLowerCase();
    }

    public String getSegundo_nome() {
        return segundo_nome;
    }

    public void setSegundo_nome(String segundo_nome) {
        this.segundo_nome = segundo_nome.toLowerCase();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if ( email.contains("@") ) {
            this.email = email.toLowerCase();
        } else {
            System.out.println("Email invalido!");
        }
    }

    public UUID getID() {
        return id;
    }
}
