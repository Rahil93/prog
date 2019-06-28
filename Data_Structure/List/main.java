import java.util.Scanner;
import java.io.File;
import packages.LinkedList;

public class main{

  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    LinkedList l = new LinkedList();
    l.list();
    String s = "";
    String data = "";
    try {
      File file = new File("C:\\Users\\DELL\\Desktop\\bridgelabz\\example\\sample.txt");
      Scanner sc = new Scanner(file);
      while (sc.hasNextLine()) {
        s = sc.nextLine();
      }
      // ?System.out.println(s);
      String[] splt = s.split(" ");
      for (int i = 0; i < splt.length; i++) {
        // System.out.println(splt[i]);
        data = splt[i];
        l.insert(data);
      }
    } catch(Exception e) {
      System.out.println("Not Found");
    }
    l.display();
    // System.out.print("Enter String : ");
    // String s1 = sc1.nextLine();
    // System.out.print("Enter position : ");
    // int pos = sc1.nextInt();
    // l.insertAt(s1,pos);
    // System.out.println(l.index(s1));
    // l.add(s1);
    // l.remove(s1);
    // System.out.println(l.search(s1));
    // l.search(s1);
    // String rs = l.deleteAt(pos);
    // System.out.println(rs);
    // System.out.println(l.length());
    // l.sort();
    System.out.println(l.isEmpty());
    l.display();

  }
}
