package Desafio08;

import java.math.BigDecimal;
import java.util.Arrays;

public class App {
    
    public static void main(String[] args) {
        
        Compra compra1 = new Compra();
        compra1.setItens(Arrays.asList("Bola", "Cenoura", "Biscoito", "Macarrao", "Arroz", "Feijao",
        "Limao", "Uva", "Pera", "Sopa", "Chuchu", "Beterraba", "Abacate", "Mamao", "Coco"));
        compra1.setValor(BigDecimal.valueOf(1000.48));
        System.out.println("\nCompra 1-----------------------------------------------");
        System.out.println("Número de itens: " + compra1.getItens().size());
        System.out.println("Valor: " + compra1.getValor());
        System.out.println("Desconto: " + DescontosEmCompra.calcularDesconto(compra1));

        Compra compra2 = new Compra();
        compra2.setItens(Arrays.asList("Bola", "Cenoura", "Biscoito", "Macarrao", "Arroz", "Feijao",
        "Limao", "Uva", "Pera", "Sopa"));
        compra2.setValor(BigDecimal.valueOf(950.66));
        System.out.println("\nCompra 2-----------------------------------------------");
        System.out.println("Número de itens: " + compra2.getItens().size());
        System.out.println("Valor: " + compra2.getValor());
        System.out.println("Desconto: " + DescontosEmCompra.calcularDesconto(compra2));


        Compra compra3 = new Compra();
        compra3.setItens(Arrays.asList("Bola", "Cenoura", "Biscoito", "Macarrao", "Arroz"));
        compra3.setValor(BigDecimal.valueOf(720.72));
        System.out.println("\nCompra 3-----------------------------------------------");
        System.out.println("Número de itens: " + compra3.getItens().size());
        System.out.println("Valor: " + compra3.getValor());
        System.out.println("Desconto: " + DescontosEmCompra.calcularDesconto(compra3));


        Compra compra4 = new Compra();
        compra4.setItens(Arrays.asList("Bola", "Cenoura"));
        compra4.setValor(BigDecimal.valueOf(396.01));
        System.out.println("\nCompra 4-----------------------------------------------");
        System.out.println("Número de itens: " + compra4.getItens().size());
        System.out.println("Valor: " + compra4.getValor());
        System.out.println("Desconto: " + DescontosEmCompra.calcularDesconto(compra4));

    }

   
}
