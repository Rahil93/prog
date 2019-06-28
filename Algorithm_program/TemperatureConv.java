import java.util.Scanner;

public class TemperatureConv{
  public static void temperatureConversion(double fahrenheit ,double celsius){
    double fahr = (celsius * 9 / 5) + 32;
    double cels = (fahrenheit - 32) * 5 / 9;
    System.out.println("Fahrenheit : " +fahr);
    System.out.println("Celsius : " +cels);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Fahrenheit : ");
    double fahrenheit = sc.nextDouble();
    System.out.print("Enter Celsius :" );
    double celsius = sc.nextDouble();
    temperatureConversion(fahrenheit,celsius);
  }
}
































/*public class TemperatureConv {

  public static void temperatureConversion(double celsius, double fahrenheit) {

		double fahr = (celsius * 9 / 5) + 32;
		double cels = (fahrenheit - 32) * 5 / 9;

		System.out.println(fahr + " F  " + cels + "  C");
	}

	public static void main(String args[]) {
  		double celsius=Double.parseDouble(args[0]);
      double fahrenheit=Double.parseDouble(args[1]);
  		temperatureConversion(celsius,fahrenheit);
	}
}
*/
