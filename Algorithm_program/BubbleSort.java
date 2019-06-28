import java.util.Scanner;

public class BubbleSort{

	public static int[] input(int n){
			Scanner sc = new Scanner(System.in);
			int[] arr = new int[n];
			System.out.println("Enter "+n+" Integer Values......");
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
			}
			return arr;
	}

	public static int[] iBubbleSort(int[] arr){
		int n = arr.length - 1;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static void output(int[] arr){
		System.out.println("Sorted Integer Values Are....");
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No. of Integer to be Sort : ");
		int n = sc.nextInt();
		int[] array = input(n);
		int[] sorted = iBubbleSort(array);
		output(sorted);
	}
}
