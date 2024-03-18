package example;

import java.util.Scanner;

public class example7 {
	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수를 입력하세요: ");
        int count = sc.nextInt();
        
        if (count >= 1) {
            int i = 0;
            while (i < count) {
                System.out.print("*");
                i++;
            }
            System.out.println(); // 마지막에 줄 바꿈 문자 출력
        } else {
            System.out.println("입력한 값이 1 미만이므로 '*'을 표시할 수 없습니다.");
        }
	}

}
