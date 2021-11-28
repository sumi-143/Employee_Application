package com.greatlearning.service;

import java.util.Random;
import java.util.Scanner;

public class CredentialService {
	public static Scanner scanner =new Scanner(System.in);
	
	public String generateEmailAddress(String firstName,String lastName,String department) {
		String emailaddress=firstName+lastName+"@"+department+".com";
	return emailaddress;
	}
	public char[] generateRandomPassword() {
		 String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      int length =8;
		char[] password = new char[length ];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
		
	}
	public void showCredential(String firstName,String emailaddress) {
		System.out.println("Dear " +firstName +" your generated credentials are as follows");
		System.out.println(emailaddress);
		System.out.println(generateRandomPassword());
	}
}
