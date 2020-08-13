package com.week06.exception;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatchTest01 {

	public static void main(String[] args) {
		
		try {
			testMethod();
		} catch (FileNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void testMethod() throws FileNotFoundException, SQLException{
		
	}
}
