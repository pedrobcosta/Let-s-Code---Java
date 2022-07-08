package Models;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{
    
    public BigDecimal transferir(BigDecimal valor, Conta contaDestino) {
        // titular PJ
        if(this.getTitular() instanceof PessoaJuridica) {

            BigDecimal novoValor = valor.multiply(BigDecimal.valueOf(1.005));

            if(novoValor.compareTo(this.getSaldo()) > 0)
                throw new IllegalArgumentException("Saldo insuficiente");
            else
                this.sacar(        
                    contaDestino.depositar(novoValor));
        }
        // titular nao é PJ
        else {

            if(valor.compareTo(this.getSaldo()) > 0)
                throw new IllegalArgumentException("Saldo insuficiente");

            else 
                this.sacar(        
                    contaDestino.depositar(valor));
        }

        return valor;
    }
}
