public class IsPrime2 {
  public static void main(String[] args) {
    int n = 31;
    int i = 2;

    boolean IsPrime2 = true;

    while(i <= n - 1) {
      if (n % i == 0) {
        IsPrime2 = false;
        break;
      }
      i++;
    }

    if (IsPrime2)
      System.out.println(n + " is a prime number.");
    else
      System.out.println(n + " is not a prime number.");
  }

}
