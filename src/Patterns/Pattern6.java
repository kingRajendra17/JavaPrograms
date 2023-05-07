package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter No of Rows : ");
		int row = scan.nextInt();

		// Number of Rows
		for (int i = 0; i < row * 2 ; i++) {
		
         int a = i > row ? 2 * row - i : i;        // Tenary Operation Checks if i > row 
			// For Every Row, Run the Column
			for (int j = 0; j < a; j++) {

				// What to Print
				System.out.print("* ");
			}

			// When we printed One Row5, Print another row on NextLine
			System.out.println();
		}
	}
}

