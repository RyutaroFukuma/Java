public class CalcOO {
  public static void main(String[] args) {
    Calculator calc = new Calculator();

    System.out.println("1 + 2 = " + calc.add(1, 2));
    System.out.println("5 - 4 = " + calc.add(5, 4));

    // 5 * (3 - 2)を計算

    //まず3 - 2を計算しメモリに記憶
    calc.setMemory(calc.sub(3, 2));
    //メモリから値を取り出し5と掛け算
    int ans = calc.multi(5, calc.getMemory());

    System.out.println("5 * (3 - 2) = " + ans);
  }
}

class Calculator {
  int memory;

  void setMemory(int x) {
    memory = x;
  }

  int getMemory() {
    return memory;
  }

  int add(int x, int y) {
    int ans;
    ans = x + y;
    return ans;
  }

  int sub(int x, int y) {
    int ans;
    ans = x - y;
    return ans;
  }

  int multi(int x, int y) {
    int ans;
    ans = x * y;
    return ans;
  }

  int divide(int x, int y) {
    int ans;
    ans = x / y;
    return ans;
  }
}
