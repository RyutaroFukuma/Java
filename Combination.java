public class Combination {
  public static void main(String[] args) {
    int n = 5;
    int m = 2;

    int combination = fact(n) / (fact(m) * fact(n - m));
    System.out.println(" Combination of " + n + "," + m + " = " + combination);
  }
  
    static int fact (int x) {
      int f = 1;

      for (int i = 1; i <= x; i++)
        f = f * i;
      return f;
    }
}
