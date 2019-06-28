import java.util.Scanner;

public class MergeSort{

  public static int[] input(int n){
    int[] array = new int[n];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter "+n+" Integer Value...");
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }
    return array;
  }

  public static int[] mergeSort(int[] array,int start,int end){
    int mid = (start + end)/2;
    if (start < end){
      mergeSort(array,start,mid);
      mergeSort(array,mid + 1,end);
      merge(array,start,mid,end);
    }
    return array;
  }

  public static int[] merge(int[] array,int start,int mid,int end){
    int i = start;
    int j = mid + 1;
    int[] temparr = new int[end - start + 1 ];
    int k = 0;
    for (int l = start; l <= end; l++) {
      if (i > mid) {
        temparr[k++] = array[j++];
      }
      else if (j > end) {
        temparr[k++] = array[i++];
      }
      else if (array[i] > array[j]) {
        temparr[k++] = array[j++];
      }
      else {
        temparr[k++] = array[i++];
      }
    }
    for (int l = 0; l < k; l++) {
      array[start++] = temparr[l];
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
    System.out.print("Enter No. of Integer Value to be Sorted : ");
    int n = sc.nextInt();
    int[] array = input(n);
    int[] sortarr = mergeSort(array,0,n-1);
    output(sortarr);
  }
}






































/*public class MergeSort {

  public static void mergeSort(int[] array, int start, int end) {
    System.out.print("Array : ");
    for (int i = start; i <= end; i++) {
      System.out.print(array[i]+" ");

    }
    System.out.println("Start : "+start+" End : "+end);
    System.out.println();
		int mid = (start + end) / 2;
    System.out.println("Start :" +start);
    System.out.println("Mid :" +mid);
    System.out.println("End :" +end);
    System.out.println();


		if (start < end) {
      System.out.println("End :" +end);

      System.out.println("Pass 1");
      System.out.print("Array : ");
      for (int i = start; i <= mid; i++) {
  			System.out.print(array[i]+" ");
  		}
      System.out.println("Start : "+start+" Mid : "+mid);
      System.out.println();

			mergeSort(array, start, mid);

      System.out.println("Pass 2");
      System.out.print("Array : ");
      for (int i = mid; i <= end; i++) {
  			System.out.print(array[i]+" ");
  		}
      System.out.println("Start : "+start+" End : "+end+" Mid : "+mid);
      System.out.println();

			mergeSort(array, mid + 1, end);

      System.out.println("Pass 3");
      System.out.print("Array : ");
      for (int i = mid; i <= end; i++) {
  			System.out.print(array[i]+" ");
  		}
      System.out.println("Start : "+start+" End : "+end+" Mid : "+mid);
      System.out.println();

			merge(array, start, mid, end);

      System.out.println("Pass 4");
      System.out.print("Array : ");
      for (int i = start; i <= end; i++) {
  			System.out.print(array[i]+" ");
  		}
      System.out.println("Start : "+start+" End : "+end+" Mid : "+mid);
      System.out.println();
		}
	}

  public static void merge(int[] array, int start, int mid, int end) {

    for (int i = start; i <= end; i++) {
      System.out.print(array[i]);
    }

		int p = start;
		int q = mid + 1;
		int[] tArray = new int[end - start + 1];
		int k = 0;

		for (int i = start; i <= end; i++) {

			if (p > mid) {
				tArray[k++] = array[q++];
			}

			else if (q > end) {
				tArray[k++] = array[p++];
			}

			else if (array[p] < array[q]) {

				tArray[k++] = array[p++];

			} else {
				tArray[k++] = array[q++];
			}
		}

		for (int i = 0; i < k; i++) {
			array[start++] = tArray[i];

		}
	}

	public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the No. of Integer to be Sorted : ");
    int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println(array.length);
    System.out.println("Enter "+n+" Integer Values....");

		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();

    mergeSort(array, 0, array.length - 1);

    System.out.println("Sorted Integer Values Are....");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
*/
