package oops.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
	final static String userDir = System.getProperty("user.dir");
	final static String folderName = "files_for_project";

	public static void displayListOfFiles() {

		File folder = new File(userDir + "\\src\\" + folderName);

		System.out.println("The List Of Files can be found below: ");
		for (String file : folder.list()) {
			System.out.println(file);

		}

	}

	public static void displayOptionsForUserInterface(Scanner sc) {
		System.out.println("1. Add a file to the folder (files_for_project).");
		System.out.println("2. Delete a file from the folder (files_for_project).");
		System.out.println("3. Search a from the folder (files_for_project).");
		System.out.println("4. Exit to Main menu");
		System.out.println("5. Exit Program");

		System.out.println("Enter the required operation: ");
		String selectedOperation;

		while (true) {
			selectedOperation = sc.next();

			switch (selectedOperation) {
			case "1":
				System.out.println("Enter the file name :");
				String fileName = sc.next();
				createFile(fileName);
				break;

			}
		}

	}

	private static void createFile(String fileName) {

		File file = new File(userDir + "\\src\\" + folderName + "\\" + fileName + ".txt");

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			else {
				System.out.println("The specified file is already present in the directory.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("The file " + fileName + " is successfully created.");

	}
}