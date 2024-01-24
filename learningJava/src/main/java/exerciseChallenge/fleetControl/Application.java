package exerciseChallenge.fleetControl;

public class Application {

  public static void main(String[] args) {
    Car c1 = new Car("LPZ 2345", 2014);
    Truck t1 = new Truck("POZ 9988", 2015);

    c1.toFuel("Posto 1", "Vinicius", 180);
    c1.toFuel("Posto 12", "Ana", 200);
    c1.toFuel("Posto 3", "Guilherme", 100);

    t1.toFuel("Posto 4", "Severino", 300);
    t1.toFuel("Posto 8", "Luiza", 99);
    t1.toFuel("Posto 7", "Sales", 80);

    c1.supplyList();

    t1.supplyList();
  }
}
