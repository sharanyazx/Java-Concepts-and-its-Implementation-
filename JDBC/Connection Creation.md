````java []
package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Project {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		//Register Drive
	   
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
		System.out.print("Connection Created");

	}

}

````
