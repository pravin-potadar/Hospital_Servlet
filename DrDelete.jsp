<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DR Work add data</title>

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
            	<li class = "col-12"><a href="DRdata.jsp">Add Patient</a></li>
            	<li class = "col-12"><a href="DrUpdate.jsp">Update Patient</a></li>
            	<li class = "col-12"><a href="DrDelete.jsp">Delete Patient</a></li>
           	 	<li class = "col-12"><a href="DrShow.jsp">Show Data Patients</a></li>
       	 	</ul>
   	 	</div>
  	</div>
  	<div class = ".SideL col-10">
  	 
  	 <!-- Data Of Left Side -->
  	
  		<form action="Delete" method="get">
  				
  		<div class="msg">
  		 	
  		 	<span class="d-flex justify-content-center">${msg }</span>
  		 
  		</div>
  						
  			<label>ID</label>
  			<input type="text" name="id" placeholder="Enter Your ID">
  			
  			
  			<input type="submit" value="Delete Patient Data">
  			
  		</form>
  	
  	</div>
  </div>
  
  </div>
</div>



</body>
</html>