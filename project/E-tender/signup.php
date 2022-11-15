<?php
  include 'database_connect.php';
?>


<?php
    if(isset($_REQUEST['submit']))
    {
      $name= $_REQUEST["name"];
      $email=$_REQUEST["email"];
      $phone=$_REQUEST["phone"];
      $type=$_REQUEST["type"];
      $password=$_REQUEST["psw"];
      $repeat_password=$_REQUEST["repeat"];

      if ($password != $repeat_password) {
        header("location: signup.php");
        // echo '<p style="color:red;">password and confirm password should be same</p>';
      }
      else{
        $sql = "INSERT INTO `users`(`user_name`, `user_email`, `user_mobile`,`user_type`, `user_password`) VALUES ('$name','$email','$phone', '$type', '$password')";
        mysqli_query($conn,$sql);
        if ($type == 1) {
          header("location: normal_user.php");
        }
        elseif ($type == 2) {
          header("location: constructor.php");
        }
        elseif ($type == 3) {
          header("location: division_dashboard.php");
        }
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

input[type=text], input[type=password], input[type=email] {
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
.form-control{
  width: 100%;
  /*height: 0%;*/
  padding: 2%;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
  

}
</style>
</head>






<body>
<div>
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

  <div class="container">
    <form action="signup.php" style="border:1px solid #ccc" method="post">
      <div class="form">
          <h1 align="center">Sign Up</h1>
          
          <label for="names"><b>Name</b></label>
          <input type="text" placeholder="Enter Name" name="name" required>

          <label for="email"><b>Email</b></label>
          <input type="email" placeholder="Enter Email" name="email" required>

          <label for="contact"><b>Contact Number</b></label>
          <input type="text" placeholder="Enter Contact Number" name="phone" required>

          <label ><b>Register As...</b></label>
          <div >
            <select class="form-control text" required="" name="type">
              <option value="1">User</option>
              <option value="2">Constructor</option>
              <option value="3">Divisional Office</option>
            </select>
          </div>
          <label for="psw"><b>Password</b></label>
          <input type="password" placeholder="Enter Password" name="psw" required>

          <label for="psw-repeat"><b>Repeat Password</b></label>
          <input type="password" placeholder="Repeat Password" name="repeat" required>
          

          <div class="clearfix">
            <button type="submit" class="signupbtn" name="submit">Sign Up</button>
          </div>
    </div>
    </form>
  </div>

</div>
</body>
</html>
