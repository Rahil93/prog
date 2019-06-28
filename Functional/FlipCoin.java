import java.util.Scanner;

public class FlipCoin{

  public void countFlip(int total){
    int heads= 0;
    int tails= 0;

    for(int i = 0; i < total; i++){
       if(Math.random() < 0.5){
         heads++;
       }else{
         tails++;
       }
    }
    calcPercentage(heads, tails, total);
  }
  public void calcPercentage(int head, int tail, int total){
      int headPercentage = 100 * head/total;
      int tailPercentage = 100 * tail/total;
      System.out.println("Percentage of Heads Flips : " +headPercentage);
      System.out.println("Percentage of Tails Flips : " +tailPercentage);
  }
  public static void main(String[] args) {
      FlipCoin flp = new FlipCoin();
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the No. Coin to be Flip : ");
      int num = sc.nextInt();
      flp.countFlip(num);
  }
}
