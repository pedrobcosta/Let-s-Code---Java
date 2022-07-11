package Models;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{
    

    public ContaCorrente(int numeroDaConta, int agencia, Pessoa titular) {
        super(numeroDaConta, agencia, titular);
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados da Conta Corrente:");
        sb.append(" Agência: " + this.getAgencia() );
        sb.append(" Número " + this.getNumeroDaConta() );
        sb.append(" Saldo: " + this.getSaldo() );

        return sb.toString();
        
    }
}
