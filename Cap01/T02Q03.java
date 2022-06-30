package Cap01;

import java.util.Scanner;

public class T02Q03 {
    public static void accountType (String accountType) {
        if (accountType.equals(AccountType.PERSONAL.toString()))
            System.out.println(AccountType.PERSONAL.getMsg());

        else if (accountType.equals(AccountType.BUSINESS.toString()))
            System.out.println(AccountType.BUSINESS.getMsg());

        else
            System.out.println(AccountType.NOTFOUND.getMsg());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o tipo de conta:");
        String tipo = scan.nextLine();

        accountType(tipo);
    }

    enum AccountType {
        PERSONAL("Conta pessoal"),
        BUSINESS("Conta empresarial"),
        NOTFOUND("Conta inexistente");

        
        private String msg;

        AccountType(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return this.msg;
        }
    }
}
