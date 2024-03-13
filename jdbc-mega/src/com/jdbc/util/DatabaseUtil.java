package com.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseUtil {
    private  static final String  DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/jdbcdb";
    public DatabaseUtil() {
		
		try {
			Class.forName(DRIVER_PATH);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Something went wrong. " + e);
		}
	} //End of constructor
	
    public Connection getConnection() throws SQLException {
	  return DriverManager.getConnection(DATABASE_URL, "root", "W7301@jqir#"); 
	} //End of getConnection()
}
