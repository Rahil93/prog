public class starPattern{
  public static void strpattn1(){
    System.out.println("***Star Pattern 1***");
    System.out.println();

    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void strpattn2(){
    System.out.println();
    System.out.println("***Star Pattern 2***");
    System.out.println();
    for (int i = 1; i <= 4; i++) {
      for (int j = 4; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void strpattn3(){
    System.out.println();
    System.out.println("***Star Pattern 3***");
    System.out.println();
    for (int i = 1; i <=5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i <=5; i++) {
      for (int k = 4; k >= i; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void strpattn4(){
    System.out.println();
    System.out.println("***Star Pattern 4***");
    System.out.println();
    for (int i = 1; i <= 4; i++) {
      for (int j = 3; j >= i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void strpattn5(){
    System.out.println();
    System.out.println("***Star Pattern 5***");
    System.out.println();
    for (int i = 1; i <= 4; i++) {
      for (int k = 1; k <= i; k++) {
        System.out.print(" ");
      }
      for (int j = 4; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void strpattn6(){
    System.out.println();
    System.out.println("***Star Pattern 6***");
    System.out.println();
    for (int i = 1; i <= 5; i++) {
      for (int j = 4; j >= i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
  }

  for (int i = 1; i <= 4; i++) {
    for (int k = 1; k <= i; k++) {
      System.out.print(" ");
    }
    for (int j = 4; j >= i; j--) {
      System.out.print("*");
    }
    System.out.println();
  }

}

  public static void main(String[] args) {
    strpattn1();
    strpattn2();
    strpattn3();
    strpattn4();
    strpattn5();
    strpattn6();
  }
}
