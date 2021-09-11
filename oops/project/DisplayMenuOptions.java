package oops.project;

public class DisplayMenuOptions {

	public static void printWelcomeScreen(String projectName, String developerName) {

		System.out.println("************************************************************************");
		System.out.println("**** Welcome to " + projectName + ".com.");
		System.out.println("**** Developer of this application is " + developerName + ".");
		System.out.println("************************************************************************");
		System.out.println();
		System.out.println("This application can be used to :");
		System.out.println("** Retrieve all file names in the folder (files_for_project).");
		System.out.println("** Add, delete and search files in the folder (files_for_project).");
		System.out.println("********* Select the required option from the below menu **********");
		System.out.println();
		System.out.println();
		System.out.println("Features of My application");
		System.out.println("1. Retrieving the file names in an ascending order");
		System.out.println("2. Business-level Operations");
		System.out.println("3. Option to close the application");
		System.out.println("========================================================================");

	}

}
