public class TriangleWithMethod3 {
  public static void main(String[] args) {
    int size = 5;

    System.out.print("*");
    repeatCharacters(size,".");
    System.out.println();
    for (int i = 1; i <= size -1; i++) {
      System.out.print("*");
      repeatCharacters(size - i, ".");
      System.out.print("*");
      repeatCharacters(size - i, ".");
      System.out.print("*");
      repeatCharacters(size - i, ".");
    }
    repeatCharacters(size + 1, ".");
    System.out.println();
  }

  static void repeatCharacters(int count, String charactor) {
    for (int i = 0; i < count; i++)
      System.out.print(charactor);
  }
}
