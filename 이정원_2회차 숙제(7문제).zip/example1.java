import java.util.Scanner;

public class example1 {

    public static int signof(int num) {
        if(num < 0) {
            return -1;
        } else if (num == 0) {
            return 0;

        } else {
            return 1;
        }
    }

    
    public static void main(String[] args) throws Exception {
       
       Scanner sc = new Scanner(System.in);

       System.out.print("정수를 입력하세요: ");
       int num = sc.nextInt();

       System.out.println("sginof(x)는"+ signof(num) +"입니다");
    }
}
