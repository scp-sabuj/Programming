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
<html lang="en">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="indexstyle.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User Comment</title>
    <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">
    
    
  </head>
  <style>
    body{
      background-size:cover;
    }
    hr{
      background: white;  
    }
    input[type=text]{
      width: 100%;
      padding: 7px 0px 10px 10px;
      margin: 2px 0;
      color: black;
      display: inline-block;
      border: 1px solid #ccc;
      box-sizing: border-box;
    }
    .contact-form{
      width: 50%;
      background:rgba(0,0,0, .6);
      color:white;
      margin-top: 10%;
      padding-top: 1%;
      box-shadow: 0px 0px 10px 3px grey;
    }
  </style>

<?php
    date_default_timezone_set("Asia/Dhaka");
    if(isset($_REQUEST['submit']))
    {
      $tender_id= $_REQUEST["tender_id"];
      $user_id=$_REQUEST["user_id"];
      $status='0';
      $result='1';
      $date = date('Y-m-d H:i:s');

      $sql = "INSERT INTO `users_tenders`(`user_id`, `tender_id`, `user_tender_result`, `user_tender_date`, `user_tender_status`) VALUES ('$user_id','$tender_id','$result','$date','$status')";
      mysqli_query($conn,$sql);
      header("location: apply.php");
    }
?>

  <body>
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
      ?>

      <div class="container contact-form">
          <h1 align="center">Drop Schedule</h1>
          <hr>

          <div class="row">
            <div class="col-md-12">
              <form method="post" action="apply.php">
                <div class="form-group">
                  <input type="hidden" name="user_id" value="<?php echo $data['user_id'];?>">
                  <label>Tender Id</label>
                  <input type="text" name="tender_id" class="form-control">
                </div>
                <div class="form-group">
                  <button class="btn btn-primary btn-block" type="submit" name="submit">Send</button>
                </div>
              </form>
            </div>
          </div>
      </div>
    </body>
  </html>