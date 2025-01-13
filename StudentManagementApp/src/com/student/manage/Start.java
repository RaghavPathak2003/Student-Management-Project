package com.student.manage;

import java.io.IOException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to delete student");
			System.out.println("Press 3 to display student");
			System.out.println("Press 4 to exit");
			
			int c = Integer.parseInt(sc.nextLine());
			
			if (c == 1) {
				// add student
				System.out.println("Enter user name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter user phone: ");
				String phone = sc.nextLine();
				
				System.out.println("Enter user city: ");
				String city = sc.nextLine();
				
			//	Creating student object to store student
				Student st = new Student(name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if (answer == true) {
					System.out.println("student added");
				} else {
					System.out.println("something is wrong");
				}
				
				System.out.println(st);
					
			}
			
			
			
			
			
			
			else if (c == 2) {
				//delete student
				System.out.println("enter student id to delete");
				int userId = Integer.parseInt(sc.nextLine());
				boolean f = StudentDao.deleteStudent(userId);
				if (f == true) {
					System.out.println("student deleted");
				} else {
					System.out.println("not deleted, something is wrong");
				}
			}
			
			
			
			
			
			
			else if (c == 3) {
				//display student
				StudentDao.showAllStudents();
			}
			
			else if (c == 4) {
				//exit
				break;
			}
			
			else {
				
			}
			
		}
		
		System.out.println("Thank you for using the app");
		System.out.println("See you sonn");

	}

}
