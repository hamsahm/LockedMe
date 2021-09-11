package oops.project;

import java.io.File;

public class FileOperations {

	public static void displayListOfFiles() {

		String userDir = System.getProperty("user.dir");
		String folderName = "files_for_project";
		File folder = new File(userDir + "\\src\\" + folderName);

		System.out.println("The List Of Files can be found below: ");
		for (String file : folder.list()) {
			System.out.println(file);

		}

	}
}