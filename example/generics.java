import java.util.Scanner;

public class generics {

  public static <T extends Comparable<T>> void bubbleSort(T[] arr){
    T temp;
    int n = arr.length - 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        if (arr[j].compareTo(arr[j + 1]) > 0) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    display(arr);
  }

  public static void iarray(int size){
    Scanner sc  = new Scanner(System.in);
    Integer[] iarr = new Integer[size];
    System.out.println("Enter Integer No.");
    for (int i = 0; i < iarr.length; i++) {
      iarr[i] = sc.nextInt();
    }
    System.out.print("Sorted Integer Are : ");
    bubbleSort(iarr);
  }

  public static void darray(int size){
    Scanner sc  = new Scanner(System.in);
    Double[] iarr = new Double[size];
    System.out.println("Enter Double Integer No.");
    for (int i = 0; i < iarr.length; i++) {
      iarr[i] = sc.nextDouble();
    }
    System.out.print("Sorted Double Integer Are : ");
    bubbleSort(iarr);
  }

  public static void sarray(int size){
    Scanner sc  = new Scanner(System.in);
    String[] iarr = new String[size];
    System.out.println("Enter String");
    for (int i = 0; i < iarr.length; i++) {
      iarr[i] = sc.nextLine();
    }
    System.out.print("Sorted String Are : ");
    bubbleSort(iarr);
  }

  public static void charray(int size){
    Scanner sc  = new Scanner(System.in);
    Character[] iarr = new Character[size];
    System.out.println("Enter Character");
    for (int i = 0; i < iarr.length; i++) {
      iarr[i] = sc.next().charAt(0);
    }
    System.out.print("Sorted Characters Are : ");
    bubbleSort(iarr);
  }



  public static <T> display(T[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter size of Array : ");
    int size = sc.nextInt();
    iarray(size);
    System.out.println();
    darray(size);
    System.out.println();
    sarray(size);
    System.out.println();
    charray(size);
  }
}
