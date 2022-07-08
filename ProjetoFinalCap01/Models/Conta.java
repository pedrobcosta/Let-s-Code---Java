package Models;

import java.math.BigDecimal;

public abstract class Conta {
    
    private int numeroDaConta;
    private int agencia;
    private BigDecimal saldo = BigDecimal.valueOf(0);
    private Pessoa titular;

    
    public BigDecimal sacar(BigDecimal valor) {
        
        if(this.titular instanceof PessoaJuridica)
            this.saldo = this.saldo.subtract(
                            valor.multiply(
                                BigDecimal.valueOf(1.005)));
        else
            this.saldo = this.saldo.subtract(valor);
            
        return valor;
    }
    
    public BigDecimal depositar(BigDecimal valor) {
        
        this.saldo = this.saldo.add(valor);
        return valor;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public BigDecimal getSaldo() {
        return saldo;
    }
    
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    
    public Pessoa getTitular() {
        return titular;
    }
    
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
}
