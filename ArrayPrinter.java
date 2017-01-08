public class ArrayPrinter {
  public static void main(String[] args) {
    int a[] = {15, 9, 12, 10, 6, 8, 16, 5, 13, 14};
    print(a);

    //a[0]に2に置き換える
    print(a);
  }
  static void print(int[] a) {
    for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
    System.out.println();
  }
}
