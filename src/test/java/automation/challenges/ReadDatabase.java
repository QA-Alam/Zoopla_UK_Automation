package automation.challenges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadDatabase {

	// Step 1) Make a connection to the Database using method.
	// DriverManager.getConnection(URL, "userid", "password")

	// Step 2) Create Query to the Database using the Statement Object.
	// Statement stmt = con.createStatement();

	// Step 3) Send the query to database using execute query and store the results
	// in the ResultSet object.
	// ResultSet rs = stmt.executeQuery(select * from employee;);

	public static void main(String[] args) throws Throwable {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // JDBC Path by using class.forname method
			   // With the help of getConnection() method i have to pass -> URL, HOST, SCHEMA, USERNAME & Password
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/database", "hr", "hr");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("select * from employees");

		List<String> columnValue = new ArrayList<String>();
			while (rs.next()) {
				columnValue.add(rs.getString("salary"));
			}
		System.out.println(columnValue);
	

	}

}