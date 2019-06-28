import java.util.Scanner;

public class LeapYear{

  public static void checkLeap(int year){
    if ((year % 4 == 0 && year/100 != 0) || year % 400 == 0) {
      System.out.println("It's is a Leap Year");
    }
    else {
      System.out.println("It's not a Leap Year");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Year : ");
    int year = sc.nextInt();
    checkLeap(year);
  }
}
