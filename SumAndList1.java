public class SumAndList1 {
    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        a[0] = 3;
        a[1] = 5;
        a[2] = 6;
        a[3] = 1;
        a[4] = 9;

        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum = sum + a[i];

        System.out.println("以下の数の合計: " + sum);

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println();
    }
}
