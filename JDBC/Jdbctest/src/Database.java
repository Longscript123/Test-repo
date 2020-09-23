import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
public static void main(String[] args)throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/companya","root","Abhi@1110");
	if(con!=null) {
		System.out.println("Connected to database.....");
	}
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("SELECT * FROM user");
	while(rs.next())
	{
		System.out.println("User:"+rs.getString(1)+"   email:"+rs.getString(2)+"     password:"+rs.getString(3));
	}
	con.close();
}
}
