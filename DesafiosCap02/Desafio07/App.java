package Desafio07;

public class App {
    
    public static void main(String[] args) {
        
        String texto = "Pois em mim mesma eu vi como é o inferno. O inferno é a "+ 
        "boca que morde e come a carne viva que tem sangue, e quem é comido uiva "+
        "com o regozijo no olho: o inferno é a dor como gozo da matéria, e com o "+
        "riso do gozo, as lágrimas escorrem de dor.";

        System.out.println("Texto original-----------------------------------\n");
        System.out.println(texto);
        Formatador formatador = new Formatador();
        System.out.println("\nTexto em maiúsculo-------------------------------\n");
        System.out.println(formatador.tudoMaiusculo(texto));
        System.out.println("\nTexto em minúsculo-------------------------------\n");
        System.out.println(formatador.tudoMinusculo(texto));
        System.out.println("\nTexto em camelCase-------------------------------\n");
        System.out.println(formatador.camelCase(texto));
        System.out.println("\nTexto sem acentuação-----------------------------\n");
        System.out.println(formatador.removerAcentuacao(texto));
    }
}
