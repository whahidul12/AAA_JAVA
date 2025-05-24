public class Main {
  public static void main(String[] args) {
    Car supra = new Car();
    System.out.println("supra color: " + supra.color);
    supra.addFule(8);
    supra.start();
    supra.drive();
    System.out.println("supra fule: " + supra.fuleInLiters);
    System.out.println("\n");
    Car bmw = new Car();
    System.out.println("bmw color: " + bmw.color);
    bmw.addFule(12);
    bmw.start();
    bmw.drive();
    System.out.println("bmw fule: " + bmw.fuleInLiters);
  }
}
