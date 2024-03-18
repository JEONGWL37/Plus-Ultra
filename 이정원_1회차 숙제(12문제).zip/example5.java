package example;

import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력 받은 정숫값 0까지 카운트 할 때 양의 정수값을 -1이하로 입력하면 다시 입력해야하는데 어떻게 할지 잘모르겠습니다.
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("카운트 다운합니다.");
	int a = sc.nextInt();
	
	while(a>0) {
		
		for(int i= a ; i>=0 ; i--) {
			System.out.println(i);
		}
	}
	
	}
}