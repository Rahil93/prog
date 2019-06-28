public class TimeSort {

  public static <T extends Comparable<T>> void iBubbleSort(T[] array) {
		T temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1].compareTo(array[j]) > 0) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

	}


  public static <T extends Comparable<T>> void sInsertionSort(T[] array) {

		int j;
		T temp;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i - 1;
			while (j >= 0 && temp.compareTo(array[j]) < 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = temp;
		}

	}

  public static int iBinarySearch(Integer[] sArray, int number, int low, int high) {

		int mid = (low + high) / 2;
		if (sArray[mid] < number) {
			return (iBinarySearch(sArray, number, mid, sArray.length));
		}
		if (sArray[mid] > number) {
			return (iBinarySearch(sArray, number, 0, mid));
		}
		if (sArray[mid] == number) {
			return mid;
		}
    else
			return 0;
	}

  public static int sBinarySearch(String[] sArray, String word, int low, int high) {

		int mid = (low + high) / 2;

		if (sArray[mid].compareTo(word) < 0) {
			return (sBinarySearch(sArray, word, mid, sArray.length));
		}
		if (sArray[mid].compareTo(word) > 0) {
			return (sBinarySearch(sArray, word, 0, mid));
		}

		if (sArray[mid].compareTo(word) == 0) {
			return mid;
		} else
			return 0;
	}

  public static <T extends Comparable<T>> void descBubbleSort(T[] array) {

		T temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1].compareTo(array[j]) < 0) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

	}

	public static void main(String args[]) {

		long start;
		long elapsedTime;
		Long timearr[] = new Long[6];
		int j = 0;

		Integer[] array = { 21, 14, 15, 43, 54 };
		String[] sArray = { "abc", "bcdef", "afgddj", "abcdbd", "grda" };

		start = System.nanoTime();
		iBubbleSort(array);
    System.out.println();
		elapsedTime = System.nanoTime() - start;
		System.out.println("Integer bubble sort " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		start = System.nanoTime();
		iBubbleSort(sArray);
    System.out.println();
		elapsedTime = System.nanoTime() - start;
		System.out.println("String bubble sort " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}

		Integer[] nArray = { 21, 14, 15, 43, 54 };
		String[] nsArray = { "abc", "bcdef", "afgddj", "abcdbd", "grda" };

		start = System.nanoTime();
		sInsertionSort(nArray);
    System.out.println();
		elapsedTime = System.nanoTime() - start;
		System.out.println("Integer Insertion sort " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		start = System.nanoTime();
		sInsertionSort(nsArray);
    System.out.println();
		elapsedTime = System.nanoTime() - start;
		System.out.println("String Insertion sort " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		for (int i = 0; i < nArray.length; i++) {
			System.out.println(nArray[i]);
		}
		for (int i = 0; i < nsArray.length; i++) {
			System.out.println(nsArray[i]);
		}

		int ikey = 15;
		String skey = "abc";
		Integer[] barray = { 21, 14, 15, 43, 54 };
		String[] bsArray = { "abc", "bcdef", "afgddj", "abcdbd", "grda" };
		iBubbleSort(barray);
    System.out.println();
		iBubbleSort(bsArray);
    System.out.println();

		start = System.nanoTime();
		System.out.println("number found at index" + iBinarySearch(barray, ikey, 0, array.length));
    System.out.println();
		elapsedTime = System.nanoTime() - start;
		System.out.println("integer binary search " + elapsedTime);
    System.out.println();
		timearr[j] = elapsedTime;
		j++;

		start = System.nanoTime();
		System.out.println("String found at index" + sBinarySearch(bsArray, skey, 0, sArray.length));
    System.out.println();
		elapsedTime = System.nanoTime() - start;
		System.out.println("integer binary search " + elapsedTime);
    System.out.println();
		timearr[j] = elapsedTime;

		descBubbleSort(timearr);
		for (int i = 0; i < timearr.length; i++) {
			System.out.println(timearr[i]);
		}

	}
}
