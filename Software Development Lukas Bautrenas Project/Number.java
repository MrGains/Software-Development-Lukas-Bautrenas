import java.util.Scanner;
public class Number{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number1 = input.nextInt();

	if(number1 > 0){
		System.out.println("The number inputted is positive.");
		}else if(num < 0){
			System.out.println("The number inputted is negative.");
	}else if(num == 0){
		System.out.println("The number inputted is ZERO");
	}


}
}