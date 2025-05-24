public class num {
  public static void main(String[] args) {
    int num1 = 12345;
    arrsAdditon(num1);
  }

  private static int length(int num) {
    int length = 0;
    while (num != 0) {
      num /= 10;
      length++;
    }
    return length;
  }

  private static int[] reversArray(int num) {
    int len = length(num);
    int copyNum = num;
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      copyNum = num % 10;
      arr[i] = copyNum;
      num /= 10;
    }
    return arr;
  }

  private static void arrsAdditon(int num1) {
    int[] arr1 = reversArray(num1);
    int len = arr1.length;
    for (int i = 0; i < len; i++) {
      System.out.println(arr1[i]);

    }
  }
}
