import java.util.Scanner;  

public class example6 {


  public static void printSeason(int month) {
    String season = "";
      switch (month) {
        case 3:
        case 4:
        case 5:
          season = "봄";
          break;

        case 6:
        case 7:
        case 8:
          season = "여름";
          break;

        case 9:
        case 10:
        case 11:
          season = "가을";
          break;    

        case 12:
        case 1:
        case 2:
          season = "겨울";
          break;    
      default:
        System.out.println("잘못된 입력 값입니다");
         return; //메서드 종료
      }
      System.out.println("해당 월의 계절은 '" + season + "'입니다.");
    } 
    

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("몇 월입니까? (1 ~ 12): ");
    int month = sc.nextInt();

    printSeason(month);
  }
}