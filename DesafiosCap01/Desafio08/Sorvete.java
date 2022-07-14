package Desafio08;

public class Sorvete {

    TipoSorvete tipo;
    String sabor;

    public Sorvete(TipoSorvete tipo, String sabor) {
        this.tipo = tipo;
        this.sabor = sabor;
    }

    public void degustar() {
        System.out.printf("Este sorvete de %s é do sabor de %s ", this.tipo.descricao, this.sabor);
    }

}
