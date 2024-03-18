package example;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 A: ");
		a = sc.nextInt();
		System.out.print("정수 b: ");
		b = sc.nextInt();
		
		if( a < b ) {
			for(int i = a ; i <= b ; i++) {
				System.out.print(i );
			}
		} else {
			for(int i=b ; i <= a ; i++) {
				System.out.print(i );
			}
		}
		
	}

}
