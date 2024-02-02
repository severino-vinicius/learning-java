package heritage.gameExercise;

public class Cleric extends PlayableCharacter {
  private String magic; // magia

  public String getMagic() {
    return magic;
  }

  @Override
  public void attack() {
    System.out.println("The Cleric casts a spell");
  }

  public void heal() {
    System.out.println("The cleric is healing with a basic ability.");
  }

  public void heal(String potion) {
    System.out.printf("The cleric is healing with the potion %s. %n", potion);
  }

  public void heal(String spell, int power) {
    System.out.printf("The Cleric is using the spell %s with a power of %d. %n", spell, power);
  }

  public void setMagic(String magic) {
    this.magic = magic;
  }
}
