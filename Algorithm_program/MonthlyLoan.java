import java.util.Scanner;

public class MonthlyLoan{

  public static void calculatePayment(int P, int Y , double R){
    int n = Y * 12;
    double r = R / 12 / 100;

    double payment = (P * r) / (1 - Math.pow(1 + r,-n));
    System.out.println("Monthly Payment : "+payment);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Amount of Loan Borrowed : ");
    int amt = sc.nextInt();
    System.out.print("Enter the No. of Year of the Loan : ");
    int yr = sc.nextInt();
    System.out.print("Enter the Monthly Interest : ");
    double r = sc.nextDouble();
    calculatePayment(amt,yr,r);
  }
}







































/*public class MonthlyLoan {

  public static double calculatePayment(double P, float Y, float R) {

		float n = Y * 12;
		double r = R / 12 / 100;

		// apply formula
		double payment = (P * r) / (1 - Math.pow(1 + r, -n));
    double payment1 = (P * (Math.pow(1 + r,n)) * r) / (Math.pow(1 + r,n) - 1);
    System.out.println("Payment : "+payment);
    System.out.println("Payment1 : "+payment1);


		return payment;
    //return payment1;
	}

	public static void main(String args[]) {

		double Principal = Double.parseDouble(args[0]);
		float Year = Float.parseFloat(args[1]);
		float Rate = Float.parseFloat(args[2]);

		System.out.println(calculatePayment(Principal, Year, Rate));
	}
}
*/
