import java.util.Scanner;

public class Factors{
	public void factor(int number){
		int tempnumber = number;

		for(int factor = 2; factor * factor <= tempnumber; factor++){

			while(tempnumber % factor == 0){
				tempnumber = tempnumber / factor;
				if(tempnumber == 1){
					System.out.print(factor);
				}else{
					System.out.print(factor+ " x ");
				}
			}
		}
		if(tempnumber > 1){
				System.out.println(tempnumber);
		}
	}

	public static void main(String[] args)
	{
		Factors f = new Factors();
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to Factorized : ");
		num = sc.nextInt();
		System.out.print("The Prime Factorization of " + num + " is :");
		f.factor(num);
	}
}
