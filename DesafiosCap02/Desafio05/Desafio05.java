package Desafio05;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Desafio05 {
    
    
    public static void main(String[] args) {
        
        HashMap<RotuloDeConversao,BigDecimal> conversoes = new HashMap<>();
    
        Scanner scan = new Scanner(System.in);
        // String input = scan.nextLine();
        // System.out.println(input);
        Pattern pattern = Pattern.compile("(\\w*) *- *(\\w*): (\\d*.\\d{2})");

        Matcher matcher = pattern.matcher("USD - AUD: 1.44");
        while(matcher.find()) {
            
            RotuloDeConversao rotulo = new RotuloDeConversao(matcher.group(1), matcher.group(2));
            conversoes.put(rotulo, new BigDecimal(matcher.group(3)));
        }

         matcher = pattern.matcher("USD - BRL: 5.15");
        while(matcher.find()) {
            
            RotuloDeConversao rotulo = new RotuloDeConversao(matcher.group(1), matcher.group(2));
            conversoes.put(rotulo, new BigDecimal(matcher.group(3)));
        }

         matcher = pattern.matcher("BRL - EUR: 0.18");
        while(matcher.find()) {
            
            RotuloDeConversao rotulo = new RotuloDeConversao(matcher.group(1), matcher.group(2));
            conversoes.put(rotulo, new BigDecimal(matcher.group(3)));
        }

         matcher = pattern.matcher("EUR - GBP: 0.86");
        while(matcher.find()) {
            
            RotuloDeConversao rotulo = new RotuloDeConversao(matcher.group(1), matcher.group(2));
            conversoes.put(rotulo, new BigDecimal(matcher.group(3)));
        }
        System.out.println("Digite a conversão desejada:");
        String input = scan.nextLine();
        pattern = Pattern.compile("(\\w*) *- *(\\w*)");
        matcher = pattern.matcher(input);
        while(matcher.find()) {

            RotuloDeConversao conversao = new RotuloDeConversao(matcher.group(1), matcher.group(2));
            System.out.println(caminhoDeConversao(conversao, conversoes));
        }
        scan.close();
    }

    public static List<RotuloDeConversao> caminhoDeConversao(RotuloDeConversao conversao, HashMap<RotuloDeConversao,BigDecimal> conversoes) {
        
        List<RotuloDeConversao> caminho = new ArrayList<>();
        
        if(conversoes.containsKey(conversao))
            return caminho;

        caminho.add(conversao);
        RotuloDeConversao ultimaConversao = conversao;

        do {

            for (RotuloDeConversao currentKey : conversoes.keySet()) {
                

                if(currentKey.compareTo(ultimaConversao) != 0) {
                    caminho.add(currentKey);
                    ultimaConversao = currentKey;
                    System.out.println("ADICIONADO ------------- " + currentKey);
                }
            }
            System.out.println(caminho);
            System.out.println(ultimaConversao);
        } while(conversao.compareTo(ultimaConversao)!= 0); 

        return caminho;
    }

}
