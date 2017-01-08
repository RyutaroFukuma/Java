class Person {
  String address;
  String name;
}

public class AddressNoteWeakOO {
  public static void main(String[] args) {
    Person = mikio;
    mikio = new Person();

    mikio.address = "柏市";
    mikio.name = "福間";

    printAddress(mikio.address);
    printName(mikio.name);
  }

  static void printName(String name) {
    System.out.println("名前:" + name);
  }
}
