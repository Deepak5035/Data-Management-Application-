<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
       <head> 
            <meta charset="ISO-8859-1">
               <title>PHONE BOOK </title>

<link
	href="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"
	rel="stylesheet" type="text/css">

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>

<script
	src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js">
</script>

<script>

$(document).ready(function() {
    $('#contactTbl').DataTable( {
        "pagingType": "full_numbers"
    } );
} );
    function deleteContact(){
          return confirm("are you sure,want to delete?");
        }
</script>

      </head>
<p>
	<font color="red">${msg}</font>
</p>

<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

/* #customers tr:hover {background-color: #ddd;} */

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
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


<body >




	<h1 id="customers" align="center">PHONE BOOK RECORDS </h1>
	<table id="customers">
		<thead>
			<tr>
				<th>S.NO</th>
				<th>Name</th>
				<th>Email</th>
				<th>PH.NO</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${contacts}" var="c" varStatus="index">
				<tr>
					<td>${index.count }</td>
					<td>${c.contactName}</td>
					<td>${c.contactEmail}</td>
					<td>${c.contactNumber}</td>
					<td><a href="editContact?cid=${c.contactId}">Edit</a> 
					<a href="deleteContact?cid=${c.contactId}" onclick="deleteContact()">Delete</a></td>

				</tr>
			</c:forEach>
		</tbody>
		
	</table>
<a href="addContact">Add More Data</a>
</body>
</html>