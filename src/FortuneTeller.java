import java.text.DecimalFormat;
import java.text.NumberFormat;
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
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Welcome to the We Can {CODE} It Fortune Teller!");
		System.out.println("Please answer some simple questions and your fortune will be told.");
		System.out.println("You may type \"QUIT\" at any time to be a quitter.");
		System.out.println();

		System.out.print("Please enter your First name: ");
		String userFirstName;// = input.nextLine();
		if ("QUIT".equalsIgnoreCase(userFirstName = input.nextLine()))
			sayGoodbye();

		System.out.print("Please enter your Last name: ");
		String userLastName;
		if ("QUIT".equalsIgnoreCase(userLastName = input.nextLine()))
			sayGoodbye();

		System.out.print("Please enter your age (as an integer): ");
		String getAgeStr;
		if ("QUIT".equalsIgnoreCase(getAgeStr = input.nextLine()))
			sayGoodbye();
		int userAge = Integer.parseInt(getAgeStr);
		

		System.out.print("Please enter your month of birth (as an integer 1-12): ");
		String getBirthMonth;
		if ("QUIT".equalsIgnoreCase(getBirthMonth = input.nextLine()))
			sayGoodbye();
		int userBirthMonth = Integer.parseInt(getBirthMonth);

		String userColor;
		Boolean userColorRecieved = false;
		do {
			System.out.println("Please enter you favorite ROYGBIV color:");
			System.out.println("(If you do not know your ROYGBIV color names type HELP)");
			userColor = input.nextLine().trim();
			switch (userColor.toLowerCase()) {
			case ("red"):
			case ("orange"):
			case ("yellow"):
			case ("green"):
			case ("blue"):
			case ("indigo"):
			case ("violet"):
				userColorRecieved = true;
				break;
			case ("quit"):
				sayGoodbye();
				break;
			default:
				System.out.println("ROYGBIV colors are: Red, Orange, Yellow, Green, Blue, Indigo, Violet.\n");
				break;
			}
		} while (!userColorRecieved);

		System.out.println("Please enter your number of sibling(s) (as an integer): ");
		String getSiblingCountStr;
		if ("QUIT".equalsIgnoreCase(getSiblingCountStr = input.nextLine()))
			sayGoodbye();
		int userSiblingCount = Integer.parseInt(getSiblingCountStr);

		int NastyHRRetirementRulesOddAge = 17;
		int NastyHRRetirementRulesEvenAge = 22;
		int userRetirementYears = (userAge & 1) == 0 ? NastyHRRetirementRulesEvenAge : NastyHRRetirementRulesOddAge;

		String vacationLocation;
		if (userSiblingCount == 0) {
			vacationLocation = "Las Vegas, Nevada";
		} else if (userSiblingCount == 1) {
			vacationLocation = "Kihei, Hawaii";
		} else if (userSiblingCount == 2) {
			vacationLocation = "Foam Lake, Saskatchewan";
		} else if (userSiblingCount == 3) {
			vacationLocation = "Dublin, Ireland";
		} else if (userSiblingCount > 3) {
			vacationLocation = "Paris, France";
		} else {
			vacationLocation = "Batagaika crater, Sakha Republic";
		}

		String userTransport;
		switch (userColor.toLowerCase()) {
		case ("red"):
			userTransport = "Red Flyer";
			break;
		case ("orange"):
			userTransport = "Citroen";
			break;
		case ("yellow"):
			userTransport = "Pomacea bridgesii";
			break;
		case ("green"):
			userTransport = " C-9B Skytrain II";
			break;
		case ("blue"):
			userTransport = "Corolla";
			break;
		case ("indigo"):
			userTransport = "Tata Indigo";
			break;
		case ("violet"):
			userTransport = " BMW R 1150 R";
			break;
		default:
			userTransport = "Black Hole"; // This should not be reached
			break;
		}

		double userBankBalance;

		if (userBirthMonth >= 1 && userBirthMonth <= 4) {
			userBankBalance = 768345.45;
		} else if (userBirthMonth > 4 && userBirthMonth <= 8) {
			userBankBalance = 92678.15;
		} else if (userBirthMonth > 9 && userBirthMonth <= 12) {
			userBankBalance = 385.01;
		} else {
			userBankBalance = 0d;
		}

		NumberFormat nf = new DecimalFormat("$#,##0.00");
		
		System.out.println();
		System.out.println(userFirstName + " " + userLastName + " will retire in " + userRetirementYears
				+ " years with " + nf.format(userBankBalance) + " in the bank,\r\n" + "a vacation home in "
				+ vacationLocation + ", and travel by " + userTransport + ".");

		sayGoodbye();

	}

	public static void sayGoodbye() {
		System.out.println();
		System.out.println("Thank you using the We Can {CODE} It Fortune Teller!");
		System.out.println("Goodbye.");
		input.close();
		System.exit(0);
	}

}
