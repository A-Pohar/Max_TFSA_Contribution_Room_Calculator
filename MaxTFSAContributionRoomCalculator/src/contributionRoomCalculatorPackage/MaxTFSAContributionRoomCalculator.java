package contributionRoomCalculatorPackage;
import java.util.Scanner;
import java.util.HashMap;


public class MaxTFSAContributionRoomCalculator {

	public static void main(String[] args) {
		//Note: User must input a year that is between 1921 and 2021 (inclusively) in YYYY format.
		
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, Integer> TFSARoom = new HashMap<Integer, Integer>();
		TFSARoom.put(2009, 5000);
		TFSARoom.put(2010, 5000);
		TFSARoom.put(2011, 5000);
		TFSARoom.put(2012, 5000);
		TFSARoom.put(2013, 5500);
		TFSARoom.put(2014, 5500);
		TFSARoom.put(2015, 10000);
		TFSARoom.put(2016, 5500);
		TFSARoom.put(2017, 5500);
		TFSARoom.put(2018, 5500);
		TFSARoom.put(2019, 6000);
		TFSARoom.put(2020, 6000);
		TFSARoom.put(2021, 6000);
		
		System.out.println("Welcome to Max TFSA Contribution Room Calculator!");
		System.out.println("In what year did you turn 18?");
		int year_input = Integer.valueOf(scanner.nextLine());
		int cont_room = 0;
		
		try {
			if (year_input >= 1921 && year_input < 2009) {
				for (int i = 2009; i <= 2021; i++) {
					cont_room += TFSARoom.get(i);
				}
				System.out.println("Your maximum contribution room is " + cont_room + " "
						+ "as of 2021.");
			}
			else if (2009 <= year_input && year_input <= 2021) {
				for (int i = year_input; i <= 2021; i++) {
					cont_room += TFSARoom.get(i);
				}
				System.out.println("Your maximum contribution room is " + cont_room + " "
						+ "as of 2021.");
			}
			else if (year_input < 1921 || year_input > 2021) {
				System.out.println("Sorry, but this calculator is accurate as of 2021. "
						+ "Please try again with an input that is a year between 1921 "
						+ "and 2021 (inclusively) in YYYY format.");
			}
			scanner.close();
		}
		catch (Exception e) {
			System.out.println("Sorry, but this input is not a year. Please try again with an "
					+ "input that is a year between 1921 and 2021 (inclusively) in YYYY format.");
		}
		scanner.close();
	}
}