import java.util.Scanner;

public class RandomCoupon{

  public static int generateCoupon(){
    int randomnum = (int) (1000 + Math.random() * (9999 - 1000));
    return randomnum;
  }

  public static void countDistinct(int n){
    int[] arr = new int[n];
    int flag;
    int randomNo;
    int count = 1;
    arr[0] = generateCoupon();
    for (int i = 1; i < arr.length; i++) {
      randomNo = generateCoupon();
      flag = 0;
      for (int j = 0; j < i; j++) {
        if (arr[j] == randomNo) {
          flag = 1;
          break;
        }
      }

      if (flag == 0) {
        count++;
        arr[i] = randomNo;
      }
      else {
        i--;
      }
    }
    display(arr);
    System.out.println("Total no. of Coupon are : "+count);
  }

  public static void display(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Random Coupon No. Are : "+arr[i]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter No. of Random Coupon to be generated : ");
    int n = sc.nextInt();
    countDistinct(n);
  }
}
