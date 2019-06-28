import java.util.Scanner;
public class UserNameEnter{
  public static void main(String[] args) {
    String str = "Hello <<UserName>>, How are u?";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Name....");
    String UserName = sc.nextLine();
    str = str.replaceAll("<<UserName>>", UserName);
    if(UserName.length() > 3){
      System.out.println(str);
    }
    else {
      System.out.println("Error");
    }
  }
}
