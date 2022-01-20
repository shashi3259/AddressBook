package com.addressbookCient;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Client candidate = new Client();
		System.out.println("Welcome to adress book of students!!!");
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("PRESS 1 to ADD STUDENT");
			System.out.println("PRESS 2 to DELETE.");
			System.out.println("PRESS 3 to VIEW STUDENTS.");
			System.out.println("PRESS 4 to UPDATE.");						
			System.out.println("PRESS 0 to EXIT!");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				candidate.addStudent();
				break;
			case 2:
				candidate.deleteStudent();
				break;
			case 3:
				candidate.viewStudents();
				break;
			case 4:
				candidate.updateStudents();
				break;	
			}
		}while(choice!=0);
		System.out.println("End of the program!!!");
		sc.close();
	}
}
