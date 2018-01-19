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
			userColor = input.next().trim();
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
			default:
				System.out.println("ROYGBIV colors are: Red, Orange, Yellow, Green, Blue, Indigo, Violet.\n");
				break;
			}
		} while (!userColorRecieved);

		System.out.println("Please enter your number of sibling(s) (as an integer): ");
		int userSiblingCount = input.nextInt();
		
		
		int NastyHRRetirementRulesOddAge = 17;
		int NastyHRRetirementRulesEvenAge = 22;
		int userRetirementYears = (userAge&1) == 0 ? NastyHRRetirementRulesEvenAge : NastyHRRetirementRulesOddAge;

		String vacationLocation;
		if (userSiblingCount == 0) {
			vacationLocation = "Las Vegas, Nevada";
		} else if (userSiblingCount == 1) {
			vacationLocation = "Kihei, Hawaii";
		} else if (userSiblingCount == 2) {
			vacationLocation = "Foam Lake, Saskatchewan";
		} else if (userSiblingCount == 3) {
			vacationLocation = "Dublin, Ireland";
		}else if (userSiblingCount > 3) {
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
		
		System.out.println();
		System.out.println(
				userFirstName + " " + userLastName + " will retire in " + userRetirementYears + " years with " + userBirthMonth
						+ " in the bank,\r\n" + "a vacation home in " + vacationLocation + ", and travel by " + userTransport + ".");

		input.close();
	}

}
