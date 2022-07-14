package InterfaceComparable;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;

    
    public Pessoa(final String nome, final int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "O meu nome é " + this.nome + " e tenho " + this.idade + " anos!";
    }
    
    @Override
    public int compareTo(Pessoa p) {
        return this.nome.compareTo(p.nome);
    }
}