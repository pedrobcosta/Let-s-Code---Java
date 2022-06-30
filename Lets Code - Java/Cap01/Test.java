package Cap01;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome");
        final String nome = sc.nextLine();
        System.out.println("Digite a idade");
        final int age = sc.nextInt();

        System.out.println(nome + age);
        sc.close();
    }

    BigDecimal resultado = new BigDecimal("0.01");
    String nome = "Pedro";

    int teste = (1 & 0);

}
