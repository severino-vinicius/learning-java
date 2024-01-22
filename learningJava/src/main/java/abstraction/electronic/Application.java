package abstraction.electronic;

public class Application {

  public static void main(String[] args) {

    Television television = new Television("Phillips", "LCD", 32);

    television.turnOn();
    television.turnOff();

    System.out.println(television.info());
  }
}
