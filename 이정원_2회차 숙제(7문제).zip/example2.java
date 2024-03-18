public class example2 {

  public static int min(int a, int b, int c) {
    int min = a;

    if(b < min) {
      min=b;
    }
    if(c < min) {
      min = c;
    }
    return min;
  }




  public static void main(String[] args) throws Exception {

    int a = 1;
    int b = 3;
    int c = 2;

    System.out.println("최솟값: "+min(a,b,c));

            }
}