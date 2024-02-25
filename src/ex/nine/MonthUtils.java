package ex.nine;

public class MonthUtils {

  public static Month JAN = new Month("January",31,20) ;
  public static Month FEB =new Month ("February",29,19 );
  public static Month MAR = new Month("March",31,21);
  public static Month APR = new Month("April",30,20);
  public static Month MAY = new Month("May",31,18);
  public static Month JUN = new Month("Junt",30,21);
  public static Month[] ALL_Month = {JAN,FEB, MAR, APR, MAY, JUN};
  public static Month[] WINTER_Month = {JAN,FEB, MAR};
}
