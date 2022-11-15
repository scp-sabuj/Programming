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
<script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
<link href="bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="indexstyle.css">

<style >
    body {font-family: Arial, Helvetica, sans-serif;}
    form {border: 3px solid #f1f1f1;}

    input[type=text], input[type=email]{
      width: 100%;
      padding: 7px 0px 10px 10px;
      margin: 2px 0;
      color: black;
      display: inline-block;
      border: 1px solid #ccc;
      box-sizing: border-box;
    }
    label{
      padding-left: 5px;
      color: black;
    }

    
    .user-title{
      text-align: center;
     }
    .container {
      width: 100%;
      padding-top: 5%;
      padding-left: 22%;
      padding-bottom: 50px;
      padding-right: 22%;

    }
    .form{
      padding-top: 0%;
      padding-left: 5%;
      padding-right: 5%;
      padding-bottom: 5%;
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

</style>
</head>

<?php
    if(isset($_REQUEST['submit']))
    {
      $id= $_REQUEST["id"];
      $name= $_REQUEST["name"];
      $email= $_REQUEST["email"];
      $phone= $_REQUEST["phone"];

      $sql ="UPDATE `users` SET `user_name`='$name', `user_email`='$email', `user_mobile`='$phone' WHERE `user_id`='$id'";
      mysqli_query($conn,$sql);

      $_SESSION['email']=$email;
      header("location: constructor.php");
    }
?>

<body>
<div>
  <ul>
    <li><a href="tender.php">Tender</a></li>
    <li><a href="constructor.php">Profile</a></li>
    <li><a href="apply.php">Apply</a></li>
    <li><a href="edit_profile.php">Edit Profile</a></li>
    <li><a href="logout.php">Logout</a></li>
  </ul>

<?php
    $email=$_SESSION['email'];
    $sql="select * from users where user_email='$email'";
    $res=mysqli_query($conn,$sql);
    $data = mysqli_fetch_array($res);
    //status check
    $status=$data['user_status'];
    if ($status == '1') {
        $a='Active';
    }else{
        $a='Inactive';
    }
    //user type check
    $status=$data['user_type'];
    if ($status == '1') {
        $b='Normal User';
    }elseif($status == '2'){
        $b='Constructor';
    }elseif($status == '3'){
        $b='divisional Office';
    }elseif($status == '4'){
        $b='Admin';
    }
?>


  <div class="container" >
    <form  method="post" action="edit_profile.php">
      <div class="form">
        <h2 align="center" style="color: black;">Edit Profile Information</h2>

        <input type="text" name="id" value="<?php echo $data['user_id'];?>">

        <label for="psw"><b>Name</b></label>
        <input type="text" name="name" value="<?php echo $data['user_name'];?>">

        <label for="uname"><b>Email</b></label>
        <input type="email" name="email" value="<?php echo $data['user_email'];?>">

        <label for="psw"><b>Phone Number</b></label>
        <input type="text" name="phone" value="<?php echo $data['user_mobile'];?>">

        <div class="clearfix">
            <button type="submit" class="signupbtn" name="submit">Edit Profile</button>
          </div>
      </div>
    </form>
  </div>
</div>






</body>
</html>
