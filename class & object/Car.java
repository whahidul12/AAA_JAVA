public class Car {
  String name;
  String color;
  int numOfTiers;
  int numOfSeats;
  float fuleInLiters;

  public void start() {
    System.out.println("Cat is started,,,brmhh");
  }

  public void drive() {
    if (fuleInLiters == 0) {
      System.out.println("car is out of fule " + fuleInLiters);
    } else if (fuleInLiters <= 5) {
      System.out.println("car fule is less then 5 Lt, saving mode on " + fuleInLiters);
    } else {
      System.out.println("the is running.... " + fuleInLiters);
      fuleInLiters--;
    }
  }

  public float fule() {
    return fuleInLiters;
  }

  public void addFule(float fuleInLiters) {
    this.fuleInLiters += fuleInLiters;
    System.out.println("fule added " + fuleInLiters);
  }
}
