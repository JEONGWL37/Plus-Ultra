package example;

import java.util.Scanner;

public class example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하세요: ");
		int num = sc.nextInt();
		
		int di = 0; // 자릿수 계산
		int temp = num;
		
		while(temp > 0) {
			temp /= 10; //입력한 정수를 10으로 나누면서 세어야 함_10제곱의 수.
			di++; //후순위로 카운트 1씩 증가
		}
		
		System.out.println("양의 정숫값: "+ num);
		System.out.printf("입력한 숫자는 %d자리입니다.", di);
		

	}

}
