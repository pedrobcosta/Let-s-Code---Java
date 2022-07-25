package Desafio06;

public class ClienteConservador  extends Cliente{
    
    public void contratarInvestimento(RendaFixa investimento) {

        this.carteiraInvestimentos.add(investimento);
    }
}
