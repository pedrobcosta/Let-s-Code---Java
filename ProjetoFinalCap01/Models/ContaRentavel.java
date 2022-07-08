package Models;

import java.math.BigDecimal;

public abstract class ContaRentavel extends Conta{
    
    private BigDecimal taxaRendimento;

    public BigDecimal render() {

        BigDecimal rendimento = this.getSaldo().multiply(taxaRendimento);
        this.setSaldo(
            this.getSaldo()
                    .add(rendimento)
            );
        return rendimento;
    }

    public BigDecimal getTaxaRendimento() {
        return taxaRendimento;
    }
    
    public void setTaxaRendimento(BigDecimal taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

}
