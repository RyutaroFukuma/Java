public class Max3a {
  public static void main(String[] args){
    int x = 5;
    int y = 2;
    int z = 3;
    int max;

    if (x > y)
      if (x > z)
        max = x;
      else
        max = z;
    else
      if (y > z)
        max = y;
      else
        max = z;

    System.out.println("最大値は" + max + "です");
    
  }
}
