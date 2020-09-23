package Details;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


@WebServlet("/Customer_Data")
public class Customer_Data extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		
		
		String first_n = request.getParameter("fName");
		char[] first_name = first_n.toCharArray();
		
		String last_n = request.getParameter("lName");
		char[] last_name = last_n.toCharArray();
		
		String mob = request.getParameter("Mobile");
		char[] mobile = mob.toCharArray();
		//System.out.println(mobile[2]);
		
		String dt = request.getParameter("doB");
		char[] date = dt.toCharArray();
		//System.out.println(date[date.length-1]);
		
		String idp = request.getParameter("idProof");
		char[] id = idp.toCharArray();
		
		
		
		
		char[]pass = {first_name[first_name.length-1],last_name[0], mobile[0], mobile[2], mobile[4], mobile[6], mobile[8], date[date.length-2], date[date.length-1],  };
		
		String password =String.valueOf(pass);
		
		
		String vowel = "";
		
		for(int i=0; i < id.length; i++) {
	         if(id[i] == 'a'|| id[i] == 'e'|| id[i] == 'i' || id[i] == 'o' || id[i] == 'u') {
	           vowel = vowel + id[i];
	         }
		}
		
		password = password + vowel;
		

		//System.out.println("The data is: "+first_n + "      "+last_n+"    "+dt+"     "+mob+"     "+idp+"     "+password);
	
		System.out.println("Congrats  " + first_n + "  your username is :  " +  first_n + " your password is :  " + password + "  please login immediately with the system generated credentials and change your password.......");
	}

}
