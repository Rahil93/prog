public class PrimeRange {

  public static boolean checkPrime(int number) {

		// condition to check if no less than two
		if (number < 2) {
			return false;
		}

		// for loop to for checkin prime no
		for (int factor = 2; factor * factor <= number; factor++) {
			// if factor divides evenly into n, n is not prime, so break out of
			// loop
			if (number % factor == 0) {
				return false;

			}
		} // End of for loop
		return true;
	}

  public static void prime(){
    System.out.println("Prime No. From 1 - 100 Are......");
    for (int i = 0; i < 1000; i++) {
			if (checkPrime(i)) {
				System.out.println(i);
			}
		}
  }

	public static void main(String args[]) {
    prime();
	}
}
