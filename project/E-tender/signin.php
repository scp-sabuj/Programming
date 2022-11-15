<?php
  include 'database_connect.php';
?>

<?php
        
    if(isset($_POST['submit']))
    {
      $email=$_POST['email'];
      $password=$_POST['psw'];
      $sql="select * from users where user_email='$email' AND user_password='$password'";
      $res=mysqli_query($conn,$sql);
      $data = mysqli_fetch_array($res);
      $type=$data['user_type'];
      
      if($type==1)
      {
        session_start();
        $_SESSION['email']=$email;
        $_SESSION['password']=$password;
        session_write_close();
        header("location: normal_user.php");
      
      }
      else if($type==2)
      {
        session_start();
        $_SESSION['email']=$email;
        $_SESSION['password']=$password;
        session_write_close();
        header("location: constructor.php");
      }
      else if($type==3)
      {
        session_start();
        $_SESSION['email']=$email;
        $_SESSION['password']=$password;
        session_write_close();
        header("location: division_dashboard.php");
      }
      else if($type==4)
      {
        session_start();
        $_SESSION['email']=$email;
        $_SESSION['password']=$password;
        session_write_close();
        header("location: admin.php");
      }
      else
      {
        header("location: signin.php");
        echo '<p style="color:red;">Invalid email or password</p>';
      }
      
    }
?>


<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="indexstyle.css">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=email], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.container {
	width: 50%;
	padding-top: 10%;
	padding-left: 25%;
  	

}
.form{
	padding-left: 5%;
	padding-right: 5%;
	padding-bottom: 5%;
}

</style>
</head>
<body>
<div >

  <ul>
    <li><a href="index.php">E-Tender</a></li>
    <li><a href="signin.php">Sign In</a></li>
    <li><a href="signup.php">Sign Up</a></li>
    <li class="dropdown">
      <a href="javascript:void(0)" class="dropbtn">Tender</a>
      <div class="dropdown-content">
        <a href="index.php">All</a>
        <a href="indexgovt.php">Govt</a>
        <a href="indexnongovt.php">Non Govt </a>
    <li><a href="indexcomment.php">Comment</a></li>
      </div>
    </li>
  </ul>
	
  <div class="container" >
  	
  	<form  method="post" action="signin.php">
  		<div class="form">
	  		<h2 align="center">Login</h2>

			<label for="uname"><b>Email</b></label>
			<input type="email" placeholder="Enter Email" name="email" required>

			<label for="psw"><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="psw" required>
			    
			<button type="submit" name="submit">Login</button>
		</div>
    </form>
  </div>
	
</div>
</body>
</html>
