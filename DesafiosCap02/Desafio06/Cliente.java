package Desafio06;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    
    List<Investimento> carteiraInvestimentos = new ArrayList<Investimento>();

    public List<Investimento> getCarteiraInvestimentos() {
        return carteiraInvestimentos;
    }

}
