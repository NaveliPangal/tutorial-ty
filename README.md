<!DOCTYPE html>
<html lang="en" xmlns:th="https://www.thymeleaf.org">
	<head>
		<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	</head>
	<body style ="background-color: lightgrey;">
		<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <a class="navbar-brand" href="#">Registration Form</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      
     </ul>
      

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit" >Login</button>
       <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Sign up</button>
    </form>
  </div>
</nav>	
                                             <!--navbar-->

                                              <!--form-->
                    <div class ="container p-2">
						<div class ="row">
							<div class="col-md-7 offset-md-3">
								<div class ="card">
									<div class="card-body">
										<h2 style="text-align: center;">Registration Form</h2>
										
							<!--do something for popup msg-->
										
										<div id="success-message" th:if"{session.successMessage}" class="alert alest-success" role="alert">
											<p th:text="${session.successMessage}">
										</div>
										
<form th:action="@{/register}" th:object="${user}" method="post">
											
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="fullname" placeholder="Enter name" required>
    <!--<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>-->
  </div>
   <div class="form-group">
    <label for="exampleInputEmail1">Address</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="address" placeholder="Enter address" required>
    
  </div>
 
 <div class="form-group">
    <label for="exampleInputEmail1">Gender</label>
    <div class="form-check">
    <input class="form-check-input position-static" type="radio" name="gender" id="blankRadio1" value="Male" aria-label="..." required>
    <label class="form-check-lable" form="inlineRadio2">Male</label>
  </div>
	
  <div class="form-check">
   <input class="form-check-input position-static" type="radio" name="gender" id="blankRadio1" value="Female" aria-label="..." required>
   <label class="form-check-lable" form="inlineRadio2">Female</label>
  </div>
  </div>


   <div class="form-group">
    <label for="exampleInputEmail1">DOB</label>
    <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="dob" placeholder=" " required>
    <!--<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>-->
  </div>
   <div class="form-group">
    <label for="exampleInputEmail1">Email</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email" placeholder=" " required>
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password" required>
  </div>
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1" required>
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
		
			<script th:scr="@{/js/script.js}"></script>
				
										
									</div>
								</div>
							</div>
						</div>
					</div>
                                              
    
                                               <!--form-->
	</body>
</html>
