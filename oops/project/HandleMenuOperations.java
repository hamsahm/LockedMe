package oops.project;

import java.util.Scanner;

public class HandleMenuOperations {

	public static void handleUserSelectedOperation() {

		Scanner sc = new Scanner(System.in);

		String operationEntered;

		while (true) {

			System.out.println("Please enter the required option here in Main menu: ");
			operationEntered = sc.next();
			switch (operationEntered) {

			case "1":
				FileOperations.displayListOfFiles();
				break;

			case "2":
				FileOperations.displayOptionsForUserInterface(sc);
				break;

			case "3":
				System.exit(0);
			}
		}

	}
}
