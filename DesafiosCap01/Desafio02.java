import java.util.Scanner;

public class Desafio02 {
    static class Solucao {
        public int inverter(int numero) {

            String numeroEmTextoInvertido = "";

            if(numero < 0) {
                numeroEmTextoInvertido += "-";
                numero = numero * -1;
            }

            String numeroEmTexto = ""+numero;
            int fim=numeroEmTexto.length()-1;

            while(fim>=0){
                numeroEmTextoInvertido += numeroEmTexto.charAt(fim);
                fim--;
            }

            return Integer.parseInt(numeroEmTextoInvertido);
        }
    }

    public static void main(String[] args) {
        Solucao solucao = new Solucao();

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o número:");
        int num = scan.nextInt() ;
        

        System.out.println(solucao.inverter(num));
        scan.close();
    }
}
