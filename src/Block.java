public class Block{
  // Good Luck!
 // width length, height
  int width;
  int length;
  int height;

   Block(int[] arr) {
    this.width = arr[0];
    this.length = arr[1];
    this.height = arr [2];
   }


  int getWidth() {
    return width ;
  }
  int getLength() {
    return length;
  }
  int getHeight() {
     return height;
  }

  int getVolume() {
     int sum = width * length * height;
    return sum;
  }

  int getSurfaceArea() {
     int area = 2 * (width * height + width * length + length * height);
     return area;
  }


  public static void main(String[] args) {
     Block block1 = new Block(new int[] {2, 2, 2});
    System.out.println(block1.getWidth());
    System.out.println(block1.getVolume());
    System.out.println(block1.getSurfaceArea());
  }
}