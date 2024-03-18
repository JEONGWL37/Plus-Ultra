package example;

import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 *를 표시할까요?: ");
		int a = sc.nextInt();
		
		if(a >= 1) {
			for (int i=0; i < a; i++) {
				System.out.print("*");
			}
			System.out.println(); //마지막 줄바꿈 표시
		} else {
			System.out.println("1미만의 수입니다 값을 1이상 올리세요");
		}
		
	}

}
