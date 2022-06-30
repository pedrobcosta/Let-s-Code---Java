import java.util.Scanner;

public class Questao3 {
    
    public static void main(String[] args) {

        int[] numbers = readNumbers(5);

        System.out.println("Os números ímpares são: " + findOdd(numbers));
        System.out.println("Os números pares são: " + findEven(numbers));
    }

    public static int[] readNumbers(int n) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[n];
        for(int i=0; i<n; i++)
            numbers[i] = input.nextInt();
        
        input.close();
        return numbers;
    }

    public static String findEven(int[] numbers) {
        Scanner input = new Scanner(System.in);
        String evenNumbers = "";
        for(int number : numbers) {
            if(number % 2 == 0)
                evenNumbers += number + " ";
        }
        
        input.close();
        return evenNumbers;
    }

    public static String findOdd(int[] numbers) {
        Scanner input = new Scanner(System.in);
        String oddNumbers = "";
        for(int number : numbers) {
            if(number % 2 != 0)
                oddNumbers += number + " ";
        }
        
        input.close();
        return oddNumbers;
    }

}