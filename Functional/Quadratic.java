import java.util.Scanner;

public class Quadratic{

  public static void calc(int a, int  b, int c){
    double root1;
    double root2;
    double d;

    d = (b * b) - (4 * a * c);

    if (d > 0) {
      System.out.println("Roots are real & unequal");
      root1 = (-b + Math.sqrt(d)) / (2 * a);
      root2 = (-b - Math.sqrt(d)) / (2 * a);
      System.out.println("First root is : "+root1);
      System.out.println("Second root is : "+root2);
    }
    else if (d == 0) {
      System.out.println("Roots are real & equal");
      root1 = (-b + Math.sqrt(d)) / (2 * a);
      System.out.println("Root are : "+root1);
    }
    else {
      System.out.println("Roots are Imaginary");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of a : ");
    int a = sc.nextInt();
    System.out.print("Enter value of b : ");
    int b = sc.nextInt();
    System.out.print("Enter value of c : ");
    int c = sc.nextInt();

    if (a == 0) {
      System.out.println("Value of a Should not  be  Zero...");
    }
    else{
      calc(a,b,c);
    }

  }
}
