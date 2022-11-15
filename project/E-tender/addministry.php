<?php
  include 'database_connect.php';
  session_start();
  if(!isset($_SESSION['email']) || !isset($_SESSION['password']))
  {
    unset($_SESSION['email']);
    unset($_SESSION['password']);
    header("location: index.php");
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

</style>
</head>

<?php
    if(isset($_POST['submit']))
    {
      $name= $_REQUEST["name"];
      $ministry_status= '1';
        $sql = "INSERT INTO `ministries`(`ministry_name`,`ministry_status`) VALUES ('$name','$ministry_status')";
        mysqli_query($conn,$sql);
        header("location: adminministry.php");
    }
?>
<body>
<div>
  <div class="container">
    <form action="addministry.php" method="post" style="border:1px solid #ccc">
      <div class="form">
        <h1>Create Ministry</h1>
        
        <label for="names"><b>Name</b></label>
        <input type="text" placeholder="Ministry Name" name="name" required>

        <div >
          <button type="submit" class="signupbtn" name="submit">Create</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body>
</html>
