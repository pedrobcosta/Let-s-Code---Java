import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        System.out.println("Digite a palavra:");
        String word = readWord();
        
        System.out.println("Palavra alterada: " + oddCharsToCapital(word));
    }

    public static String readWord() {
        String word;
        Scanner input = new Scanner(System.in);
        word = input.nextLine();

        input.close();
        return word;
    }

    public static String oddCharsToCapital(String word) {
        char[] wordInArray = word.toCharArray();

        for(int i=0; i<word.length(); i++) {
            if(i % 2 == 0)  // considera index 0 como ímpar, pois é o primeiro da lista [...]
                wordInArray[i] = Character.toUpperCase(wordInArray[i]); 
        }

        return String.valueOf(wordInArray);
    }
}