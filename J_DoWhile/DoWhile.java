package J_DoWhile;

import java.util.Scanner;

public class DoWhile {

	// Example 1
	public static void main(String[] args) {

		int i = 1;
		// do something.
		do {
			System.out.println(i);
			i++;
		// if i = 10, "do" will stop.
		} while (i <= 10);
	}
	
	// Example 2
	public static void example() {
		
	    do{  
	        //code to be executed  
	    } while(true);  
	}
	
	// Example 3
	public static void exampleTwo() {
        
		int[] arr ={2,11,45,9};
        //i starts with 0 as array index starts with 0
        int i=0;
        
        do{
             System.out.println(arr[i]);
             i++;
        } while(i < 4);
	}
	
	// Example 4
	public static void exampleThree() {
		
	      Double number, sum = 0.0;
	      Scanner input = new Scanner(System.in);

	      do {
	    	 System.out.print("Enter a number: ");
	    	 number = input.nextDouble();
	    	 sum += number;
	      } while (number != 0.0);
		   
	      System.out.println("Sum = " + sum);
	}
}
