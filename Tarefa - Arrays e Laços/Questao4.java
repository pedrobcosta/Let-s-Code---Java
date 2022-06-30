import java.util.Scanner;

public class Questao4 {
    
    public static void main(String[] args) {
        int[] numbers = readNumbers(5);

        System.out.println("O maior número é " + maior(numbers));
        System.out.println("O menor número é " + menor(numbers));
        System.out.println("A média entre os números é " + media(numbers));
    }

    public static int[] readNumbers(int n) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[n];
        for(int i=0; i<n; i++)
            numbers[i] = input.nextInt();
        
        input.close();
        return numbers;
    }

    public static int maior(int[] numbers) {
        int maior = numbers[0];
        for(int number : numbers) {
            if(number > maior)
                maior = number;
        }

        return maior;
    }

    public static int menor(int[] numbers) {
        int menor = numbers[0];
        for(int number : numbers) {
            if(number < menor)
                menor = number;
        }

        return menor;
    }

    public static int soma(int[] numbers) {
        int soma = 0;
        for(int number : numbers)
            soma = soma + number;
        return soma;
    }

    public static double media(int[] numbers) {
        int soma = soma(numbers);
        return soma*1.03/(numbers.length);
    }

}