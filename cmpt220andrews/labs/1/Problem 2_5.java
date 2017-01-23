//Gerard Andrews
//1/22/2017
//Lab1, Part 1, Problem 3
import java.util.Scanner

public class Problem2_5{
	public static void main(String[] args) {
      java.util.Scanner input = new java.util.Scanner(System.in);
	  System.out.println("Enter the subtotal: ");
	  double.subtotal = input.nextDouble();
	  
	  System.out.println("Enter the gratuity rate: ");
	  double.gratuityrate = input.nextDouble();
	  
	  double gratuity = subtotal * gratuityrate / 100;
	  double total = subtotal + gratuity;
	  
	  system.out.println("The gratuity is" + gratuity + " and the total is " + total + " .");
	}
}