package Models;

public class Endereco {
    
    private int cep;
    private int numero;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(){}
    
    public Endereco( int cep, int numero,String logradouro, String bairro,String  cidade, 
              String estado, String pais ) {
        
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

}
