import java.math.BigDecimal;

public class Estagiario extends Funcionario {
    
    @Override
    public BigDecimal calcularPLR() {
        return this.salario.multiply(BigDecimal.valueOf(2));
    }
}
