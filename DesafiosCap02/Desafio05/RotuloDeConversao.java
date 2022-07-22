package Desafio05;


public class RotuloDeConversao implements Comparable{
    
    private final String primeiraMoeda;
    private final String segundaMoeda;

    public RotuloDeConversao(String primeiraMoeda, String segundaMoeda) {
        this.primeiraMoeda = primeiraMoeda;
        this.segundaMoeda = segundaMoeda;
    }
    
    public String getPrimeiraMoeda() {
        return primeiraMoeda;
    }

    public String getSegundaMoeda() {
        return segundaMoeda;
    }

    @Override
    public int compareTo(Object o) {
        if(this.segundaMoeda.equals(
            ((RotuloDeConversao)o).getPrimeiraMoeda()
            )) 
        {
            return 1;
        }
        else if(this.primeiraMoeda.equals(
            ((RotuloDeConversao)o).getSegundaMoeda()
            )) 
        {
            return -1;
        } else {
            return 0;
        } 
    }

    @Override
    public String toString() {

        return this.primeiraMoeda + " - " + this.segundaMoeda;
    }

}
