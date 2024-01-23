package heritage.gameExercise;

public class PlayableCharacter {

  private String name;
  private String race;
  protected boolean isAlive;

  public PlayableCharacter() {
    this.isAlive = true;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public void move() {
    if (!isAlive) {
      System.out.println("Character died and cannot move.");
      return;
    }
    System.out.printf("%s is moving!", name);
  }

  public void attack() {
    if (!isAlive) {
      System.out.println("Character died and cannot attack.");
      return;
    }
    System.out.printf("%s is attacking!", name);
  }
}
