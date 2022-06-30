import java.util.Scanner;

public class Questao2 {
    
    public static void main(String[] args) {
        
        String word = readWord();

        word = invertWord(word);

        System.out.println(word);
    }

    public static String readWord() {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        input.close();

        return word;
    }

    public static String invertWord(String word) {

        char[] wordInArray = word.toCharArray();
        char swappedChar;

        int wordLength = word.length();
        for (int i=0; i<wordLength-1-i; i++) {

            swappedChar = wordInArray[i];
            wordInArray[i] = wordInArray[wordLength-1-i];
            wordInArray[wordLength-1-i] = swappedChar;
        }

        return String.valueOf(wordInArray);
    }

}