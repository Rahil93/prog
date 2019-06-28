import java.util.Scanner;

public class InsertionSort{

  public static int[] input(int n){
    int[] array = new int[n];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter "+n+" Integer Values....");
    for(int i = 0; i < n; i++){
      array[i] = sc.nextInt();
    }
    return array;
  }

  public static int[] sInsertionSort(int[] array){
    int j, temp;
    for (int i = 1; i < array.length; i++) {
      temp = array[i];
      j = i - 1;
      while (j >=0 && array[j] > temp) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = temp;
    }
    return array;
  }

  public static void output(int[] array){
    System.out.println("Sorted Integer Values Are....");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the No. of Integer to be Sorted : ");
    int n = sc.nextInt();
    int[] array = input(n);
    int[] iSorted = sInsertionSort(array);
    output(iSorted);
  }
}







































/*public class InsertionSort {

  public static int[] sInsertionSort(int[] array) {

		int j;
		int temp;
		for (int i = 1; i < array.length; i++) {
      //System.out.println("Pass "+i);
			temp = array[i];
      //System.out.println("Temp  : " +temp);
			j = i - 1;
      //System.out.println("j : " +j);
      //System.out.println();
			while (j >= 0 && array[j] > temp) {
        //System.out.println("While j : "+j);
				array[j + 1] = array[j];
        //System.out.println("array[j + 1] = "+array[j + 1]);
				j = j - 1;
        //System.out.println("j : "+j);

			}
      //System.out.println();
      //System.out.println("out of while j : "+j);
			array[j + 1] = temp;
      //System.out.println("array[j + 1] = "+array[j + 1]);
		}
    return array;
	}

  public static int[] input(int n){
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[n];
		System.out.println("Enter Integer Values");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
    return array;
  }

  public static void output(int[] array){
    System.out.println("Sorted Integer Values");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
  }

	public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the No. of Integer to be Sort : ");
		int n = scanner.nextInt();
		int[] array = input(n);
		int[] iSorted = sInsertionSort(array);
    output(iSorted);
	}
}
*/
