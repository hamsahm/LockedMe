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
		DisplayMenuOptions.printOptionsForUserOperations();
		String selectedOperation;

		boolean returnToMainMenu = false;
		while (!returnToMainMenu) {

			System.out.println("Enter the required operation: ");
			selectedOperation = sc.next();

			switch (selectedOperation) {
			case "1":
				System.out.println("Enter the file name :");
				String fileName = sc.next();
				createFile(fileName);
				break;

			case "2":
				System.out.println("Enter the file name :");
				fileName = sc.next();
				deleteFile(fileName);
				break;

			case "3":
				System.out.println("Enter the file name :");
				fileName = sc.next();
				searchFile(fileName);
				break;

			case "4":
				returnToMainMenu = true;
				return;
			case "5":
				System.exit(0);
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

	private static void deleteFile(String fileName) {

		File file = new File(userDir + "\\src\\" + folderName + "\\" + fileName + ".txt");
		boolean isFileDeleted = false;
		if (file.exists()) {
			isFileDeleted = file.delete();
		}
		if (isFileDeleted) {
			System.out.println("The file " + fileName + " is successfully deleted.");
		} else {
			System.out.println("The specified file" + fileName + " doesn't exists.");
		}
	}

	private static void searchFile(String fileName) {

		File folder = new File(userDir + "\\src\\" + folderName);

		if (!folder.exists()) {
			System.out.println("The folder doesn't exists");
		} else {
			boolean isPresent = false;
			for (String file : folder.list()) {
				if (file.equalsIgnoreCase(fileName)) {
					isPresent = true;
					break;
				}
			}

			if (isPresent)
				System.out.println("The specified file exists in the folder.");
			else
				System.out.println("The specified file doesn't exists in the folder.");

		}

	}

}