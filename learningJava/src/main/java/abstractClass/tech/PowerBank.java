package abstractClass.tech;

public class PowerBank implements Chargeable{

  @Override
  public void charge() {
    System.out.println("Charging the Powerbank");
  }

  @Override
  public int getBatteryLevel() {
    return 65;
  }
}
