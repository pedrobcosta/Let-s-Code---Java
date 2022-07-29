package Desafio08;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class DescontosEmCompra {
    
    public static BigDecimal calcularDesconto(Compra compra) {

        Descontos descontos[] = Descontos.values();
        for(Descontos currentDesconto: descontos) {

            if(currentDesconto.numeroItens <= compra.getItens().size()) {
                double percent = currentDesconto.desconto/100d;
                BigDecimal desconto = compra.getValor().multiply(BigDecimal.valueOf(percent));
                System.out.println(desconto);
                desconto = desconto.setScale(2, RoundingMode.HALF_DOWN);
                return desconto;
            }
        }
        return BigDecimal.ZERO;
    }


    public enum Descontos {
        
        DESCONTO_15(15,10),
        DESCONTO_10(10,8),
        DESCONTO_5(5,5),
        DESCONTO_1(1,0);

        public int numeroItens;
        public int desconto;
        
        Descontos(int numeroItens, int desconto) {
            this.numeroItens = numeroItens;
            this.desconto = desconto;
        }
    }
}
