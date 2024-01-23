package bank.core;

public class CurrentAccount extends Account{

  @Override
  public void withdraw(double value) {
    this.balance -= value + (value * 0.05);
  }
}
