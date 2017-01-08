public class Heikin2 {
  public static void main(String[] args) {
    int[] ten;
    int heikin;

    ten = new int[3];
    ten[0] = 63;
    ten[1] = 90;
    ten[2] = 75;
    heikin = (ten[0] + ten[1] + ten[2]) / 3;
    System.out.println("平均点は"  +heikin+ "点");
  }
}
