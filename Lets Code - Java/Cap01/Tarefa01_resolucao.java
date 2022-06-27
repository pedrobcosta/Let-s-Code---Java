package Cap01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tarefa01_resolucao {

  public static void main(String[] args) {
    String userName = "João";
    double balance = 10000d;
    double interestRate = 12.5d;
    printInterestForUser(userName, balance, interestRate);
  }

  // static InterestRateDTO getUserData() {
  // return null;
  // }

  static void printInterestForUser(String userName, double balance, double interestRate) {
    if (balance <= 0) {
      System.out.println(userName + " irá receber R$ 0");
    } else {
      BalanceRange balanceRange = BalanceRange.getBalanceRange(balance);

      switch (balanceRange) {
        case _5000:
        case _4001_5000:
          balance += 50;
        case _3001_4000:
        case _2001_3000:
          interestRate += 3;
          break;
        case _1001_2000:
          interestRate += 2;
          break;
        case _0_1000:
          interestRate += 1;
          break;
        default:
          interestRate += 3;
          break;
      }

      BigDecimal balanco = new BigDecimal(balance);
      BigDecimal taxaDeJuros = new BigDecimal(interestRate);
      BigDecimal recebimento = new BigDecimal((balanco.multiply(taxaDeJuros)
          .divide(new BigDecimal(100))
          .toPlainString()))
          .setScale(2, RoundingMode.DOWN);
      System.out.println(userName + " irá receber R$ " + recebimento);
    }
  }

  enum BalanceRange {
    _0_1000(1000),
    _1001_2000(2000),
    _2001_3000(3000),
    _3001_4000(4000),
    _4001_5000(5000),
    _5000(0);

    int maxValue;

    BalanceRange(int range) {
      this.maxValue = range;
    }

    public static BalanceRange getBalanceRange(double range) {
      for (BalanceRange item : BalanceRange.values()) {
        if (item.maxValue >= range) {
          return item;
        }
      }
      return BalanceRange._5000;
    }
  }
}