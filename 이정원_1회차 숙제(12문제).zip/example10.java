package example2;

import java.util.Scanner;

public class example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("양의 정수값: ");
        int num = sc.nextInt();
        
        // 입력된 수까지의 곱 계산하기
        long a = 1;
        for (int i = 1; i <= num; i++) {
            a *= i;
        }
        
        System.out.printf("1부터 %d까지의 곱은 %d입니다", num, a);

	}

}
