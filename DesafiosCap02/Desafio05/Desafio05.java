package Desafio05;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Desafio05 {
    
    
    public static void main(String[] args) {
        
        HashMap<RotuloDeConversao,BigDecimal> conversoes = new HashMap<>();
    
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while(input != "esc") {

            Pattern pattern = Pattern.compile(input);
            Matcher matcher = pattern.matcher("(\\w*) *- *(\\w*): (\\d*.\\d{2})");
    
            RotuloDeConversao rotulo = new RotuloDeConversao(matcher.group(1), matcher.group(2));
            conversoes.put(rotulo, new BigDecimal(matcher.group(3)));

            input = scan.nextLine();
        }

        
        scan.close();
    }

    public BigDecimal conversaoDireta(RotuloDeConversao conversao, HashMap<RotuloDeConversao,BigDecimal> conversoes) {
        
        if(conversoes.containsKey(conversao)) {
            return conversoes.get(conversao);
        }

        return new BigDecimal("1.0");
    }

}
