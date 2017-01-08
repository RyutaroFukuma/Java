public class PropertyOfCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(1);

        System.out.println("Area: " + c.CalcArea());
        System.out.println("Outline: " + c.CalcOutline());
    }
}

class Circle {
    int r;
    void setRadius(int r) {
        this.r = r;
    }

    // 面積を計算する
    double CalcArea() {
        return r * r * 3.14;

    }

    // 円周を計算する
    double CalcOutline() {
        return r * 2 * 3.14;
    }

}
