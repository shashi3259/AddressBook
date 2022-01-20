package com.backend;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.model.Student;
public class Repository {
	static Connection con = StudentDBConnection.createConnection();
	public static boolean addStudent(Student student) {
		boolean check = false;
		try {
			String data = "INSERT INTO students(s_name, s_city, s_phone) VALUES(?,?,?)";
			PreparedStatement ps=  con.prepareStatement(data);
			ps.setString(1, student.getStu_Name());
			ps.setString(2, student.getStu_city());
			ps.setString(3, student.getStu_mobileNo());
			ps.executeUpdate();
			check = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return check;
	}
	public static boolean deleteStudent(int userId) {
		boolean check = false;
		try {
			String data = "DELETE FROM students where S_id=?";
			PreparedStatement ps=  con.prepareStatement(data);
			ps.setInt(1, userId);
			ps.executeUpdate();
			check = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return check;
	}
	public static void viewAllStudents() {
		try {
			String data = "SELECT * FROM students";
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(data);
			while(set.next()) {
				int id = set.getInt("S_id");
				String name = set.getString(2);
				String city = set.getString("s_city");
				String mobileNo = set.getString("s_phone");		
				System.out.println("-------------------------------------");
				System.out.println("ID: " +id);
				System.out.println("Name: " +name);
				System.out.println("City: " +city);
				System.out.println("PhoneNo: " +mobileNo);
				System.out.println("-------------------------------------");
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean updateStudent(int choice,String newData, int S_idNo ) {
		boolean check = false;
		String data = null;
		PreparedStatement ps = null;
		try {
			switch(choice) {
			case 1:
				data = "UPDATE students SET S_name =? WHERE (S_id =?)";			
				ps=  con.prepareStatement(data);
				ps.setString(1, newData);
				ps.setInt(2, S_idNo);
				ps.executeUpdate();
				check = true;
				break;
			case 2:
				data = "UPDATE students SET s_city =? WHERE (S_id =?)";			
				ps=  con.prepareStatement(data);
				ps.setString(1, newData);
				ps.setInt(2, S_idNo);
				ps.executeUpdate();
				check = true;
				break;
			case 3:
				data = "UPDATE students SET s_phone =? WHERE (S_id =?)";			
				ps=  con.prepareStatement(data);
				ps.setString(1, newData);
				ps.setInt(2, S_idNo);
				ps.executeUpdate();
				check = true;
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return check;
	}
}
