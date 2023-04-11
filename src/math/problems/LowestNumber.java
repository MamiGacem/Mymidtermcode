package math.problems;

import databases.ConnectToSqlDB;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class LowestNumber {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int[] array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

		int lowestNumber = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < lowestNumber) {
				lowestNumber = array[i];
			}
		}

		System.out.println("The lowest number in the array is: " + lowestNumber);
// Connect to MySQL database


		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		Properties prop = new Properties();
		try {
			InputStream inputStream = new FileInputStream("C:\\Users\\Amel Boucetta Gacem\\eclipse-workspace\\midterm-coding-exam\\src\\secret.properties");
			prop.load(inputStream);
			inputStream.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		String driverClass = prop.getProperty("MYSQLJDBC.driver");
		String url = prop.getProperty("MYSQLJDBC.url");
		String username = prop.getProperty("MYSQLJDBC.userName");
		String password = prop.getProperty("MYSQLJDBC.password");

		Class.forName(driverClass);
		Connection connection = DriverManager.getConnection(url,username,password);


// Insert the lowest number into a MySQL table
		connectToSqlDB.insertDataToSqlTable(Integer.toString(lowestNumber), "students", "stName");

// Retrieve the lowest number from the MySQL table
		List<String> lowestValue = null;
		try {
			lowestValue = connectToSqlDB.readDataBase("students", "stId");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

// Print the lowest number to the console
		System.out.println("The lowest number in the array is: " + lowestValue.get(0));
	}}