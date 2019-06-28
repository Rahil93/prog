import java.util.Scanner;

public class Windmill{

  public static void calc(double t, double v){
    if (t < 50 && v < 120 && v > 3) {
      double w = 35.74 + (0.6215 * t) + (((0.4275 * t) - 35.75) * Math.pow(v,0.16));
      System.out.println("Effective temperature for Windmill : "+w);
    }
    else {
      System.out.println("Value Not in Range...");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the temperature : ");
    double t = sc.nextDouble();
    System.out.print("Enter the Wind Speed : ");
    double v = sc.nextDouble();
    calc(t,v);
  }
}
