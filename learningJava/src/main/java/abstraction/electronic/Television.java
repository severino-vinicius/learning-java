package abstraction.electronic;

public class Television {
  boolean isOn = false;
  String brand;
  String model;
  int size;

  public Television(String brand, String model, int size) {
    this.brand = brand;
    this.model = model;
    this.size = size;
  }

  public void turnOn() {
    System.out.println("Ligando televisão...");
    this.isOn = true;
  }

  public void turnOff() {
    System.out.println("Desligado televisão...");
    this.isOn = false;
  }

  public String info() {
    return "Marca: %s, Modelo: %s, Tamanho: %d, Ligada: %b".formatted(
        brand, model, size, isOn
    );
  }
}
