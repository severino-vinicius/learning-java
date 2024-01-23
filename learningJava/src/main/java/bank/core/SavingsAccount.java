package bank.core;

public class SavingsAccount extends Account{

  @Override
  public void withdraw(double value) {
    this.balance -= value + 2;
  }

  public void simulateIncome() {
    balance *= 0.05;
  }

  public void simulateIncome(double tax) {
    balance *= tax;
  }
}
