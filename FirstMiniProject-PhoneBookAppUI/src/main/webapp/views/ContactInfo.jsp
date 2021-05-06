<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%--  <%@ page isELIgnored="false" %> --%>
<!DOCTYPE html>
<html>
     <head>
        <meta charset="ISO-8859-1">
           <title>Enter Records</title>
           
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 50%;
}

#customers td, #customers th {
  
  border: 5px solid #ddd;
  padding: 10px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 25px;
  padding-bottom: 15px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}

#div-1{
style="width: 50%; padding: 12px 10px; margin: 20px 0;display: inline-block;
	border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box; border-radius: 5px;
	background-color: #f2f2f2; padding: 10px;"
}

a:link, a:visited {
  background-color: #f44336;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: red;
}

</style>
           
           
</head>


<body style="background-color: black">
   
   <div id="div-1" class="mb-3"> 
	
	<form:form action="saveContact" modelAttribute="contact" method="POST">

		<h2>Welcome To Phone Dictionary</h2>
		<p>
			<font color="green">${sucessMsg}</font>
		</p>
		<p>
			<font color="red">${errorMsg}</font>
		</p>

		<table id="customers">
			<tr>
				<form:hidden path="contactId" />
				
				<td>ContactName::</td>
				<td><form:input path="contactName" placeholder="Enter Name" /></td>
			</tr>

			<tr>
				<td>Contact Email::</td>
				<td><form:input path="contactEmail" placeholder="name@example.com" /></td>
			</tr>

			<tr>
				<td>ContactNo::</td>
				<td><form:input path="contactNumber" placeholder="Enter Contact" /></td>
			</tr>

			<tr>
				<td><input id="rest" style="width: 15%;background-color: #4CAF50;color: white;
	                               padding: 14px 20px;margin: 8px 0;border: none;
	                               border-radius: 4px;cursor: pointer;background-color: #45a049;
	                               type="reset" value="Reset" /></td>
				<td ><input id="rest" style="width: 30%;background-color: #4CAF50;color: white;
	                               padding: 14px 20px;margin: 8px 0;border: none;
	                               border-radius: 4px;cursor: pointer;background-color: #45a049;"          
                                   type="submit" value="Submit" /></td>
			</tr>

		</table>
		
		<a href="viewContact">ViewAllContact</a>

	</form:form>
</div>
</body>
</html>