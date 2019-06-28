import java.util.Scanner;
import java.lang.*;

public class BinaryFind{
  public  void binarySearch(int low , int high){
    int middle = (low + high) / 2;
    Scanner sc = new Scanner(System.in);
    char choice;
    if (low < high){
      System.out.println("Is the No. is between "+low+" & "+middle+" Say 'y' or 'n'");
      choice = sc.next().charAt(0);
      if (choice == 'y') {
        binarySearch(low,middle);
      }
      else {
        binarySearch(middle + 1,high);
      }
    }
    else if (low == high) {
      System.out.println("The No. you are Searching is : " +low);
    }
  }

  public static void main(String[] args) {
    BinaryFind bf = new BinaryFind();
    Scanner sc = new Scanner(System.in);
    String[] range = new String[2];
    System.out.print("Enter the Range of No. : ");
    range = sc.nextLine().split(" - ");
    String min = range[0];
    String limit = range[1];
    bf.binarySearch(Integer.parseInt(min), Integer.parseInt(limit) - 1);
  }
}
