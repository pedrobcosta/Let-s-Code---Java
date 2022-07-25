package Desafio06;

public class ClienteArrojado extends Cliente{
 

    public void contratarInvestimento(RendaVariavel investimento) {
        this.carteiraInvestimentos.add(investimento);
    }
}
