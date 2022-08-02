package Desafio05;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Desafio05 {
    
    
    public static void main(String[] args) {
        
        GrafoConversoes grafo = new GrafoConversoes();
        Scanner scan = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(\\w*) *- *(\\w*): (\\d*.\\d{2})");

        String input = scan.nextLine();
        while(!input.equals("esc")) {

            Matcher matcher = pattern.matcher(input);
            while(matcher.find()) {
                
                String vertice = matcher.group(1);
                String keyAresta = matcher.group(2);
                BigDecimal valueAresta = new BigDecimal(matcher.group(3));
                grafo.adicionarVertice(vertice);
                grafo.adicionarAresta(vertice, keyAresta, valueAresta);;
            }
            input = scan.nextLine();
        }

        System.out.println(grafo);
        System.out.println("----------------------------- COMPLETANDO ------------------");
        Stack<String> path = new Stack<>();
        System.out.println(GrafoConversoesService.hasPathDFS(grafo,"GBP","USD", new HashMap<String,Boolean>(), path));
        System.out.println(path);
        scan.close();
    }

}
