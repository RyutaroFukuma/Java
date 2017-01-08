public class SearchMaximum {
  public static void main(String[] args) {
    int[] a = {15, 9, 12, 10, 6, 8, 16, 5, 13, 14};

    int max = a[0];
    for (int i = 1; i < a.length; i++)
      if (a[i] > max)
        max = a[i];

    System.out.println("最大値は" + max + "です");
  }
}
