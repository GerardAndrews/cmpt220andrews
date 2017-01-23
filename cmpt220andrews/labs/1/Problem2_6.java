//Gerard Andrews
//1/22/2017
//Lab1, Part 1, Problem 4
import java.util.Scanner;

public class Problem2_6{
	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  
	  System.out.println("Enter a number between 0 and 1000: ");
	  int integer = input.nextInt();
	  
	  int digitOne = integer % 10;
	  int extractOne = integer / 10;
	  
	  int digitTwo = extractOne % 10;
	  int extractTwo = extractOne / 10;
	  
	  int digitThree = extractTwo % 10;
	  int extractThree = extractTwo / 10;
	  
	  int digitFour = extractThree % 10;
	  
	  int sum = digitOne + digitTwo + digitThree + digitFour;
	  
	  System.out.println("The sum of the digits is: " + sum + ".");

	}
}