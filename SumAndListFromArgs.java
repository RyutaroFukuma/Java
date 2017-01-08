public class SumAndListFromArgs {
  public static void main (String[] args) {
    int sum = 0;
    for (int i = 0; i < args.length; i++)
      sum = sum + Integer.parseInt(args[i]);

    System.out.println("合計値:" +  sum);

    System.out.println("コマンドライン引数の内容.");
    for (int i = 0; i < args.length; i++)
      System.out.print(Integer.parseInt(args[i]) + " ");
    System.out.println();
}
}
