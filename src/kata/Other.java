package kata;

public class Other {

    public static void printPoints(int[] x, int[] y, int[] color)
    {
        for (int i = 0; i < x.length; i++)
            System.out.println("Цвет точки x=" + x[i] + ", y=" + y[i] + " " + color[i]);
    }


        public static int N = 10;

        public static void drawValue(double y)
        {
            int value = (int) (y * N) + N;
            for (int i = 0; i < 2 * N; i++)
            {
                char c = i == N ? '|': '.';
                if (i == value)
                    c = '*';
                System.out.print(c);
            }
            System.out.println();
        }


    public static void main(String[] args)
    {
//        int[] x = new int[10];
//        int[] y = new int[10];
//        int[] color = new int[10];
//        printPoints(x, y, color);


            for (int i = 0; i < 10 * N; i++)
            {
                double x = i * 1.0 / N;
                double y = Math.sin(x);
                drawValue(y);
            }


    }
}
