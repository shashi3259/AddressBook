package com.backend;
import com.model.Student;
public class StudentController {
	public void addStudent(Student student) {
		Repository.addStudent(student);		
	}
	public void viewStudents() {
		Repository.viewAllStudents();
	}
	public void deleteStudent(int userId) {
		Repository.deleteStudent(userId);
	}
	public void updateStudent(int choice,String newName, int S_idNo) {
		Repository.updateStudent(choice, newName, S_idNo);
	}
}
