import java.util.Scanner;
import java.io.File;

public class main{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Deque d = new Deque();
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
        // System.out.println(data);
        System.out.println("1.Add from Front..");
        System.out.println("2.Add from Rear..");
        System.out.print("Choose : ");
        int ch = sc.nextInt();
        if(ch == 1){
          d.addFront(data);
        }
        else if (ch == 2) {
          d.addRear(data);
        }
        else {
            System.out.println("Please re-enter value..");
        }
      }
    } catch(Exception e) {
      System.out.println("Error");
    }
    d.display();
    // System.out.println(d.removeFront());
    // System.out.println(d.removeRear());
    System.out.println(d.isEmpty());
    d.display();
  }
}
