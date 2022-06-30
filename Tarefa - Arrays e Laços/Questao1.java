import java.util.Arrays;
import java.util.Scanner;

public class Questao1 {
    
    public static String[] readFruits() {
        Scanner input = new Scanner(System.in);

        String[] carrinho = new String[5];

        System.out.println("Informe o nome de cinco frutas:");
        for(int i=0; i<carrinho.length ; i++)
            carrinho[i] = input.nextLine();

        input.close();

        return carrinho;
    }

    public static void main(String[] args) {

        String[] carrinho = readFruits();

        System.out.println("Seu carrinho: " + Arrays.toString(carrinho));

    }
}
