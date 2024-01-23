package bank.main;

import bank.core.CurrentAccount;
import bank.core.SavingsAccount;

public class Applicattion {

  public static void main(String[] args) {
    CurrentAccount ca = new CurrentAccount();

    ca.deposit(100);
    System.out.printf("The starting balance of the current account is: %s %n", ca.getBalance());

    ca.withdraw(20);
    System.out.printf("The current account balance is: %s %n", ca.getBalance());

    SavingsAccount sa = new SavingsAccount();

    sa.deposit(100);
    System.out.printf("The starting balance of the saving account is: %s %n", sa.getBalance());

    sa.withdraw(20);
    System.out.printf("The saving account balance is: %s %n", sa.getBalance());

  }
}
