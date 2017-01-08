public class CactusObservation {
  public static void main(String[] args) {
    Cactus myCactus = new Cactus();

    //最初は高さ100 mm = 10cm, 成長率年間5mmとする
    myCactus.setHeightAndGrowth(100, 5);

    System.out.println("現在のサボテンの背丈は" + myCactus.getHeight());

    myCactus.grown(1);
    System.out.println("現在のサボテンの背丈は" + myCactus.getHeight());

    myCactus.grown(2);
    System.out.println("現在のサボテンの背丈は" + myCactus.getHeight());
  }
}

class Cactus {
  int height;
  int growth;

  void.setHeightAndGrowth(int x, int y) {
    height = x;
    growth = y;
  }

  void grown(int years) {
    height = height + growth * years;
  }

  int getHeight() {
    return height;
  }
}
