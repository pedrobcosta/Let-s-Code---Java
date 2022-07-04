import java.sql.Date;

public class CartaoDeCredito {

    private int numero;
    private Date dataDeValidade;

    // getters
    public int getNumero() {
        return numero;
    }
    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    //setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
