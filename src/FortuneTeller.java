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

		String userColor;
		Boolean userColorRecieved = false;
		do {
			System.out.println("Please enter you favorite ROYGBIV color:");
			System.out.println("(If you do not know your ROYGBIV color names type HELP)");
			userColor = input.next().trim().toLowerCase();
			switch (userColor) {
			case ("red"):
			case ("orange"):
			case ("yellow"):
			case ("green"):
			case ("blue"):
			case ("indigo"):
			case ("violet"):
				userColorRecieved = true;
				break;
			default:
				System.out.println("ROYGBIV colors are: Red, Orange, Yellow, Green, Blue, Indigo, Violet.\n");
				break;
			}
		} while (!userColorRecieved);

		System.out.println("Please enter your number of sibling(s) (as an integer): ");
		int userSiblingCount = input.nextInt();
		
		System.out.println();
		System.out.println(
				userFirstName + " " + userLastName + " will retire in " + userAge + "years with " + userBirthMonth
						+ " in the bank,\r\n" + "a vacation home in " + userSiblingCount + ", and travel by " + userColor + ".");

		input.close();
	}

}
