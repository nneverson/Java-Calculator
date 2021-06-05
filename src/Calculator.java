import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.println("Enter first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter 1 for addition, 2 for subtraction, 3 for Multiplication, 4 for division, 5 to exit: ");
		num3 = scan.nextInt();
		System.out.println("Enter second number: ");
		num2 = scan.nextInt();
		
		int addition = num1 + num2;
		int minus = num1 - num2;
		int times = num1 * num2;
		int divide = num1 / num2;
		
		switch(num3) {
				case 1: System.out.println("The answer is: " + addition);
				break;
				case 2: System.out.println("The answer is: " + minus);
				break;
				case 3: System.out.println("The answer is: " + times);
				break;
				case 4: System.out.println("The answer is: " + divide);
				break;
				case 5: System.exit(0);
					}
		//System.out.println(answer);
		
		
		
	}

}
