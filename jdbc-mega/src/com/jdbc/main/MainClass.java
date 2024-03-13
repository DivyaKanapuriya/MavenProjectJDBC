package com.jdbc.main;

import java.util.Scanner;

import com.jdbc.model.Employee;
import com.jdbc.service.DatabaseService;

public class MainClass {

	public static void main(String[] args) {
		DatabaseService databaseService = new DatabaseService();
		try (Scanner sc = new Scanner(System.in);) {
			boolean isRunning = true;
			while(true) {
                System.out.println("Enter choice");
				System.out.println("1. Insert");
				System.out.println("2. Select all");
				System.out.println("3. Select employee by an id");
				System.out.println("4. Delete employee ");
				System.out.println("5. Update employee");
	            System.out.println("6. Exit");
				int choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1:
					System.out.println("Enter name, address, salary");
				    databaseService.insertEmployee(new Employee(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())));
					break;
				case 2:
					databaseService.getAllEmployees();
					break;
				case 3:
					System.out.println("Enter id of an employee");
					databaseService.getEmployeeById(Integer.parseInt(sc.nextLine()));
					break;
				case 4:
					System.out.println("Enter id of an employee");
					databaseService.deleteEmployeeById(Integer.parseInt(sc.nextLine()));
					break;
				case 5:
					System.out.println("Enter id of an employee");
					int updateId = Integer.parseInt(sc.nextLine());
					boolean isFound = databaseService.getEmployeeById(updateId);
				    if(isFound) {
				    	System.out.println("Enter name, address, salary");
				        Employee employee = new Employee(updateId, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
				    	databaseService.updateEmployee(employee);
				    }
					break;
				case 6:
					System.out.println("Thank you. Visit again.");
					isRunning = false;
					break;
				default:
					System.out.println("Incorrect choice");
					break;
				}
			
			}
		} catch(Exception e) {
			throw new RuntimeException("Something went wrong " + e);
		}

	}
}
