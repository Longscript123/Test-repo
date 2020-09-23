import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQL {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:3306:xe","abhishek","password");
		Statement stmt = con.createStatement();
		//ResultSet rs = stmt.executeQuery("select *from emp");
		//while(rs.next())
		//{
		//	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
		//}
		con.close();

	}

}