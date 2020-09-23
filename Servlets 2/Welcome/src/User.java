

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class User
 */
@WebServlet("/User")
public class User extends GenericServlet implements Servlet {

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("t1");
		String s2 = request.getParameter("p1");
		String s3 = request.getParameter("r1");
		String s4 = request.getParameter("loc");
		String s11 = request.getParameter("loc");
		//String s5 = request.getParameter("c1");
		//String s6 = request.getParameter("c2");
		//String s9 = request.getParameter("c3");
		//String s10 = request.getParameter("c4");
		String s7 = request.getParameter("d1");
		//String s8 = request.getParameter("tx1");
		out.println("Name:  "+s1+"<br>");
		out.println("Gender:  "+s3+"<br>");
		out.println("Location:  "+s4+"<br>");
		//out.println("Skill:  "+s5+"   "+s6+"   "+s9+"   "+s10);
		out.println("Birthday:  "+s7+"<br>");
		//out.println("Summary:  "+s8+"<br>");

		out.close();
	}

}
