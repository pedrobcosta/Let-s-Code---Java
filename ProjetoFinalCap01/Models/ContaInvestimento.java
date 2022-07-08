package Models;

import java.math.BigDecimal;

public class ContaInvestimento extends ContaRentavel{

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

}
