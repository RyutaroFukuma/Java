public class TriangleWithMethod2 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++)
      printAsterisk(i);
  }

  static void printAsterisk(int number) {
    for (int i = 0; i < number; i++)
      System.out.print("*");
    System.out.println();
  }
}
