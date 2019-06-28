import java.util.Scanner;

public class Harmonic{
  public static void harmonicNumber(double nharmonic){
    double mharmonic = nharmonic;
    double result = 0;
    System.out.println("Harmonic Series of "+Math.round(mharmonic)+" are.....");
    for (int i = 1; i <= mharmonic ; i++ ) {
      result += (1.0/i);
      if (i == mharmonic) {
        System.out.print("1/"+i);
      }
      else if (i == 1) {
        System.out.print(i+" + ");
      }
      else {
        System.out.print("1/"+i+" + ");
      }
    }
    System.out.print(" = "+result);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Harmonic No. : ");
    double num = sc.nextDouble();
    harmonicNumber(num);
  }
}
