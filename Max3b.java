public class Max3b {
  public static void main(String[] args) {
    int x = 5;
    int y = 2;
    int z = 3;
    int max;

    if (x >= y && x >= z){
      max = x;
    }
    else if (y >= x && y >= z){
      max = y;
    }
    else {
      max = z;
    }
    System.out.println("最大値は" + max + "です");

  }
}
