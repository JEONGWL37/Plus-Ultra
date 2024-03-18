package example2;

import java.util.Scanner;

public class example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계절을 찾습니다");
		
		while (true) {
			
            // 월 입력 받기
            System.out.print("몇 월입니까?: ");
            int month = sc.nextInt();
            switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울입니다.");
                break;
            default:
                System.out.println("1부터 12까지의 숫자를 입력하세요.");
                continue; // 잘못된 입력이면 반복문의 처음으로 돌아감
        }
            
         // 더 입력 받을지 확인
            System.out.print("다시 하시겠습니까? (Y/N): ");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("N")) {
                break; // 입력 중단
            }
        }

	}

}
