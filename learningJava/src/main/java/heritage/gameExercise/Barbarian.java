package heritage.gameExercise;

public class Barbarian extends PlayableCharacter {

  @Override
  public void move() {
    System.out.println("The Barbarian picks up momentum...");
    super.move();
  }

}
