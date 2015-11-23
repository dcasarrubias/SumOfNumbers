/*
 * Add up all the numbers from 1 to the number entered by the user. For example if the user entered 4 the sum would be 10, 
 * because 4 + 3 + 2 + 1 = 10
 */
import java.util.*;
public class CompSciReview {
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int sum = 1;
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		for(int i = 1; i < number;){
			sum+=number;
			number--;
		}
		System.out.println("Sum is " + sum);
	
	
	
	
	
	}
}
	

