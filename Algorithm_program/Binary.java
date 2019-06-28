import java.util.Scanner;
public class Binary{
  public void binary(int num){
    int rem;
    String bin[] = {"0","1"};
    String binary = "";
    int tempnumber = num;
    int padding = 0;
    while (tempnumber > 0 || padding % 8 != 0) {
      rem = tempnumber % 2;
      binary = bin[rem] + binary;
      tempnumber /= 2;
      padding++;
      if (padding % 4 == 0 && tempnumber != 0 ) {
        binary = " " + binary;
      }
      else if (padding % 4 == 0) {
        binary = " " + binary;
      }
    }
    System.out.println("Binary Conversion of "+num+" :"+binary);
  }
  public static void main(String[] args) {
    Binary b = new Binary();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Decimal No. : ");
    int num = sc.nextInt();
    b.binary(num);
  }
}
