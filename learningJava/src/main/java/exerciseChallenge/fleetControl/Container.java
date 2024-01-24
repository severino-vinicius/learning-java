package exerciseChallenge.fleetControl;

public class Container implements ITransporter{
  private String model;
  private double capacity;

  public Container(String model, double capacity) {
    this.model = model;
    this.capacity = capacity;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getCapacity() {
    return capacity;
  }

  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }

  @Override
  public String transport(String origin, String destination) {
    return String.format("This Container will transport the cargo"
        + "from %s to %s",origin, destination);
  }
}
