package Models;

public class ContaPoupanca extends ContaRentavel{
    
    @Override
    public void setTitular(Pessoa titular) {
        
        if(titular instanceof PessoaJuridica)
            throw new IllegalArgumentException("Conta poupança não disponível para PJ");
        else    
            super.setTitular(titular);
    }
}
