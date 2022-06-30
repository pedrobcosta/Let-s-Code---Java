package Cap01;

import java.util.Scanner;

public class T02Q02 {

    public static int higher (int num1, int num2) {
        if (num1 > num2)    
            return num1;
        else                
            return num2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int num1 = scan.nextInt();
        System.out.println("Insira o último número:");
        int num2 = scan.nextInt();

        System.out.println(higher(num1, num2));
    }
}
