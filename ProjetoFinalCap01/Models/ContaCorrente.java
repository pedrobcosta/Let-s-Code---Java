package Models;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{
    
    public BigDecimal transferir(BigDecimal valor, Conta contaDestino) {

        if(valor.compareTo(this.getSaldo()) > 0)
            throw new IllegalArgumentException("Saldo insuficiente");

        else if(this.getTitular() instanceof PessoaJuridica) {
            this.sacar(        
                contaDestino.depositar(
                    valor.multiply(BigDecimal.valueOf(1.005))
                    )
            );
        }

        else {
            this.sacar(        
                contaDestino.depositar(
                    valor
                    )
            );
        }

        return valor;
    }
}
