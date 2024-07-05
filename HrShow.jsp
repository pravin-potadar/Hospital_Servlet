
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HRork add data</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<style type="text/css">


@import url('https://fonts.googleapis.com/css2?family=Playwrite+AU+VIC:wght@100..400&display=swap');

.box1{
	  background: aquamarine;
	  padding: 30px;
}


.box1 h1{
	
  font-family: "Playwrite AU VIC", cursive;
  font-optical-sizing: auto;
  font-weight: <weight>;
  font-style: normal;
  

}

.sidebar  .col-2{

    background: aqua;
	height: 80vh;
}

.SideR a{
 margin-top: 30px;
}

 .navbar{
            list-style-type: none;
        }
.navbar li a{
            text-decoration: none;
            font-size: 20px;
            color: #000;
        }
.navbarBox ul li{
	margin-top: 30px;
	margin-right: 60px;
}



.SideL {
display: inline-block;
}


form{
margin-left: 280px;
}

form label {
	display: block;
	margin-left: 40px;
}

form  input{
 width: 70%;

}

[type=button]:not(:disabled), [type=reset]:not(:disabled), [type=submit]:not(:disabled), button:not(:disabled) {
    cursor: pointer;
    margin-top: 40px;
}

table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}


</style>





</head>
<body>


<div class=" text-center">
  <div class="row">
   <div class="box1">
   		 <h1> Hospital Mangement </h1>
   </div>
  </div>
</div>

<div class=" text">
  <div class="data">
  
  <div class = "sidebar row">
  	<div class = ".SideR col-2">
  	<!-- side bar right side  -->
  		  		  		
  		<div class="navbarBox">
        	<ul class="navbar">
            	<li class = "col-12"><a href="HrAdd.jsp">Add Doctor</a></li>
            	<li class = "col-12"><a href="HrUpdate.jsp">Update Doctor</a></li>
            	<li class = "col-12"><a href="HrDelete.jsp">Delete Doctor</a></li>
           	 	<li class = "col-12"><a href="HrShow.jsp">Show Data Doctor</a></li>
       	 	</ul>
   	 	</div>
  	</div>
  	<div class = ".SideL col-10">
  	 
  	 <!-- Data Of Left Side -->
  	
  		 <a href="DrshowAll">Show All Data</a>
  	 
  	 <table>
		<tr>
			<th> ID</th>
			<th> Name</th>
			<th> Contact</th>
			<th> Experience</th>
			<th> Degree</th>
			<th> Speciality</th>
			<th> Fee</th>
		</tr>

		<c:forEach items="${Drtlist}" var="dr">
			<tr>
				<td>${dr.id }</td>
				<td>${dr.name }</td>
				<td>${dr.contact }</td>
				<td>${dr.experience }</td>
				<td>${dr.degree }</td>
				<td>${dr.speciality }</td>
				<td>${dr.fee }</td>
			</tr>
		</c:forEach>

	</table>
  	
  	</div>
  </div>
  
  </div>
</div>



</body>
</html>