import java.util.Scanner;
public class SumIntegerZero {
	public static int[] arr;
	public static int size, count;

	public static void readArray() {

		System.out.print("Enter size : ");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
	}

	public static int calcDistinct() {
		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				for (int k = j + 1; k < size; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						count++;
					}
				}
			}
		}

		return count;
	}

	 public static void main(String args[]) {

		readArray();
		System.out.println("No of distinct pairs : " + calcDistinct());

	}
}
