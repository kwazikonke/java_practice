package JavaDeepDive;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("--Arithmetic Calculator--");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		
		System.out.println("Enter the operation number (1/2/3/4): ");
		int operation_num = obj.nextInt();
		
		System.out.println("Enter the first number: ");
		double num_1 = obj.nextDouble();
		
		System.out.println("Enter the second number: ");
		double num_2 = obj.nextDouble();
		
		double res = 0.0;
		
		switch (operation_num) {
		case 1:
			res= num_1+num_2;
			System.out.println("Equals to: "+ res);
			break;
		case 2:
			res= num_1-num_2;
			System.out.println("Equals to: "+ res);
			break;
		case 3:
			res= num_1*num_2;
			System.out.println("Equals to: "+ res);
			break;
		case 4:
			if (num_2 !=0) {
				res = num_1/num_2;
				System.out.println("Equals to: "+ res);
			}
			else {
				System.out.println("You can not divide number by zero!!");
			}
			break;
			default:
			System.out.println("Invalid number, please choose from 1,2,3,4");
		}
		obj.close();		
		
		
	}

}
