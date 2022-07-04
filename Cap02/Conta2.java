import java.math.BigDecimal;

public class Conta2 {
    
    private String numeroDaConta;
    private String titular;
    private BigDecimal saldo; 
    
    public void sacar(BigDecimal valor) {
        saldo = saldo.subtract(valor);
    } 
    
    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    // getters e setters
    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}
