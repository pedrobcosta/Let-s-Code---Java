import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        System.out.println("Informe o nome de cada um dos 5 convidados:");
        String[] guestList = readPeopleArray(5);
        
        System.out.println("O maior nome da lista é " + largestName(guestList));
    }

    public static String[] readPeopleArray(int n) {
        String[] people = new String[n];
        Scanner input = new Scanner(System.in);

        for(int i=0; i<n; i++) 
            people[i] = input.nextLine();

        input.close();
        return people;
    }

    public static String largestName(String[] peopleArray) {
        String largest = peopleArray[0];

        for(String currentPerson : peopleArray) {
            if(currentPerson.length() > largest.length())
                largest = currentPerson;
        }

        return largest;
    }
}