package exerciseChallenge.fleetControl;

public class Car extends Vehicle{

  public Car(String licensePlate, int manufactureYear) {
    super(licensePlate, manufactureYear);
    this.setFuel("Flex");
  }

  @Override
  public void toFuel(String local, String driver, double value) {
    this.supply.add(String.format("Local: %s, Driver: %s, value: R$ %.2f", local, driver, value));
  }
}
