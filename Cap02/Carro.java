public class Carro {
    
    private int numeroDePortas;
    private String cor;
    private String marca;
    private String modelo;
    private double velocidade;

    public void acelerar(double aceleracao) {
        velocidade = velocidade + aceleracao;
    }

    public void frear() {
        velocidade = 0;
    }

    // getters e setters
    public int getNumeroDePortas() {
        return numeroDePortas;
    }
    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    
}
