import java.util.Scanner;

public class Salario {
    
    double salario;
    double bonus;

    public void lerSalario() {

        Scanner scan = new Scanner(System.in);
        this.salario = scan.nextDouble();
        scan.close();
    }

    public void calcularBonus() {
        this.bonus = salario*0.1;
    }
}
