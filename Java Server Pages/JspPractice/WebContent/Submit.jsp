
<title>Product Information</title>

<jsp:useBean id = "e" class ="Form.Product"></jsp:useBean>
<jsp:setProperty property="id" name="e"/>
<jsp:setProperty property="name" name="e"/>
<jsp:setProperty property="unit" name="e"/>
<jsp:setProperty property="stock" name="e"/>
<jsp:setProperty property="qty" name="e"/>

These are the order details:<br><br>

Product ID: <jsp:getProperty property="id" name="e"/><br>
Product Name: <jsp:getProperty property="name" name="e"/><br>
Unit Price: <jsp:getProperty property="unit" name="e"/><br>
Available Stock: <jsp:getProperty property="stock" name="e"/><br>
Order Quantity: <jsp:getProperty property="qty" name="e"/><br>


<%
String id = request.getParameter("eid");
String name = request.getParameter("ename");
String des = request.getParameter("edes");
session.setAttribute("pp",id);
session.setAttribute("aa", name);
session.setAttribute("bb", des);
%>

<a href = "Emp.jsp">Click here to get employee details</a>