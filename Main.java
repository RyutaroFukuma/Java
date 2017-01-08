import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int winter = 0;

    for (int i = 1; i <= 10; i++) {
      String s = sc.next();
      if (s. equals ("W")) {
        winter++;
      }
    }
    if (winter >= 5){
      System.out.println("OK");
    }
    else {
      System.out.println("NG");

    }
}
}
