public class Cube {
  // note: use primitive data type for the side of the cube
  int side;

  int getSide() {
    return side;
  }

  int setSide(int num) {
    side = num;
    return side;
  }

  public static void main(String[] args) {
    Cube cube = new Cube();
    cube.side = 2;
    System.out.println(cube.getSide());
    System.out.println(cube.setSide(5));
  }
}