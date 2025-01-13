package com.student.manage;

public class Student {
	
	private int studentId;
	private String StudentName;
	private String studentPhone;
	private String studentCity;
	
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	
	public Student(int studentId, String studentName, String studentPhone, String studentCity) {
		super();
		this.studentId = studentId;
		this.StudentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}

	
	public Student(String studentName, String studentPhone, String studentCity) {
		super();
		this.StudentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}
	
}
