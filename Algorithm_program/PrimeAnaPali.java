public class PrimeAnaPali{

  public static boolean checkPrime(int number){
    if(number < 2){
      return false;
    }
    for (int i = 2; i * i <= number; i++) {
      if(number % i == 0){
        return false;
      }
    }
    return true;
  }

  public static boolean checkPalindrome(int number){
    int checknumber = number;
    int originalnumber = number;
    int tempno = 0;
    while(checknumber != 0){
      tempno = tempno * 10 + (checknumber % 10);
      checknumber = checknumber / 10;
    }
    return originalnumber == tempno;
  }

  public static boolean checkAnagram(int number1, int number2){
    int count1 = numberCount(number1);
    int count2 = numberCount(number2);
    int count = 0;

    if (count1 != count2) {
      return false;
    }

    int[] arr1 = new int[count1];
    int[] arr2 = new int[count2];

    convertIntArray(arr1,number1);
    convertIntArray(arr2,number2);

    arr1 = sortInt(arr1);
    arr2 = sortInt(arr2);

    for (int i = 0; i < arr1.length ; i++) {
      if (arr1[i] == arr2[i]) {
        count++;
      }
    }
    return count == arr1.length;
  }

  public static int numberCount(int number){
    int count = 0;
    int tempno = number;
    while(tempno != 0){
      tempno = tempno / 10;
      count++;
    }
    return count;
  }

  public static void convertIntArray(int[] array,int number){
    int i = 0;
    int tempno = number;
    while(tempno != 0){
      array[i] = tempno % 10;
      tempno /= 10;
      i++;
    }
  }

  public static int[] sortInt(int[] array){
    int n = array.length - 1;
    int temp;
    for (int i = 0; i < n; i++) {
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

  public static void prmPalindrome(){
    System.out.println("Palindrome For Prime No. Are....");
    for (int i = 10; i < 1000; i++) {
      if(checkPrime(i) && checkPalindrome(i)){
          System.out.println(i);
      }
    }
  }

  public static void prmAnagram(){
    System.out.println("Anagram For Prime No. Are.....");
    for (int i = 10; i < 1000; i++) {
      for (int j = i + 1; j < 1000; j++) {
        if ((checkPrime(i) && checkPrime(j) && checkAnagram(i,j))) {
          System.out.println(i+" "+j);
        }
      }
    }
  }

  public static void main(String args[]) {
    prmPalindrome();
    prmAnagram();
  }
}
