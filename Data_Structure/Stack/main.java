import java.util.Scanner;
import java.io.File;

public class main{

  public static void main(String[] args) {
    Stack s = new Stack();
    s.stack();
    String s1 = "";
    String data = "";
    try {
      File file = new File("C:\\Users\\DELL\\Desktop\\bridgelabz\\example\\sample.txt");
      Scanner sf = new Scanner(file);
      while (sf.hasNextLine()) {
        s1 = sf.nextLine();
      }
      String[] sarr = s1.split(" ");
      for (int i = 0; i < sarr.length; i++) {
        data = sarr[i];
        s.push(data);
      }
    } catch(Exception e) {
      System.out.println("Error");
    }
    s.display();

    System.out.println(s.isEmpty());

    s.display();

  }
}
