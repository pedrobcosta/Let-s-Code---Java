package Models;

import java.util.Date;

public class PessoaFisica extends Pessoa{

    private String nome;
    private String cpf;
    private Date dataDeNascimento;

    public PessoaFisica( String nome, String cpf, Date dataDeNascimento, 
        String telefone, Endereco endereco, String email) {
        super(telefone, endereco, email);
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

}