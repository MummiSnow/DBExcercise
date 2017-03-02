/**
 * Created by MJPS on 20/02/2017.
 */
import java.sql.*;

public class main {
	
	//static final String JDBC_DRIVER = "oracle.jdbc.OracleDriver";
	static final String JDBC_DRIVER = "org.sqlite.JDBC";
	static final String DBURL = "jdbc:sqlite:/Users/MJPS/Dropbox/School/Software Development/2. Semester/Database/SQL Dev +/UniversityDB/DDL+drop.sql";
	static final String user = "system";
	static final String pass = "123456";
	
	public static void main(String[] args) throws SQLException {
		
		System.out.println("-------- Oracle JDBC Connection Testing ------");
		
		try {
			Class.forName(JDBC_DRIVER);
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
			
		}
		
		System.out.println("Oracle JDBC Driver Registered!");
		
		Connection connection = null;
		
		try {
			
			connection = DriverManager.getConnection(DBURL, user, pass);
			
		} catch (SQLException e) {
			
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
			
		}
		
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		
	}
	
}

class Excercise1 {
	
	/**
	 * Write a JAva program that displays all content
	 * of the department table using JDBC
	 *
	 * HINT: Figure 5.1 in SIL and demo code
	 * HINT: You need to have the oracle JDBC Driver (ojdbc7.jar) included in the netbeans
	 */
}
