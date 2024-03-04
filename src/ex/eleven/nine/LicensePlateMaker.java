package ex.eleven.nine;

public class LicensePlateMaker {
  public  String prefix;
  private int lastNumber;

  public LicensePlateMaker(String prefix, int lastNumber) {
    this.prefix = prefix;
    this.lastNumber = lastNumber;
  }

  public LicensePlate makeNextPlate() {
    lastNumber+= 1;
    return new LicensePlate(prefix + (" - " + lastNumber));



  }

}
