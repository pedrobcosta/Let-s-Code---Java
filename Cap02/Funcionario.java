import java.math.BigDecimal;

public class Funcionario {
    
    protected String chave;
    protected String nome;
    protected String cargo;
    protected BigDecimal salario;
    
    public BigDecimal calcularPLR() {
        return this.salario.multiply(BigDecimal.valueOf(3));
    }

    public BigDecimal calcularFerias() {
        return this.salario.divide(BigDecimal.valueOf(3));
    }

    // getters e setters
    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }


}
