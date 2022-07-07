import java.math.BigDecimal;

public class Gerente extends Funcionario{
    
    @Override
    public BigDecimal calcularPLR() {
        return this.salario.multiply(BigDecimal.valueOf(4));
    }
}
