import java.util.Scanner;

public class StopWatch{

  public static void main(String[] args) {
    long startTime = System.nanoTime();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of a : ");
    int a = sc.nextInt();
    System.out.print("Enter value  of b : ");
    int b = sc.nextInt();
    int c = a + b;
    System.out.println("Add "+a+" + "+b+" = "+c);
    long endTime = System.nanoTime();
    double timeElapsed = (endTime - startTime) / 1000000000.0;
    System.out.println("Time Elapsed : "+timeElapsed);
  }
}
