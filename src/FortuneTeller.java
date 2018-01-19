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
		
		System.out.println();
		System.out.println(userFirstName + " *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank,\r\n" + 
				"a vacation home in *[location]*, and travel by *[mode of transporation]*.");	
	
	input.close();
	}

}
