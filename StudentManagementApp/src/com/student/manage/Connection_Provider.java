package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_Provider {
	
	static Connection con;
	
	public static Connection createC() {
		
		try {
			
			//STEP-1: LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");
			
			//STEP-2: CREATE THE CONNECTION
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage", "root", "root");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}

}
