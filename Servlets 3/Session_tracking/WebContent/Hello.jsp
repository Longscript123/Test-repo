<%

String name=request.getParameter("t1");
out.print("Hello.:"+name);
session.setAttribute("pp",name);
%>

<a href="Bye.jsp">visit</a>
