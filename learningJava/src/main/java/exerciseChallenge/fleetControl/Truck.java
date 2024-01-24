package exerciseChallenge.fleetControl;

public class Truck extends Vehicle implements ITransporter{

  public Truck(String licensePlate, int manufactureYear) {
    super(licensePlate, manufactureYear);
    this.setFuel("Diesel");
  }
  @Override
  public void toFuel(String local, String driver, double value) {
    this.supply.add(String.format("Local: %s, Driver: %s, value: R$ %.2f", local, driver, value));
  }

  @Override
  public String transport(String origin, String destination) {
    return String.format("Vehicle of license plate: %s, will transport the cargo"
            + "from %s to %s", this.getLicensePlate(), origin, destination);
  }
}
