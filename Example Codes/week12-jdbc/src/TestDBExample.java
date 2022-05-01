import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class TestDBExample {
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Moona\\eclipse-workspace\\week12-jdbc\\testdb3.db");
			Statement statement = conn.createStatement();
			statement.execute("CREATE TABLE contactInfo (name TEXT, phone INTEGER, email TEXT)");
			statement.execute("INSERT INTO contactInfo (name, phone, email)" +
					"VALUES ('Ali', 123456, 'ali@myemail.com')");

			statement.execute("INSERT INTO contactInfo (name, phone, email)" +
		"VALUES ('John', 789456, 'john@myemail.com')");

			statement.execute("INSERT INTO contactInfo (name, phone, email)" +
		"VALUES ('Roy', 753159, 'roy@myemail.com')");

			statement.execute("UPDATE contactInfo SET phone=159357 WHERE name='Ali'");
			statement.execute("DELETE FROM contactInfo WHERE name='Ali'");

			ResultSet results = statement.executeQuery("SELECT * from contactInfo");
			if(!results.isBeforeFirst()) {
				System.out.println("No data");
			}
			int one = 0;
			while(results.next()) {
				
				System.out.println("Record: " + one);
				System.out.println(results.getString("name") + " " +
									results.getInt("phone") + " " +
									results.getString("email"));
				System.out.println();
				one++;
			}
			results.close();
			

			//closing resources manually
			statement.close();
			conn.close();
			
		}catch(SQLException e) {
			System.out.println("Something went wrong: "+e.getMessage());
		}
	}

}
