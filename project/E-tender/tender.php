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
    .panel-body{
      width: 100%;
      padding-left: 10%;
      padding-bottom: 50px;
      padding-right: 10%;
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

  <div class="tenderlst">
      <h4 class="tenerlst" align="center" style="padding-top: 30px;">Applied Tender List</h4>
  </div>
  <div class="panel-body">
    <table class="table table-striped table-hover">
        <tr>
          <th>Serial No</th>
          <th>Tender Id</th>
          <th>Tender Name </th>
          <th>Tender Status</th>
        </tr>
        <tbody>
          <?php
            $sql="select * from users_tenders join tenders where users_tenders.tender_id = tenders.tender_id";
            $res = mysqli_query($conn,$sql);
            $count=0;
            while($row = mysqli_fetch_array($res))
            {
              $user_id = $row['user_id'];
              $email=$_SESSION['email'];
              $sql1="select * from users where user_email='$email'";
              $res1=mysqli_query($conn,$sql1);
              $data = mysqli_fetch_array($res1);
              if ($data['user_id'] != $user_id) {
                  continue;
              }

              $status=$row['user_tender_status'];
              if ($status == '1') {
                  $a='Permitted';
              }else{
                  $a='Not Permitted';
              }
              $count++;
          ?>
          <tr>
            <th><?php echo $count;?></th>
            <th><?php echo $row['tender_no'];?></th>
            <th><?php echo $row['tender_name'];?></th>
            <th><?php echo $a;?></th>
          </tr>
          <?php } ?>
      </tbody>
    </table>
  </div>
</div>






</body>
</html>
