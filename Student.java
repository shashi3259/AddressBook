package com.model;
public class Student {
	private int Stu_id;
	private String Stu_Name;
	private String Stu_city ;
	private String Stu_mobileNo;
	public Student() {
		super();
	}
	public Student(int stu_id, String stu_Name, String stu_city, String stu_mobileNo) {
		super();
		Stu_id = stu_id;
		Stu_Name = stu_Name;
		Stu_city = stu_city;
		Stu_mobileNo = stu_mobileNo;
	}
	public Student(String stu_Name, String stu_city, String stu_mobileNo) {
		super();
		Stu_Name = stu_Name;
		Stu_city = stu_city;
		Stu_mobileNo = stu_mobileNo;
	}
	@Override
	public String toString() {
		return "Student ID: " + Stu_id + "\nStudent Name" + Stu_Name + "\nStudent city: " + Stu_city + "\nStudent mobileNo: "
				+ Stu_mobileNo + "]";
	}
	public int getStu_id() {
		return Stu_id;
	}
	public void setStu_id(int stu_id) {
		Stu_id = stu_id;
	}
	public String getStu_Name() {
		return Stu_Name;
	}
	public void setStu_Name(String stu_Name) {
		Stu_Name = stu_Name;
	}
	public String getStu_city() {
		return Stu_city;
	}
	public void setStu_city(String stu_city) {
		Stu_city = stu_city;
	}
	public String getStu_mobileNo() {
		return Stu_mobileNo;
	}
	public void setStu_mobileNo(String stu_mobileNo) {
		Stu_mobileNo = stu_mobileNo;
	}
}
