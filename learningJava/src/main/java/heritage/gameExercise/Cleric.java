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

  public void setMagic(String magic) {
    this.magic = magic;
  }
}
