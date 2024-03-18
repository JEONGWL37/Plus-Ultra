import java.util.Scanner;

public class vending_machine {
    static class Drink {
        String name;
        int price;

        public Drink(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Drink cola = new Drink("콜라", 1000);
        Drink cider = new Drink("사이다", 900);
        Drink water = new Drink("생수", 500);

        int totalMoney = 0; // 누적 금액

        while (true) {
            System.out.println("자판기가 작동합니다.");
            System.out.println("1. 콜라 - 1000원");
            System.out.println("2. 사이다 - 900원");
            System.out.println("3. 생수 - 500원");
            System.out.println("4. 종료");

            System.out.print("음료를 선택하세요 (번호 입력): ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("자판기를 종료합니다.");
                break;
            }

            Drink selectedDrink;
            switch (choice) {
                case 1:
                    selectedDrink = cola;
                    break;
                case 2:
                    selectedDrink = cider;
                    break;
                case 3:
                    selectedDrink = water;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
                    continue;
            }

            int insertedMoney = insertMoney(scanner);
            totalMoney += insertedMoney; // 누적 금액 업데이트
            if (insertedMoney < selectedDrink.price) {
                System.out.println("돈이 부족합니다.");
                continue;
            }

            provideDrink(selectedDrink);
            int change = insertedMoney - selectedDrink.price;
            System.out.println("잔돈 " + change + "원을 반환합니다.");

            // 추가 기능: 동전의 갯수 출력
            printCoinCount(insertedMoney);
            // 추가 기능: 현재까지 누적된 금액 출력
            System.out.println("현재까지 누적된 금액: " + totalMoney + "원");
        }

        scanner.close();
    }

    public static int insertMoney(Scanner scanner) {
        System.out.print("돈을 넣어주세요: ");
        return scanner.nextInt();
    }

    public static void provideDrink(Drink drink) {
        System.out.println(drink.name + "를 제공합니다.");
    }

    // 추가 메서드: 동전의 갯수 출력
    public static void printCoinCount(int money) {
        System.out.println("투입된 동전의 갯수: " + money / 100 + "개");
    }
}