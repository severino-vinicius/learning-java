package abstractClass.tech;

public class Desktop extends ComputerDevice{
  public Desktop(String brand, double storageCapacity) {
    super(brand, storageCapacity);
  }

  @Override
  public void bootUp() {
    System.out.println("Starting the desktop computer...");
  }
}
