<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background-color:#fdf5f6>
<form action="Transfer" method="post">
   <div class="logo-print visible-print" aria-hidden="true">
	<img src="Images/BackGround.jpeg" 
	width="170" height="150" alt="BoT Bank of Trust"></div>
	<div class="BoT-header-nav-top-message">
	</div> 
  
      <div align="center">
         <fieldset style="width:40%;">
            <h2 align="center">Money Transfer</h2><hr>
            <table>
               <tr>
                  <td>Nature of Transfer:</td>
                  <td><input type="radio" name="b1" value ="same" required />Same Bank<input type="radio" name="b1" value ="different" required />Different Bank</td>
               </tr>
               <tr>
                  <td>Type of Transaction:</td>
                  <td><input type="radio" name="b2" value ="deposit" required />Deposit<input type="radio" name="b2" value ="withdraw" required />Withdraw</td>
               </tr>
               <tr>
                  <td>Enter the amount:</td>
                  <td><input type="text" name="amount" required /></td>
               </tr>  
                   <tr>
                  <td><input type="reset" value="Reset"/></td>
                  <td><input type="submit" name = submit value="Submit"/></td>
               </tr>
            </table>
         </fieldset>  
      </form>
   </body>  
</html>