public class numberPattern{
  public static void numpattn1(){
    System.out.println();
    System.out.println("***Number Pattern 1***");
    System.out.println();

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static void numpattn2(){
    System.out.println();
    System.out.println("***Number Pattern 2***");
    System.out.println();

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void numpattn3(){
    System.out.println();
    System.out.println("***Number Pattern 3***");
    System.out.println();
    int num = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num++ +" ");
      }
      System.out.println();
    }
  }

  public static void numpattn4(){
    System.out.println();
    System.out.println("***Number Pattern 4***");
    System.out.println();
    for (int i = 1; i <= 5; i++) {

      for (int j = i; j >= 1; j--) {
        System.out.print(j+ " ");
      }
      System.out.println();

    }
  }

  public static void numpattn5(){
    System.out.println();
    System.out.println("***Number Pattern 5***");
    System.out.println();
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j+ " ");
      }
      for (int k = i - 1; k >= 1; k--) {
        System.out.print(k+ " ");
      }
      System.out.println();
    }
  }

  public static void numpattn6(){
    System.out.println();
    System.out.println("***Number Pattern 6***");
    System.out.println();
    for (int i = 1; i <= 5; i++) {

      for (int j = 5; j >= i; j--) {
        System.out.print(j+ " ");
      }
      System.out.println();

    }
  }

  public static void numpattn7(){
    System.out.println();
    System.out.println("***Number Pattern 7***");
    System.out.println();
    for (int i = 1; i <= 5; i++) {
      int num = i;
      for (int j = 1; j <= i; j++) {
        System.out.print(num+" ");
        num = num + 5 - j;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    // strpattn1();
    // strpattn2();
    numpattn1();
    numpattn2();
    numpattn3();
    numpattn4();
    numpattn5();
    numpattn6();
    numpattn7();
  }
}
