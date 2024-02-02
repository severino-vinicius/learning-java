package exercise;

public class Carro {

  static int counter = 0;
  private String brand;
  private String model;
  private int year;
  public Carro(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
    Carro.counter++;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String displayInfo() {
    return "Brand: %s, Model: %s, Year: %d".formatted(
        brand, model, year
    );
  }

  public static int amountOfCars() {
    return counter;
  }
}
