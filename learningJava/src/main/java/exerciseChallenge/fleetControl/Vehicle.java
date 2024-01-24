package exerciseChallenge.fleetControl;

import java.util.ArrayList;

public abstract class Vehicle {
  private String licensePlate;
  private int manufactureYear;
  private String Fuel;
  protected ArrayList<String> supply;

  public Vehicle(String licensePlate, int manufactureYear) {
    this.licensePlate = licensePlate;
    this.manufactureYear = manufactureYear;
    this.supply = new ArrayList<>();
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public int getManufactureYear() {
    return manufactureYear;
  }

  public void setManufactureYear(int manufactureYear) {
    this.manufactureYear = manufactureYear;
  }

  public String getFuel() {
    return Fuel;
  }

  public void setFuel(String fuel) {
    Fuel = fuel;
  }

  public abstract void toFuel(String local, String driver, double value);

  public void supplyList() {
    System.out.println("+-- Lista de Abastecimentos para o veiculo: " + this.licensePlate + " --+");
    for (String supply : this.supply) {
      System.out.println("|" + supply + "\t|");
    }
    System.out.println("+----------------------- FIM --------------------+\n");
  }
}
