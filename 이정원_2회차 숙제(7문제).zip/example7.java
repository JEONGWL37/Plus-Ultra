import java.util.Random;

public class example7 {

  public static int random(int a, int b) {
    if(b <= a) {
      return a;
    }

    Random ran = new Random();
    return ran.nextInt(b-a + 1) + a;
  }



  public static void main(String[] args) throws Exception {

    System.out.println(("난수를 생성합니다"));

    int low = 10;
    int upper = 99;

    System.out.println("하한 값: " + low);
    System.out.println("상한 값: " + upper);
    int result = random((low), upper);
    System.out.println("생성한 난수는" + result + "입니다.");
  }
}