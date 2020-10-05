package details;

import details.Customer_Data;

import java.io.IOException;
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


@WebServlet("/Transfer")
public class Transfer extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter pw1 = response.getWriter();
        
        
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");
        
        
        //String user =  request.getParameter("user");
        String transfer =  request.getParameter("b1"); 
        String transaction =  request.getParameter("b2");
        int cash =  Integer.parseInt(request.getParameter("amount"));
        
          		
  		try
        {  
       	 Class.forName("com.mysql.cj.jdbc.Driver");
         	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_of_trust","root","Abhi@1110"); 
       	
         	if(conn!=null) {
         		System.out.println("Connection to DB successful..");
       	}
         	
         	Statement stmt = conn.createStatement();
         	ResultSet rs = stmt.executeQuery("SELECT Balance,CIBIL FROM registration WHERE first_name = '"+user+"'");
            
         	rs.next();
     		float balance1 = rs.getFloat(1);
     		System.out.println(balance1);
     		float balance2 = 0;
     		float cibil = rs.getFloat(2);
     		
     		System.out.println("This...1234     "+cibil);
     		
     		if(transfer.equals("same") ) {
     			if(transaction.equals("deposit")) {
     				balance2 = balance1 + cash;
     			}

     			if(transaction.equals("withdraw")) {
     				balance2 = balance1 - cash;
     			}
     		}

     		if(transfer.equals("different")) {
     			if(transaction.equals("deposit")) {
     				if(1000<=cash && cash <=9999){
     					balance2 = (float) (balance1 + (cash - (cash*0.35)));
     				}

     				if(10000<=cash && cash <=99909){
     					balance2 = (float) (balance1 + (cash - (cash*0.27)));
     				}
     			}

     			if(transaction.equals("withdraw")) {
     				if(1000<=cash && cash <=9999){
     					balance2 = (float) (balance1 - (cash*1.35));
     				}

     				if(10000<=cash && cash <=99909){
     					balance2 = (float) (balance1 - (cash*1.27));
     				}
     			}
     		}
     		
     		if(balance2 != balance1) {
     			cibil += 7.5;
     			//System.out.println("cibil++");
     		}else {
     			cibil -= 18.75;
     		}
     		
     		//System.out.println(balance2+"sdfff");
         	stmt.executeUpdate("UPDATE registration SET Balance = "+ balance2 +", CIBIL = "+ cibil +" WHERE first_name = '"+user+"'");

     		
     			pw1.println("<body background-color:#fdf5f6>"
     	  				+ "<div class=\"logo-print visible-print\" aria-hidden=\"true\">\r\n" + 
     	  				"	<img src=\"Images/BackGround.jpeg\" \r\n" + 
     	  				"	width=\"70\" height=\"50\" alt=\"BoT Bank of Trust\"></div>\r\n" + 
     	  				"	<div class=\"BoT-header-nav-top-message\">\r\n" + 
     	  				"	</div>"+"<fieldset style=\\\"width:30%;\\\">"+"<div align=\"center\">"+"<br><br><br>"+
     	  				"<p style=\"color:blue\">"
     	  				+ "<b>Transaction Successful...   Your updated balance is :  $" +balance2+"<br><br> </b>"+
     	  				"<a href=\"transaction.jsp\">Click here to Perform Another Transactions</a>");
        }
  		
        catch (Exception ex)
        {
       	 System.out.println("Error..");
             ex.printStackTrace();
        }
  		
	}

}
