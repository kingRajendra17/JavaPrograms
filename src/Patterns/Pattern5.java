package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter No of Rows : ");
		int row = scan.nextInt();

		// Number of Rows
		for (int i = 1; i <= row; i++) {

			// For Every Row, Run the Column
			for (int j = 1; j <= row - i + 1; j++) {

				// What to Print
				System.out.print(row - i + 1 + " ");
			}

			// When we printed One Row, Print another row on NextLine
			System.out.println();
		}
	}
}

