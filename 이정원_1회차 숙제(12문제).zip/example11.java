package example2;

import java.util.Scanner;

public class example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("양의 정수를 입력하세요: ");
        int num = sc.nextInt();
        
        // 0부터 입력된 수까지 카운트업하여 출력하기
        if (num >= 0) {
            System.out.println("0부터 " + num + "까지의 카운트업:");
            for (int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("양의 정수를 입력하세요.");
        }
	}

}
