public class SumOfEvenNumbers2 {
  public static void main(String[] args) {
    int n = 10;
    int sum = 0;

    for(int i = 0; i <= n; i++){
     if (i % 2 == 0){
      sum = sum + i;
    }
    System.out.println("0から" + i +"までの偶数の合計は" + sum);

    }
  }
}
