package Cap01;

import java.util.Scanner;

public class T02Q01 {
    
    public static void sumEvenNumbers (int start, int end) {

        int sum = 0;
        while(start <= end) {

            if(start % 2 == 0)
                sum = sum + start;

            start = start + 1;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int start = scan.nextInt();
        System.out.println("Insira o último número:");
        int end = scan.nextInt();

        sumEvenNumbers(start, end);
    }
}
