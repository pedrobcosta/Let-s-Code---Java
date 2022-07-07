import java.math.BigDecimal;

public class ContaCorrente extends Conta{
    
    public void transferir(BigDecimal valor, Conta contaDestino) {

        if(valor.compareTo(this.saldo) > 0)
            throw new IllegalArgumentException("Saldo insuficiente");

        this.sacar(        
            contaDestino.depositar(valor)
        );
    }
}
