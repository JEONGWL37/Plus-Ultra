public class example3 {

  public static int med(int a, int b, int c) {
    if((a >= b && a <= c) || (a <= b && a >= c)) {
      return a;
    } else if ((b >= a && b <=c) || (b <= a && b >=c)) {
      return b;
    } else {
      return c;
    }
  }



  public static void main(String[] args) throws Exception {

    int a = 1;
    int b = 3;
    int c = 2;

    System.out.println("중간값은"+ med(a, b, c) +"입니다");
  }
}