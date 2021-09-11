package oops.project;

import java.util.Scanner;

public class HandleMenuOperations {

	public static void handleUserSelectedOperation() {
		System.out.println("Please enter the required option here");
		Scanner sc = new Scanner(System.in);
		
		String operationEntered;
		
		operationEntered = sc.next();
		sc.close();
		
	}
	
	

}
