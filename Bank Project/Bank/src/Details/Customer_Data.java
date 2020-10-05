package details;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

	Customer_Pojo cust = new Customer_Pojo();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");  
         PrintWriter pw = response.getWriter();  
         
         cust.setF_name(request.getParameter("fName"));  
         cust.setL_name(request.getParameter("lName"));  
         // String email = request.getParameter("Email");
         cust.setMobile(request.getParameter("Mobile"));
         cust.setDob(request.getParameter("doB"));  
         cust.setId_proof(request.getParameter("id_Proof"));
         cust.setCibil(20);
         cust.setBalance(1000);
         cust.setPoints(0);
         
         // String country =request.getParameter("userCountry");  
         
         try
         {  
        	 Class.forName("com.mysql.cj.jdbc.Driver");
          	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_of_trust","root","Abhi@1110"); 
        	
          	if(conn!=null) {
        		System.out.println("Connected to database.....");
        	}
          	
              PreparedStatement ppst =conn.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?)");  
 
              ppst.setString(1,cust.f_name);
              ppst.setString(2,cust.l_name);
              ppst.setString(3, cust.mobile);
              ppst.setString(4,cust.dob);
              ppst.setString(5,cust.id_proof);
              ppst.setLong(6,(long) cust.cibil);
              ppst.setLong(7, (long) cust.balance);
              ppst.setLong(8, (long) cust.points);
 
              
              
              int q = ppst.executeUpdate();  
      		char[] first_name = cust.f_name.toCharArray();
      		
      		char[] last_name = cust.l_name.toCharArray();
      		
      		char[] mob = cust.mobile.toCharArray();
      		
      		char[] date = cust.dob.toCharArray();
      		
      		char[] id = cust.id_proof.toCharArray();
      		char[]pass = {first_name[first_name.length-1],last_name[0], mob[0], mob[2], mob[4], mob[6], mob[8], date[date.length-2], date[date.length-1],  };
      		
      		String password =String.valueOf(pass);
      		String vowel = "";
      		
      		for(int i=0; i < id.length; i++) {
      	         if(id[i] == 'a'|| id[i] == 'e'|| id[i] == 'i' || id[i] == 'o' || id[i] == 'u') {
      	           vowel = vowel + id[i];
      	         }
      		}
      		
      		password = password + vowel;
      		
      		if(q>0)
      		pw.println("<body background-color:#fdf5f6>"
      				+ "<div class=\"logo-print visible-print\" aria-hidden=\"true\">\r\n" + 
      				"	<img src=\"Images/BackGround.jpeg\" \r\n" + 
      				"	width=\"70\" height=\"50\" alt=\"BoT Bank of Trust\"></div>\r\n" + 
      				"	<div class=\"BoT-header-nav-top-message\">\r\n" + 
      				"	</div>"+"<fieldset style=\\\"width:30%;\\\">"+"<div align=\"center\">"+"<br><br><br>"+
      				"<p style=\"color:blue\">"
      				+ "<b>Congrats...   "+cust.f_name+" " +cust.l_name+"<br><br> </b>"
      				+ "You are Successfully Registered...</p>"
      				+ "<p style=\"color:Purple\">"
      				+ "Your logIn Credentials are...."+
      				"<br>"+"Username is :"+"<b><u>" +  cust.f_name + "</b></u><br>"+ "Password is :"+"<b><u>"+password+
      				"</b></u></p>"
      				+ "<p style=\"color:green\">"+"<br><br>"+
      				"<mark>Please login with the system generated credentials and change your password immediately</mark>.......</p>"+
      				"<a href=\"transaction.jsp\">Click here to Perform Transactions</a>");

      		
         }
         
         
   		 
         catch (Exception ex)
         {
        	 System.out.println("Error..");
              ex.printStackTrace();
         } 
         
         HttpSession session = request.getSession();
         session.setAttribute("user",cust.f_name);
        
         pw.close();  
         
    }  
}	