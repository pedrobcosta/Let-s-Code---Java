package Desafio03;
import java.util.Scanner;

public class Desafio03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os dois números extremos do intervalo");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        ChaveValor<String, Integer> somaIntervalo = somaIntervalo(num1, num2);
        System.out.println(somaIntervalo.getKey() + " Soma: " + somaIntervalo.getValue());

        scan.close();
    }
    
    public static ChaveValor<String,Integer> somaIntervalo(int num1, int num2) {

        int soma = 0;
        String intervalo = "";

        int currentNumber = Math.min(num1, num2);
        while(currentNumber <= Math.max(num1, num2)) {
            soma += currentNumber;
            intervalo += currentNumber;
            if(currentNumber != Math.max(num1, num2))
                intervalo += ",";
            currentNumber += 1;
        }
        
        return new ChaveValor<String,Integer>(intervalo, Integer.valueOf(soma));
    }

}
