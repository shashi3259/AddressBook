package com.addressbookCient;
import java.util.Scanner;
import com.backend.StudentController;
import com.model.Student;
public class Client {
	StudentController studentController = new StudentController();
	Utility utility = new Utility();
	Scanner sc = new Scanner(System.in);
	public void addStudent() {
		System.out.print("Enter the Student Name: ");
		String Name = sc.nextLine();
		String city = utility.stringInput("Student city ");
		String newmobileNo = utility.stringInput("Mobile No.: ");
		String mobileNo = utility.mobileNumberInput(newmobileNo);	
		Student student = new Student(Name, city, mobileNo);				
		studentController.addStudent(student);		
	}
	public void viewStudents() {
		studentController.viewStudents();
	}
	public void deleteStudent() {
		int userId = utility.intInput(" userId to delete: ");
		studentController.deleteStudent(userId);
	}
	public void updateStudents() {
		System.out.println("1. NAME");
		System.out.println("2.CITY");
		System.out.println("3.PHONE_No");
		int choice = utility.intInput("Select choice no. what you want to update?  ");
		int S_idNo  = 0;
		switch(choice) {
		case 1:
			System.out.print("Enter the new Name: ");
			String newName = sc.nextLine();
			S_idNo = utility.intInput("the ID from DB whose Name get update");
			studentController.updateStudent(choice, newName, S_idNo);
			break;
		case 2:
			System.out.print("Enter the new City: ");
			String newCity = sc.nextLine();
			S_idNo = utility.intInput("the ID from DB whose Name get update");
			studentController.updateStudent(choice, newCity, S_idNo);
			break;
		case 3:
			System.out.print("Enter the new Phone no.: ");
			String newMobileNo = sc.nextLine();
			String mobileNo = utility.mobileNumberInput(newMobileNo);
			S_idNo = utility.intInput("the ID from DB whose Name get update");
			studentController.updateStudent(choice, mobileNo, S_idNo);
			break;
		}
	}
}
