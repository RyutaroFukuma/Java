public class SeparatedByComma1 {
  public static void main(String[] args) {
    int n = 10;

    for (int i = 1; i <= n-1; i++) {
      System.out.print(i);
      System.out.print(",");
    }
    System.out.print(n);
    System.out.println();
  }
}
