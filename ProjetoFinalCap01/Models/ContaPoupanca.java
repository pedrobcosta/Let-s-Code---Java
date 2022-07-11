package Models;

public class ContaPoupanca extends ContaRentavel{
    
    public ContaPoupanca(int numeroDaConta, int agencia, Pessoa titular) {
        super(numeroDaConta, agencia, titular);
    }

    @Override
    public void setTitular(Pessoa titular) {
        
        if(titular instanceof PessoaJuridica)
            throw new IllegalArgumentException("Conta poupança não disponível para PJ");
        else    
            super.setTitular(titular);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados da Conta Poupança:");
        sb.append(" Agência: " + this.getAgencia() );
        sb.append(" Número " + this.getNumeroDaConta() );
        sb.append(" Saldo: " + this.getSaldo() );

        return sb.toString();
        
    }	
}
