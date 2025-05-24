public class numCopy {
  public static boolean isPalindrome(int x) {
    if (x <= 0 || x % 10 == 0) {
      return false;
    }

    int reversed = 0;
    while (x > reversed) {
      int digit = x % 10;
      System.out.println("x: " + x);
      System.out.println("D: " + digit);
      reversed = reversed * 10 + digit;
      x /= 10;
      System.out.println(">> " + x);
    }
    return (x == reversed || x == reversed / 10);
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(121)); // true
    // System.out.println(isPalindrome(-121)); // false
    // System.out.println(isPalindrome(10)); // false
  }
}
