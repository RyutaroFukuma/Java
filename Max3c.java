public class Max3c{
  public static void main(String[] args){

  int x = 5;
  int y = 2;
  int z = 3;
  int max;

  max = x;
  if (y > max){
   max = y;
  }
  if (z > max){
   max = z;
  }

  System.out.println("最大値は" + max + "です");
  }
}
