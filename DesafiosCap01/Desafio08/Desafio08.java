package Desafio08;

public class Desafio08 {
    
    public static void main(String[] args) {
        Sorveteria fabrica = new Sorveteria();
    
        final Sorvete massaNoCopoMorango = fabrica.criarSorvete(TipoSorvete.COPO, "Morango");
        final Sorvete palitoChocolate = fabrica.criarSorvete(TipoSorvete.PALITO, "Chocolate");
        final Sorvete massaNaCasquinhaBaunilha = fabrica.criarSorvete(TipoSorvete.CONE, "Baunilha");
    
        massaNoCopoMorango.degustar();
        palitoChocolate.degustar();
        massaNaCasquinhaBaunilha.degustar();
    }

}

enum TipoSorvete {
    COPO("massa no COPO"), CONE("massa no CONE"), PALITO("PALITO");

    String descricao;

    TipoSorvete(String descricao) {
        this.descricao = descricao;
    }
}