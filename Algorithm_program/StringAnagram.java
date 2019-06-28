import java.util.Scanner;

public class StringAnagram{

  public static void checkAnagram(String firstString,String secondString){
    if(isAnagram(firstString,secondString))
    {
      System.out.println("String is Anagram");
    }
    else{
      System.out.println("String is not an Anagram");
    }
  }

  public static boolean isAnagram(String firString, String secString){
    String tempString1 = firString;
    String tempString2 = secString;
    firString = tempString1.toLowerCase();
    secString = tempString2.toLowerCase();

    char[] firArray = firString.toCharArray();
    char[] secArray = secString.toCharArray();

    int[] firAscii = new int[firArray.length + 1];
    int[] secAscii = new int[secArray.length + 1];
    int count = 0;

    if(firArray.length != secArray.length){
      return false;
    }

    firAscii = convert(firArray,firAscii);
    secAscii = convert(secArray,secAscii);

    firAscii = sort(firAscii);
    secAscii = sort(secAscii);

    for (int i = 0; i < firAscii.length; i++) {
      if(firAscii[i] == secAscii[i]){
        count++;
      }
    }
    return count == firAscii.length;
  }

  public static int[] convert(char[] array, int[] ascii){
    for (int i = 0; i < array.length; i++) {
      ascii[i] = (int) array[i];
      //System.out.println("asc : "+ascii[i]);

    }
    return ascii;
  }

  public static int[] sort(int[] array){
    int temp;
    int n = array.length - 1;
    for(int i = 0; i < n; i++){
      for (int j = 0; j < n - i; j++) {
        if(array[j] > array[j + 1]){
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    return array;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String 1 : ");
    String fststr = sc.nextLine();
    System.out.print("Enter String 2 : ");
    String scdstr = sc.nextLine();
    checkAnagram(fststr,scdstr);

  }
}
















































/*public class StringAnagram {

  public static boolean isAnagram(String firString, String secString) {

    String tempString1 = firString;
    String tempString2 = secString;
    firString = tempString1.toLowerCase();
    secString = tempString2.toLowerCase();


    // String to character Array
    char[] firArray = firString.toCharArray();
    char[] secArray = secString.toCharArray();
    for (int i = 0; i < firArray.length; i++) {
      System.out.println("fa : " +firArray[i]);
    }
    for (int i = 0; i < secArray.length; i++) {
      System.out.println("sc : " +secArray[i]);

    }
    System.out.println(firArray.length);
    System.out.println(secArray.length);

    int firAscii[] = new int[firArray.length + 1];
    int secAscii[] = new int[secArray.length + 1];

    if (firArray.length != secArray.length) {
      return false;
    }

    int count = 0;

    // character array to ascii value array
    firAscii = convert(firArray, firAscii);
    secAscii = convert(secArray, secAscii);

    // sort the array
    firAscii = sort(firAscii);
    secAscii = sort(secAscii);

    for (int i = 0; i < firAscii.length; i++) {
      if (firAscii[i] == secAscii[i]) {
        count++;
      }
    }
    return count == firAscii.length;

  }

    public static int[] convert(char firArray[], int firAscii[]) {
  		for (int i = 0; i < firArray.length; i++) {

  			firAscii[i] = (int) firArray[i];
        //System.out.println("asc : "+firAscii[i]);
  		}
  		return firAscii;


  	}

    public static int[] sort(int firAscii[]) {
  		int temp = 0;
  		for (int i = 0; i < firAscii.length; i++) {
  			for (int j = 1; j < (firAscii.length - i); j++) {
  				if (firAscii[j - 1] > firAscii[j]) {

  					temp = firAscii[j - 1];
  					firAscii[j - 1] = firAscii[j];
  					firAscii[j] = temp;
  				}
  			}

  		}
  		return firAscii;
  	}

	public static void main(String args[]) {

		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter String 1 : ");
		String string1 = scanner.nextLine();
	  System.out.print("Enter String 2 : ");
		String string2 = scanner.nextLine();

		if(isAnagram(string1, string2)) {
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not anagram");
		}
	}
}
*/
