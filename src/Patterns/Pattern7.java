package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter No of Rows : ");
		int row = scan.nextInt();

		// Number of Rows
		for (int i = 0; i < row * 2 ; i++) {
			
			// Tenary Operation Checks if i > row 
		    int a = i > row ? 2 * row - i : i; 
		    
		    int space = row - a;
		    for (int s = 0;s < space; s++) {
		    	System.out.print(" ");
		    }
         
         
			// For Every Row, Run the Column
			for (int j = 0; j < a; j++) {

				// What to Print 
				System.out.print(j);
			}

			// When we printed One Row5, Print another row on NextLine
			System.out.println();
		}
	}
}

