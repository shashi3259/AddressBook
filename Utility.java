package com.addressbookCient;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Utility {
	private Scanner sc = new Scanner(System.in);
	public String stringInput(String message) {
		displayMessage(message);
		String input = sc.nextLine();
		return input;
	}
	private void displayMessage(String message) {
		System.out.print("Enter " + message + " : ");	
	}
	public int intInput(String message) {
		displayMessage(message);
		int input = sc.nextInt();
		return input;
	}
	public void bug() {
		sc.nextLine();		
	}
	public String mobileNumberInput(String newPhoneNo) {
		String mobileNo = null;
		do{
			System.out.print("Enter the new Phone no.: ");
			newPhoneNo = sc.nextLine();
			if(isValid(newPhoneNo)) {
				mobileNo = newPhoneNo;
			}
			else {
				System.out.println("--------------------------------");
				System.out.println("Invalid mobileNo.! ");
				System.out.println("Mobile no.\n1. May or may not be (0 or 91) as country's code and other state no.\n2.(6-9) as first no.\n3. other 9 digit any no.! ");
				System.out.println("--------------------------------");
				System.out.print("Again ");
			}
		}while(!isValid(newPhoneNo));
		return mobileNo;
	}
	private boolean isValid(String mobileNo) {
		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m = p.matcher(mobileNo);		
		return m.matches();
	}
}
