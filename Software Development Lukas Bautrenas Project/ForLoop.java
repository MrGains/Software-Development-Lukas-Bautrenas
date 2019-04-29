import java.util.Scanner;
public class ForLoop{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int num2 = 0;
	int num1 = 0;
	for (int x = 1; x <= 10; x++){
		System.out.print("Enter Number "+x+": ");
		num = input.nextInt();

		if(num1 % 2 != 0){
			num2 += num1;
		}
	}

	System.out.println("Sum of odd number is: "+sum);

}
}