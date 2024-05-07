package fr.digi.c022024.jbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class TestConnectionJdbc {
	private static final String DB_URL ;
	private static final String DB_USER ;
	private static final String DB_PWDS;
	
			
	
	static {
		ResourceBundle bundle = ResourceBundle.getBundle("db");
		DB_URL = bundle.getString("db.url");
		DB_USER = bundle.getString("db.user");
		DB_PWDS = bundle.getString("db.pwds");
		
		
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection connection ;
		Statement st;
		try {
			 connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PWDS);
			// st = connection.createStatement();
			 System.out.println(connection);
			 connection.close();
		}catch (SQLException e) {
			
		}finally{
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
