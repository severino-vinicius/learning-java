package bank.core;

public abstract class Account {

  protected double balance;

  public void deposit(double value) {
    this.balance += value;
  }

  public abstract void withdraw(double value);

  public double getBalance() {
    return this.balance;
  }

}
