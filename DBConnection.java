package com.weather.app;

	import java.sql.Connection;
	import java.sql.DriverManager;

public class DBConnection {

	    public static Connection getConnection() throws Exception {

	        // Load Oracle JDBC Driver
	        Class.forName("oracle.jdbc.driver.OracleDriver");

	        // Update username & password if needed
	        String url = "jdbc:oracle:thin:@localhost:1521:XE";
	        String username = "system";
	        String password = "password";

	        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##oyee", "venkey");
	    }
	}


