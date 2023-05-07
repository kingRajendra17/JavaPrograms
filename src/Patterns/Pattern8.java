package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter No of Rows : ");
		int row = scan.nextInt();

		for (int i = 1; i <= row; i++) {

			for (int s = 0; s < row - i; s++) {
				System.out.print("  ");
			}

			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();

		}
	}
}
