public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    // Your code goes here. Have fun!
    String attacker = firstAttacker;
    for (int i = 0; fighter2.health > 0 && fighter1.health > 0; i++) {
      if (attacker.equals(fighter1.name)) {
        fighter2.health -= fighter1.damagePerAttack;
        attacker = fighter2.name;

        System.out.println(fighter1.name + " attacks " + fighter2.name + ";" + fighter2.name + " now has " + fighter2.health + " health.");

      } else {
        fighter1.health -= fighter2.damagePerAttack;
        attacker = fighter1.name;
        System.out.println(fighter2.name + " attacks " + fighter1.name + ";" + fighter1.name + " now has " + fighter1.health + " health.");
      }
    }
    if (fighter1.health > 0) {
      return fighter1.name;
    } return fighter2.name;

  }
}