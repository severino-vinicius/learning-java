package heritage.gameExercise;

public class Warrior extends PlayableCharacter{

  private String weapon;

  public String getWeapon() {
    return weapon;
  }

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  public void specialAttack() {
    if (!isAlive) {
      System.out.println("Character died and cannot use special attack.");
    }
    System.out.printf("%s is using special attack!", this.getName());
  }

}
