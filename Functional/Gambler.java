import java.util.Scanner;

public class Gambler{

  public static void simulateTrial(int stake, int goal, int trail){
    int win = 0;
    int bet = 0;
    for (int i = 0; i < trail; i++) {
      int cash = stake;
      while (cash > 0 && cash < goal) {
        bet++;
        if (Math.random() > 0.5) {
          cash++;
        }
        else {
          cash--;
        }
      }
      if (cash == goal) {
        win++;
      }
    }
    float percent = 100 * win / trail;
    System.out.println("No of bets made : "+bet);
    System.out.println(win+" out of "+trail);
    System.out.println("Percent of win : "+percent +" %");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Stake of the Gambler : ");
    int stake = sc.nextInt();
    System.out.print("Enter the Goal of the Gambler : ");
    int goal = sc.nextInt();
    System.out.print("Enter No. of Trails : ");
    int trail = sc.nextInt();
    simulateTrial(stake,goal,trail);
  }
}
