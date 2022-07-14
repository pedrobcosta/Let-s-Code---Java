import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Desafio01 {
    
    public static void main(String[] args) {

        System.out.println("Digite a string a ser autenticada");

        Scanner scan = new Scanner(System.in);

        System.out.println(
            autenticarMelhorada(scan.nextLine()));

        scan.close();
    }

    public static boolean autenticar(String string) {

        Pattern pattern = Pattern.compile("\\d(?=xxx\\d)|(?<=\\dxxx)\\d",Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(string);
        int countMatches = 0;
        int sum=0;
        while(match.find()) {

            countMatches += 1;
            int numberMatched = Integer.parseInt(string.toCharArray()[match.start()]+"");
            if(countMatches % 2 != 0) 
                sum = numberMatched;
            else {
                sum += numberMatched;
                if(sum == 8)
                    return true;
            }
        }
        return false;
    }

    public static boolean autenticarMelhorada(String string) {

        Pattern pattern = Pattern.compile("(\\d)xxx(\\d)",Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(string);
        while(match.find()) {

            if( Integer.parseInt(match.group(1))+
                Integer.parseInt(match.group(2)) 
                == 8)
                    return true;
        }
        return false;
    }
}
