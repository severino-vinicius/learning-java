package heritage.gameExercise;

public class CreateCharacter {

  public static void main(String[] args) {

    Warrior warrior = new Warrior();
    warrior.setName("Aragorn");
    warrior.setRace("Human");
    warrior.setWeapon("Sword");

    System.out.printf("%s is of the %s race and uses a %s%n", warrior.getName(), warrior.getRace(), warrior.getWeapon());

    Cleric cleric = new Cleric();
    cleric.setName("Gandalf");
    cleric.setRace("Maiar");
    cleric.setMagic("Light");

    warrior.move();
    warrior.attack();

    cleric.move();
    cleric.attack();
  }
}
