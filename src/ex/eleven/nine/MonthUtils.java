package ex.eleven.nine;

public class MonthUtils {

  public final static Month JAN = new Month("January",31,20) ;
  public final static Month FEB =new Month("February",29,19 );
  public final static Month MAR = new Month("March",31,21);
  public final static Month APR = new Month("April",30,20);
  public final static Month MAY = new Month("May",31,18);
  public final static Month JUN = new Month("Junt",30,21);
  public final static Month[] ALL_Month = {JAN,FEB, MAR, APR, MAY, JUN};
  public static Month[] WINTER_Month = {JAN,FEB, MAR};
}
