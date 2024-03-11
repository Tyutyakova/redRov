package ex.twelve;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.ArrayList;
import java.util.List;

public class twelve {
    //abbrevName
        public static String abbrevName(String name) {
            String init;
            for (int i = 0; name.length() > i; i++) {
                if (' ' == name.charAt(i)) {

                   return name = name.toUpperCase().charAt(0) + "." + name.toUpperCase().charAt(i+1) +".";
                }
            }
        return null;

    }
    public static String abbrevName1(String name) {
        String[] nameArr = name.split(" ");
        return nameArr[0].toUpperCase().charAt(0) + "." + nameArr[1].toUpperCase().charAt(0);

    }
    public static String abbrevName2(String name) {

        return name.toUpperCase().charAt(0) + "." + name.toUpperCase().charAt((name.indexOf(" "))+1);

    }
    //feast

    public static boolean feast(String beast, String dish) {
            if (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1)) {
                return true;
            } return false;
        }

//triple puzzle

    public static String tripleTrouble(String one, String two, String three) {
        String allChar = "";
          for (int i = 0; one.length() > i; i++) {
                    allChar += ""+ one.charAt(i) + two.charAt(i) + three.charAt(i);
          } return allChar;

    }
    //alphabet
    public static String position(char alphabet)
    {
        String alph = "abcdefghijklmnopqrstuvwxyz";

         return "Position of alphabet: " + (alph.indexOf(alphabet) + 1);
    }

    public static void main(String[] args) {
        System.out.println(feast("ffjhj uuut", "f9rh tn hh"));
        System.out.println(abbrevName2("gfccc ggggg "));
        System.out.println(tripleTrouble("Bm", "aa", "tn"));
        System.out.println(position('z'));
    }
}
