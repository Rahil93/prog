import java.util.Scanner;

public class VendingMachine {

  public static void noteCheck(int[] notesNo, int change, int pos) {

		int[] noteList = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		int tempchange = change;
		int temppos = pos;
		if (temppos < noteList.length) {
			if (tempchange < noteList[temppos]) {
				temppos++;
        //System.out.println(noteList[temppos] +" "+notesNo[temppos]);
				noteCheck(notesNo, tempchange, temppos);

			} else {
				tempchange = tempchange - noteList[temppos];
        // System.out.println("temppos : " +temppos);

				notesNo[temppos]++;
        // System.out.println(noteList[temppos] +" "+notesNo[temppos]);

				noteCheck(notesNo, tempchange, temppos);
			}
		}

	}

	public static void main(String args[]) {
		int change;
		int sum = 0;
		int[] arrayNoOfNotes = new int[8];

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the change");
		change = scanner.nextInt();

		noteCheck(arrayNoOfNotes, change, 0);

		// for (int i = 0; i < arrayNoOfNotes.length; i++) {
    //   //System.out.println(arrayNoOfNotes[i]);
    //
		// 	sum = sum + arrayNoOfNotes[i];
    //   System.out.println(sum+ " " + arrayNoOfNotes[i]);
		// }

		System.out.println("1000 notes " + arrayNoOfNotes[0]);
		System.out.println("500 notes " + arrayNoOfNotes[1]);
		System.out.println("100 notes " + arrayNoOfNotes[2]);
		System.out.println("50 notes " + arrayNoOfNotes[3]);
		System.out.println("10 notes " + arrayNoOfNotes[4]);
		System.out.println("2 notes " + arrayNoOfNotes[5]);
		System.out.println("5 notes " + arrayNoOfNotes[6]);
		System.out.println("1 notes " + arrayNoOfNotes[7]);
	}

}
