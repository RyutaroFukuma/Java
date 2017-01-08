public class Pochi3 {
  public static void main(String[] args) {
    System.out.println("ポチがないた");

    bark(1);
    bark(2);
    bark(3);
  }

  static void bark(int number) {
    for (int i = 0; i < number; i++)
      System.out.print("ワン");
    System.out.println();
  }

}
