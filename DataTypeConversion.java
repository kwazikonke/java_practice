package JavaDeepDive;

import java.util.Scanner;

public class DataTypeConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter a value: ");
        String userInput = scanner.nextLine();
        
        //Converting string to Integer
        int intValue = Integer.parseInt(userInput);
        System.out.println("Integer value: " + intValue);
        
        // Converting string to double
        double doubleValue = Double.parseDouble(userInput);
        System.out.println("Double value: " + doubleValue);

        // Converting string to boolean
        boolean booleanValue = Boolean.parseBoolean(userInput);
        System.out.println("Boolean value: " + booleanValue);
        
        // Converting string to character (if the input is a single character)
        if (userInput.length() == 1) {
            char charValue = userInput.charAt(0);
            System.out.println("Character value: " + charValue);
        } else {
            System.out.println("Input is not a single character, cannot convert to char.");
        }

        

	}

}
