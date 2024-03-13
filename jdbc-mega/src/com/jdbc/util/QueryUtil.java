package com.jdbc.util;

public class QueryUtil {
 public static String insertEmployeeQuery() {
	return "INSERT INTO EMPLOEE_INFO (EMPLOYEE_NAME, EMPLOYEE_ADDRESS, EMPLOYEE_SALARY) VALUES(?,?,?)";
	 
 }
 public static String selectAllEmployeeQuery() {
	 return "SELECT * FROM EMPLOEE_INFO";
 }
 public static String selectEmployeeById(int employeeId) {
	 return "SELECT * FROM EMPLOEE_INFO WHERE EMPLOYEE_ID = " + employeeId;
 }
 public static String deleteEmployeeById(int employeeId) {
	 return "DELETE FROM EMPLOEE_INFO WHERE EMPLOYEE_ID = " + employeeId;
 }
 public static String updateEmployeeQuery(int employeeId) {
	 return "UPDATE EMPLOEE_INFO SET EMPLOYEE_NAME = ?, EMPLOYEE_ADDRESS =?, EMPLOYEE_SALARY =? WHERE EMPLOYEE_ID = " + employeeId;
	 
 }
}
