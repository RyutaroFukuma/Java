public class SumOneTwoThree2 {
  public static void main(String[] args) {
    int sum = 0;

    int i = 1;
    while (i <= 3) {
      sum = sum + i;
      i++;
    }
    System.out.println("1から3までの和は" +sum);
  }
}
