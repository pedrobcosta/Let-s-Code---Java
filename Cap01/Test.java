package Cap01;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.event.SwingPropertyChangeSupport;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome");
        final String nome = sc.nextLine();
        System.out.println("Digite a idade");
        final int age = sc.nextInt();


        int[] t = new int[5];
        for (int i = 0; i< t.length; i++) {
            t[i] = new Random().nextInt() % 500;
        }

        for(int num: t){

        }
    }

    BigDecimal resultado = new BigDecimal("0.01");
    String nome = "Pedro";

    int teste = (1 & 0);

    

}
