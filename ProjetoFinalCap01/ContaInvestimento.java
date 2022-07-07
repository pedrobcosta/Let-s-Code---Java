import java.math.BigDecimal;

public class ContaInvestimento extends Conta{
    
    BigDecimal taxaRendimento;

    public BigDecimal render() {

        BigDecimal rendimento = this.saldo.multiply(taxaRendimento);
        this.saldo = this.saldo.add(rendimento);
        return rendimento;
    }
    
}
