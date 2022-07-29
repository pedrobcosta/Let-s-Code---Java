package Desafio08;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Compra {
    
    private BigDecimal valor;
    private List<String> itens;
    
    public BigDecimal getValor() {
        return valor;
    }
    public List<String> getItens() {
        return itens;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor.setScale(2, RoundingMode.HALF_UP);
    }
    public void setItens(List<String> itens) {
        this.itens = itens;
    }
}
