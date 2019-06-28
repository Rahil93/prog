import java.util.Scanner;

public class Distance{

  public static void calc(double x,double y){
    double sqrt = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    System.out.println(sqrt);
  }

  public static void main(String[] args) {
    double x = Integer.parseInt(args[0]);
    double y = Integer.parseInt(args[1]);
    calc(x,y);
  }
}
