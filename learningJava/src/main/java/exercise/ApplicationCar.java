package exercise;

public class ApplicationCar {

  public static void main(String[] args) {
    Carro carro = new Carro("Hyundai", "HB20", 2022);
    Carro carro2 = new Carro("Toyota", "Corola", 2023);

    System.out.println(carro.displayInfo());
    System.out.println(carro2.displayInfo());
    System.out.println(Carro.amountOfCars());
  }
}
