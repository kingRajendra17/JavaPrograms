package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter No of Rows : ");
		int row = scan.nextInt();

		// Number of Rows
		for (int i = 1; i <= row; i++) {

			// For Every Row, Run the Column
			for (int j = 1; j <= i; j++) {

				// What to Print
				System.out.print(i + " ");
			}

			// When we printed One Row, Print another row on NextLine
			System.out.println();
		}
	}
}

