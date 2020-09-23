<%
String id = (String)session.getAttribute("pp");
String name = (String)session.getAttribute("aa");
String des = (String)session.getAttribute("bb");

out.print("Employee id is: "+id);
out.print("\n");
out.print("Employee name is: "+name);
out.print("Employee designation is: "+des);

%>