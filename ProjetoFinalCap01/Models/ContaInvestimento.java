package Models;

import java.math.BigDecimal;

public class ContaInvestimento extends ContaRentavel{

    public ContaInvestimento(int numeroDaConta, int agencia, Pessoa titular) {
        super(numeroDaConta, agencia, titular);
    }

    @Override
    public BigDecimal render() {

        if(this.getTitular() instanceof PessoaJuridica) {

            return this.getSaldo()
                            .multiply(
                                this.getTaxaRendimento()
                            .multiply(
                                BigDecimal.valueOf(1.02)));
            
        }

        else
            return super.render();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados da Conta Investimento:");
        sb.append(" Agência: " + this.getAgencia() );
        sb.append(" Número " + this.getNumeroDaConta() );
        sb.append(" Saldo: " + this.getSaldo() );

        return sb.toString();
        
    }

}
