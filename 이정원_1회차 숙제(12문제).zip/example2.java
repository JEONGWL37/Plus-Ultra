package example;

import java.util.Random;
import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		//ran.setSeed(System.currentTimeMillis());
		Scanner sc = new Scanner(System.in);
		
		int input =0;
		int answer = 0;
		
		//int taget =ran.nextInt(90)+10; //10부터 99까지의 정수
		answer =(int)(Math.random()*99)+10;
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요.");
		
		do {
			System.out.println("어떤 숫자일까? : ");
			input = sc.nextInt();
			
			if( input < answer) {
				System.out.println("더 큰 수를 입력하시오");
			} else if(input > answer) {
				System.out.println("더 작은 수를 입력하시오");
			} else {
				System.out.println("정답입니다!");
			}
			
		} while(input != answer);
		
			
	}

}
