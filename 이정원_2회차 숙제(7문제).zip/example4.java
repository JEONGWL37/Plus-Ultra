public class example4 {

  public static int sumUp(int n) {
    int sum = 0;
    for(int i = 1; i <= n; i++) {
      sum +=i;
    }
    return sum;
  }



  public static void main(String[] args) throws Exception {

    int n = 5;
    System.out.println("1부터 " + n + "까지의 합은 " + sumUp(n) + "입니다");

  }
}