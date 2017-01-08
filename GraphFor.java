public class GraphFor {
 public static void main(String[] args) {
  for (int x = -8; x <= 8; x++) {
    int y = x * x;
    for (int i = 0; i < y; i++)
      System.out.print(" ");
    System.out.println("*");
  }
 }
}
