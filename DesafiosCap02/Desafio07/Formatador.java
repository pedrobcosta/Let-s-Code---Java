package Desafio07;

import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formatador {
    
    public String tudoMaiusculo(String texto) {

        return texto.toUpperCase();
    }

    public String tudoMinusculo(String texto) {

        return texto.toLowerCase();
    }

    public String camelCase(String texto) {

        Pattern pattern = Pattern.compile("(\\s+)(\\w)");
        Matcher matcher = pattern.matcher(texto);
        return matcher.replaceAll(x -> x.group(2).toUpperCase()); 
    }

    public String removerAcentuacao(String texto) {

        String s = Normalizer.normalize(texto, Normalizer.Form.NFD);
        s = s.replaceAll("\\p{M}", "");
        return s;
    }
}
