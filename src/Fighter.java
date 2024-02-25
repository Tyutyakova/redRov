public class Fighter {
  public String name;
  public int health, damagePerAttack;
  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }

   public static void test(Fighter fighter1, Fighter fighter2) {
    for (int i = 0; fighter1.health >= 0 && fighter2.health >= 0; i++) {
      int helthAfterDamage1 = fighter1.health - fighter2.damagePerAttack;
      int helthAfterDamage2 = fighter2.health - fighter1.damagePerAttack;
      if (helthAfterDamage1 > 0 && helthAfterDamage2 > 0) {
        fighter1.health = helthAfterDamage1;
        fighter2.health = helthAfterDamage2;
        System.out.println(fighter1.health);
      } else if (helthAfterDamage1 <= 0 ) {
        System.out.println(fighter1.name + " is dead");
      }
      else {System.out.println(fighter2.name + " is dead"); }

      }
    }


  public static void main(String[] args) {
    Fighter fit1 = new Fighter("Nik", 11, 2);
    Fighter fit2 = new Fighter("Leo", 10, 3);
    System.out.println(Kata.declareWinner(fit1, fit2,"Nik"));
  }
}