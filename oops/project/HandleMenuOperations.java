package oops.project;

import java.util.Scanner;

public class HandleMenuOperations {

	public static void handleUserSelectedOperation() {
		System.out.println("Please enter the required option here");
		Scanner sc = new Scanner(System.in);

		String operationEntered;

		while (true) {

			operationEntered = sc.next();
			switch (operationEntered) {

			case "1":
				FileOperations.displayListOfFiles();
				break;

			case "2":
				FileOperations.displayOptionsForUserInterface(sc);
				break;

			}

		}

	}

}
