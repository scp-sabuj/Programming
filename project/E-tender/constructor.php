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

    input[type=text]{
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

</style>
</head>

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

<body>
<div>
  <ul>
    <li><a href="tender.php">Tender</a></li>
    <li><a href="constructor.php">Profile</a></li>
    <li><a href="apply.php">Apply</a></li>
    <li><a href="edit_profile.php">Edit Profile</a></li>
    <li><a href="logout.php">Logout</a></li>
  </ul>

  <div class="container" >
    <form  method="" action="">
      <div class="form">
        <h2 align="center" style="color: black;">Profile Information</h2>

        <label for="psw"><b>Name</b></label>
        <input type="text" readonly="" value="<?php echo $data['user_name'];?>">

        <label for="uname"><b>Email</b></label>
        <input type="text" value="<?php echo $data['user_email'];?>" readonly="">

        <label for="psw"><b>Phone Number</b></label>
        <input type="text" value="<?php echo $data['user_mobile'];?>" readonly="">

        <label for="uname"><b>User Type</b></label>
        <input type="text" value="<?php echo $b;?>" readonly="">

        <label for="psw"><b>Status</b></label>
        <input type="text" value="<?php echo $a;?>" readonly="">
      </div>
    </form>
  </div>
</div>






</body>
</html>
