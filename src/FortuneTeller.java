import java.util.Scanner;

/*
 * FortuneTeller:
 * a console application that will tell the user’s fortune based on data received from the user.
 * 
 * Author: David Langford
 * Date  : Jan 19, 2018
 * 
 */

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your First name: ");
		String userFirstName = input.nextLine();
		
		System.out.print("Please enter your Last name: ");
		String userLastName = input.nextLine();
		
		System.out.print("Please enter your age (as an integer): ");
		int userAge = input.nextInt();
		
		System.out.print("Please enter your month of birth (as an integer 1-12): ");
		int userBirthMonth = input.nextInt();
		
		System.out.println();
		System.out.println(userFirstName + " " + userLastName + " will retire in " + userAge + "years with " + userBirthMonth + " in the bank,\r\n" + 
				"a vacation home in *[location]*, and travel by *[mode of transporation]*.");	
	
	input.close();
	}

}
