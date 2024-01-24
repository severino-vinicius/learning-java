package abstractClass.tech;

public class Laptop extends ComputerDevice implements Chargeable{

  private double size;  // tamanho (14", 15", etc)

  public Laptop(String brand, double storageCapacity, double size) {
    super(brand, storageCapacity);

    this.size = size;
  }

  @Override
  public void bootUp() {
    System.out.println("Stating the laptop with size " + size + "...");
  }

  @Override
  public void charge() {
    System.out.println("Charging the Laptop");
  }

  @Override
  public int getBatteryLevel() {
    return 85;
  }
}
