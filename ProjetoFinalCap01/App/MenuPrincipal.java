package App;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;

import javax.crypto.spec.PBEKeySpec;

import Models.ContaInvestimento;
import Models.Endereco;
import Models.PessoaFisica;
import Models.PessoaJuridica;

public class MenuPrincipal {

  public static void run() {
    System.out.println("Bem vindo ao Seu Banco!");

    System.out.println("1 - Digite número da sua conta.");
    System.out.println("2 - Crie agora a sua conta!");
    int opcao = validarOpcao(new int[] { 1, 2 });

  }

  private static int validarOpcao( int[] opcoesPermitidas){
      Scanner in = new Scanner( System.in );
      while (true) {
      int opcao = in.nextInt();
      for (int i = 0; i<opcoesPermitidas.length; i++  ){
        if (opcao == opcoesPermitidas[i]) {
          return opcao;
        }
      }
      System.out.println("Opcao nao permitida, digite novamente");
    }  
  }
}

/*
 * PessoaFisica pfTeste = new PessoaFisica("nome",
 * "cpf", new Date(2), "9999-9999", new Endereco(), "bbb@bb.com.br");
 * 
 * PessoaJuridica pjTeste = new PessoaJuridica("Monstros SA", "cnpj",
 * "1111-1111", new Endereco(), "msa@gmail.com");
 */
