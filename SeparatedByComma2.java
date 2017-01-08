public class SeparatedByComma2 {
  public static void main(String[] args) {
    int n = 10;
    int i = 1;
    for(;;) {
      System.out.print(i);
      if(i == n)
        break;
      System.out.print(",");
      i++;
    }
    System.out.println();
  }
}
