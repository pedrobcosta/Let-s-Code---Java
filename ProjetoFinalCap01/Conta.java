import java.math.BigDecimal;

public class Conta {
    
    protected int numeroDaConta;
    protected int agencia;
    protected BigDecimal saldo;
    protected BigDecimal taxaDeRetirada= BigDecimal.valueOf(0);

    public BigDecimal sacar(BigDecimal valor) {

        this.saldo = this.saldo.subtract(valor);
        return valor;
    }

    public BigDecimal depositar(BigDecimal valor) {
        
        this.saldo = this.saldo.add(valor);
        return valor;
    }
}
