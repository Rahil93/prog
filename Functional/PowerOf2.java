public class PowerOf2{
	public static void findPower(int number){
    if (number >= 0 && number < 31) {
      for (int i = 0; i <= number ;i++ ) {
  			System.out.println(Math.round(Math.pow(2,i)));
  		}
    }
    else {
      System.out.println("No. should be larger than or equal to 0 & smaller tham 31");
    }
	}
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		findPower(num);
	}
}
