package Models;

public class Pessoa {
    
    protected String telefone;
    protected Endereco endereco;
    protected String email;

    public Pessoa() {}
    public Pessoa(String telefone, Endereco endereco, String email) {
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
