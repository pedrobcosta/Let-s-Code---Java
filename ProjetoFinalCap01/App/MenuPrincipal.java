package App;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;

import javax.crypto.spec.PBEKeySpec;

import Models.Conta;
import Models.ContaCorrente;
import Models.ContaInvestimento;
import Models.Endereco;
import Models.PessoaFisica;
import Models.PessoaJuridica;

public class MenuPrincipal {
  
  public static void start() {
    
    // Transferir
      // criar conta
      Endereco endereco1 = new Endereco(20000000, 000, "Rua abcd","Bairro" ,"Banco", "B", "B");
      Date dataNascimento = new Date(130, 0, 2); // 02/01/2000
      PessoaFisica pf1 = new PessoaFisica("Zezinho", "12345678900", dataNascimento, "6100000000", endereco1,
          "abc@abc.com");
      ContaCorrente cc1 = new ContaCorrente( 100, 1, pf1);    
  
      ContaCorrente cc2 = new ContaCorrente( 101, 1, pf1);    

      // deposito
      cc1.depositar(new BigDecimal(10000));
      System.out.println("####");
      System.out.println("Depósito de 10000.00 na conta 100");
      System.out.println("####");
      System.out.println(cc1);
      // saque
      cc1.sacar(new BigDecimal(100));
      System.out.println("####");
      System.out.println("Saque de 100.00 na conta 100");
      System.out.println("####");
      System.out.println(cc1);
      // transferencia 
      System.out.println("####");
      System.out.println("Transferência 500.00 da conta 100 para conta 101");
      System.out.println("####");
    
      System.out.println("Conta origem: " + cc1.toString());
      System.out.println("Conta destino: " + cc2.toString());
  
      cc1.transferir(new BigDecimal(500), cc2);
  
      System.out.println("Resultado:");
      System.out.println(cc1.toString());
      System.out.println(cc2.toString());

      System.out.println("----------- Investimento ----------------");

      ContaInvestimento cc3 = new ContaInvestimento(200, 2001, pf1);
      cc3.depositar(BigDecimal.valueOf(1000));
      System.out.println("Conta antes de render: " + cc3);
      cc3.render();

      System.out.println("Conta após rendimento: " + cc3);
  }
}