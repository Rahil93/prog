import java.util.Scanner;
import java.lang.*;

public class BinarySwap{

  public static String binary(int num){
    int rem;
    String bin[] = {"0","1"};
    String binary = "";
    int padding = 0;
    int tempnumber = num;
    while (tempnumber > 0 || padding % 8 !=0) {
      rem = tempnumber % 2;
      binary = bin[rem] + binary;
      tempnumber /= 2;
      padding++;
      if (padding % 4 == 0 && tempnumber !=0) {
        binary = " " + binary;
      }
      else if (padding % 4 == 0) {
        binary = " " + binary;
      }
    }
    System.out.println("Conversion of Decimal No. "+num+" :"+binary);
    return binary;
  }

  public static String binarySwap(String num){
    String tempbinary = num;
    tempbinary = tempbinary.replaceAll(" ","");
    String lowerNibble = tempbinary.substring(0,4);
    String upperNibble = tempbinary.substring(4,8);
    String swappedtempbinary = upperNibble + " " + lowerNibble;
    System.out.println("Binary Swapped of "+num+" : "+swappedtempbinary);
    return swappedtempbinary;
  }

  public static void binaryToDecimal(String binary){
    int power = 0;
    int decimal = 0;
    binary = binary.replaceAll(" ", "");
    int index = binary.length() - 1;
    while(index >=0){
      decimal = decimal + (int) (Integer.parseInt(binary.charAt(index) + "") * Math.pow(2,power)) ;
      power++;
      index--;
    }
    System.out.println("Conversion of "+binary+" : "+decimal);
  }



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Decimal No. : ");
    int num = sc.nextInt();
    String sbinary = binary(num);
    String swapped = binarySwap(sbinary);
    binaryToDecimal(swapped);
  }
}










































/*public class BinarySwap {

  public static String binarySwap(String binary) {
		String tempbinary = binary;
		tempbinary = tempbinary.replaceAll(" ", "");
		String lowerNibble = tempbinary.substring(0, 4);
		String upperNibble = tempbinary.substring(4, 8);
		String swappedtempbinary = upperNibble + " " +lowerNibble;
    System.out.println("Binary Swapped of "+binary+" : "+swappedtempbinary);
    return swappedtempbinary;
	}

  public static void binaryToDecimal(String binary) {
		int decimal = 0;
		int power = 0;
		binary = binary.replaceAll(" ", "");
		int index = binary.length() - 1;
		while (index >= 0) {
			decimal = decimal + (int) (Integer.parseInt(binary.charAt(index) + "") * Math.pow(2, power));
      //System.out.println(decimal);
			power++;
			index--;
		}
    System.out.println("Decimal Conversion of "+binary+" : "+decimal);
    //return decimal;
	}

  public static String binary(int num){
    int rem;
    String bin[] = {"0","1"};
    String binary = "";
    int tempnumber = num;
    int padding = 0;
    while (tempnumber > 0 || padding % 8 != 0) {
      rem = tempnumber % 2;
      binary = bin[rem] + binary;
      tempnumber /= 2;
      padding++;
      if (padding % 4 == 0 && tempnumber != 0) {
        binary = " " + binary;
      }
      else if (padding % 4 == 0) {
        binary = " " + binary;
      }
    }
    System.out.println("Binary Conversion of "+num+" :"+binary);
    return binary;
  }

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
    System.out.print("Enter Decimal No. : ");
    int num = sc.nextInt();
    String sbinary = binary(num);
		//System.out.println(sbinary);
		String swapped =  binarySwap(sbinary);
		//System.out.println(swapped);
		binaryToDecimal(swapped);
	}
}
*/
