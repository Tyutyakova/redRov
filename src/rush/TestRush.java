package rush;

public class TestRush {
    public static String getRandomDiceNumber() {
        double b = Math.random();
        int a = (int) (b * 99);
        String result = a + "---" + b;

        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String x = getRandomDiceNumber();
            System.out.println(x);
        }
    }
}
