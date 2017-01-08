class Person {
  String address;
  String name;

  void printAddress() {
     System.out.println("住所:" + address);
  }

  void printName() {
    System.out.println("名前:" + name);
  }

  void setAddress(String a) {
    address = a;
  }

  void setName(String n) {
    name = n;
  }
}

public class AddressNote2 {
  public static void main(String[] args) {
    Person mikio = new Person();
    Person kimiko = new Person();

    mikio.setAddress("くそ柏");
    mikio.setName("ふくま");
    kimiko.setAddress("くそゴミ");
    kimiko.setName("りゅうたろう");

    mikio.printAddress();
    mikio.printName();
    kimiko.printAddress();
    kimiko.printName();
  }
}
