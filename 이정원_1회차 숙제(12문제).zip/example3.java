package example;

import java.util.Random;
import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		//ran.setSeed(System.currentTimeMillis());
		Scanner sc = new Scanner(System.in);
		
		int input =0;
		int answer = 0;
		int counts = 0;
		int maxcounts = 10;
		
		//int taget =ran.nextInt(100); //0부터 99까지의 정수
		answer =(int)(Math.random()*100);
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요.");
		
		do {
			System.out.print("어떤 숫자일까?: ");
			input =sc.nextInt();
			counts++;
			
		if(input < answer) {
				System.out.println("더 큰 숫자입니다.");
			} else if(input > answer) {
				System.out.println("더 작은 숫자입니다.");
			} else { 
				System.out.println("정답입니다!");
				break;
			} if (counts == maxcounts) {
				System.out.println("횟수가 소진되었습니다 정답은" + answer +"입니다");
				break;
			}
		}while(true);
		
	}
}		
