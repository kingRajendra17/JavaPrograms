package JavaProblems;

import java.util.*;

public class PrimeNumber {
	
	public static void main(String [] args) {
		
		// Prime Number Eligibility 
		// Number > 1
		// Divide by 1 or itself == 0
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");	
		int num = sc.nextInt();
		
		int count = 0;
		
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i ==0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Prime Number");	
			}
			else {
				System.out.println("Not a Prime Number");	
			}
		}
		else {
			System.out.println("Not a Prime Number");	
		}
}
}