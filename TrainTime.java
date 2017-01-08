public class TrainTime {
  public static void main(String[] args){
    System.out.println("時|発車予定時刻");
    for (int hour = 10; hour <=12; hour++){
      System.out.print(hour + " | ");

      for (int min = 0; min <= 59; min = min + 5)
        System.out.print(min + " ");
      System.out.println();
    }
  }
}
