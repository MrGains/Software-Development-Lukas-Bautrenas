import java.util.Scanner;
public class BigNumber{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number");
	int lol = input.nextInt();

	if (lol > 1000000){
		System.out.println("That number is a big number");

	}
}