//Gerard Andrews 
//1/22/17 
//ProgrammingExercise 2.1
import java.util.Scanner;

public class Temperature{
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a degree in Celcius: ");
	double celcius = input.nextDouble();
	double fahrenheit = ((9.0 / 5) * celcius + 32);
	System.out.println(celcius + " degrees Celcius is " + fahrenheit + " Fahrenheit.");
  }
}

    
    
    
    