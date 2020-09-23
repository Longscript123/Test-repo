
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/Pets")
public class Pets extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			
			String new_table = request.getParameter("new_t");
			String action = request.getParameter("act");
			//String a = "add",b = "delete",c = "update",d = "print";
			String id = request.getParameter("t1");
			String name = request.getParameter("t2");
			String customer = request.getParameter("t3");
			String gender = request.getParameter("r1");
			String dop = request.getParameter("d1");
			String location = request.getParameter("loc");
			
			try {
				//Add driver, create a connection
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_store","root","Abhi@1110");
				if(con!=null) {
					System.out.println("Connected to database.....");

				}
				Statement stmt = con.createStatement();

				

				//Write queries to create a new table, insert a new entry, update an entry, delete an entry
				//Create Database

				if(new_table.equals("yes")) {

				String q = "CREATE DATABASE Pet_Store";
				stmt.executeUpdate(q);

					System.out.println("Creating table in given database...");			      
					String sql = "CREATE TABLE Pet_Store.Pets (id VARCHAR(255), pet_name VARCHAR(255), customer_name VARCHAR(255),gender VARCHAR(255),date_of_purchase VARCHAR(255),location VARCHAR(255))";
					stmt.executeUpdate(sql);
				}
				
				
				//Insert a new Pet
				System.out.println(action);			      

				if(action.equals("1")) {
				
				System.out.println(action);			      

			    stmt.executeUpdate("INSERT INTO Pets VALUES ('"+id+"', '"+name+"', '"+customer+"','"+gender+"', '"+dop+"', '"+location+"')");
				
				
				}
				
				
				//Delete an existing Pet
				if(action.equals("2")) {

			    stmt.executeUpdate("DELETE FROM PETS WHERE id = "+id);
				}
			    
				//Update an existing Pet
			    
				if(action.equals("3")) {
				stmt.executeUpdate("UPDATE PETS SET pet_name = '"+name+"', customer_name = '"+customer+"', gender = '"+gender+"', date_of_purchase = '"+dop+"', location = '"+location+"' WHERE id = "+id);
			    
				}
				
				//Select a Pet
				
				
				//Print All
				
				if(action.equals("4")) {

				String r = "SELECT * FROM PETS";
				ResultSet rs = stmt.executeQuery(r);
				while(rs.next())
				{
					System.out.println("Id:"+rs.getString(1)+"   pet_name:"+rs.getString(2)+"     customer_name:"+rs.getString(3)+"   gender:"+rs.getString(4)+"   date of purchase:"+rs.getString(5)+"   location:"+rs.getString(6));
				}
				
				}
				
				
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
			

