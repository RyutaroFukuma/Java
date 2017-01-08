public class Max3d {
  public static void main(String[] args) {
    int x = 3;
    int y = 7;
    int z = 5;

    System.out.println("最大値は" + maximum(x, maximum(y, z))+ "です。");
  }

  static int maximum(int a, int b) {
    if (a > b)
      return a;
    else
      return b;
  }

}
