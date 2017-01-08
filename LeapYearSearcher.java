public class LeapYearSearcher {
  public static void main(String[] args) {

    boolean isLeapYear = false; //うるう年があったかどうかを示す目印

    for(int i = 1898; i <= 1903; i++)
       if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
        isLeapYear = true; //繰り返し中にうるう年が1つでもあったらtrueにする
       }
    if (isLeapYear)
      System.out.println("うるう年がありました");
    else
      System.out.println("うるう年がありませんでした");

  }
} 
