public class SumUntil100 {
  public static void main(String[] args) {
    int sum = 0;

    int i = 1;
    while (sum <= 100) {
      sum = sum + i;
      i++;
    }
    System.out.println("1から" + (i-1) + "までの和は" +sum);
  }
}
