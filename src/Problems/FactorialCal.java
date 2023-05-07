package Problems;

import java.util.*;

public class FactorialCal {
    
       int calFactorial(int n) {   // Method calFactorial that takes an integer argument n and calculates the factorial of n using recursion.
    	
        class Factorial {         // Factorial class is a nested class inside calFactorial that defines the recursive fact method to calculate the factorial.
            int fact(int num) {
                if(num == 0) {
                    return 1;
                } else {
                    return num * fact(num-1);
                }
            }
        }
        
        Factorial factorial = new Factorial();
        return factorial.fact(n);
    }
    
    public static void main(String[] args) {
    	
        FactorialCal cal = new FactorialCal();  //  instance of FactorialCal
        
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int factorial = cal.calFactorial(num);  //  calFactorial method on the cal instance with the argument num and assigns the result to the variable factorial
        
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}

