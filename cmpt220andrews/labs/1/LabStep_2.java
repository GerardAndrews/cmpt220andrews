//Gerard Andrews
//1/22/2017
//Lab1, Part 2
import java.util.Scanner;

public class LabStep_2{
	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  
	  System.out.println("Please enter the following as a percentage: ");
	  System.out.println("Midterm Grade: ");
	  double midterm = input.nextDouble() * 0.2;
	  System.out.println("Final Test Grade: ");
	  double finalTest = input.nextDouble() * 0.2;
	  System.out.println("Project Grade: ");
	  double projects = input.nextDouble() * 0.2;
	  System.out.println("Homework and Labs: ");
	  double hwLabs = input.nextDouble() * 0.4;
	  double finalGrade = (midterm + finalTest + projects + hwLabs);
	  System.out.println("Your final grade is " + finalGrade +"%.");
	}
}