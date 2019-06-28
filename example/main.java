import java.util.Scanner;
import java.io.*;

public class main{

  public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      String s = "";
      try {
        File file = new File("C:\\Users\\DELL\\Desktop\\bridgelabz\\example\\sample.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
          s = sc.nextLine();
        }
        System.out.println(s);
        String[] splt = s.split("");
        for (int i = 0; i < splt.length; i++) {
          System.out.println(splt[i]);
        }
      } catch(Exception e) {
        System.out.println("Not Found");
      }

  }
}
