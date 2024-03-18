package example;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int num1;	
		
		System.out.println("3자리의 정수값을 입력하시오: ");
		num1 = sc.nextInt();
		
		if(num1< 100 || num1 >999) {
			System.out.println("세자리의 정수 값이 아닙니다, 다시 입력해주세요.");
			num1 = sc.nextInt();
		}
		
		System.out.println(" 세자리 정수 값: "+num1);
		System.out.printf("입력한 값은 %d입니다.",num1);
		
	}

}
