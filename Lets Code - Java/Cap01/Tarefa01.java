package Cap01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tarefa01 {
    public static void printInteresForUser(
        String userName,
        BigDecimal balance,
        double interesRate
        ) {
            BigDecimal juros = balance.multiply(BigDecimal.valueOf(interesRate/100));
            juros = juros.setScale(2, RoundingMode.CEILING);
            System.out.println(String.format("O %s irá receber R$ %s", userName, juros.toString()));
        }

    public static void main(String[] args) {
        printInteresForUser("João",new BigDecimal(1000d),12.5d);
    }
}