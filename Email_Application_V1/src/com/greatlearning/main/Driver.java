package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {
	public static Employee employee =new Employee("Susmitha", "Reddy");
	public static Scanner scanner =new Scanner(System.in);
	public static CredentialService credentialservice =new CredentialService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String employeeFirstName = getEmployeeFirstName();
		String employeeLastName=getEmployeeLastName();
		displayMenu();
		int choice;
		choice=scanner.nextInt();
		String emailaddress = "";
		
		switch(choice) {
			case 1 :emailaddress= credentialservice.generateEmailAddress(employeeFirstName, employeeLastName, "tech");
			break;
			case 2:emailaddress=credentialservice.generateEmailAddress(employeeFirstName, employeeLastName, "admin");
			
			break;
			case 3:emailaddress=credentialservice.generateEmailAddress(employeeFirstName, employeeLastName, "hr");
			
			break;
			case 4:emailaddress= credentialservice.generateEmailAddress(employeeFirstName, employeeLastName, "legal");
			break;
			default:System.out.println("Please choose 1 to 4");
		}
		credentialservice.showCredential(employeeFirstName, emailaddress);
		
		
	}
	private static String getEmployeeLastName() {
		System.out.println("Enter Employee Last Name");
		// TODO Auto-generated method stub
		return scanner.nextLine();
	}
	private static String getEmployeeFirstName() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee First Name");
		return scanner.nextLine();
	}
	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the department from the following ");
		System.out.println("1.Technical ");
		System.out.println("2.Admin");
		System.out.println("3.Human");
		System.out.println("4.Legal");
		System.out.println("=============================");
		System.out.println("Choose Option For Menu");
		
	}

}
