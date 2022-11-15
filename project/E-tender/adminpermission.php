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
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Applied List</title>
    <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">
    <link href="style.css" rel="stylesheet">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
    <style>
      a.btn:hover {
     -webkit-transform: scale(1.1);
     -moz-transform: scale(1.1);
     -o-transform: scale(1.1);
 }
 a.btn {
     -webkit-transform: scale(0.8);
     -moz-transform: scale(0.8);
     -o-transform: scale(0.8);
     -webkit-transition-duration: 0.5s;
     -moz-transition-duration: 0.5s;
     -o-transition-duration: 0.5s;
     margin-left: 10px;
 }

    </style>
  </head>

<?php
    if(isset($_REQUEST['delete']))
    {
      $id= $_REQUEST["id"];
      $sql = "DELETE FROM `users_tenders` WHERE user_tender_id='$id'" ;
      mysqli_query($conn,$sql);
    }

    if(isset($_REQUEST['status']))
    {
      $id= $_REQUEST["id"];
      $status= $_REQUEST["t_status"];
      if ($status == '1') {
          $sql ="UPDATE `users_tenders` SET `user_tender_status`='0' WHERE `user_tender_id`='$id'";
          mysqli_query($conn,$sql);
      }
      else{
          $sql ="UPDATE `users_tenders` SET `user_tender_status`='1' WHERE `user_tender_id`='$id'";
          mysqli_query($conn,$sql);
      }
    }
?>

  <body>

    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Admin</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Welcome</a></li>
            <li><a href="logout.php">Logout</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
    <div class="tenderlst">
      <h4 class="tenerlst">Applied Tender List</h4>
    </div>
    <div class="panel panel-default">
        <div class="panel-body">
          <table class="table table-striped table-hover">
              <tr>
                <th>Serial No</th>
                <th>Tender Id</th>
                <th>Tender Name </th>
                <th>User Name</th>
                <th>Tender Status</th>
                <th>Action</th>
              </tr>
              <tbody>
                <?php
                  $sql="select * from users_tenders join users where users_tenders.user_id = users.user_id";
                  $res = mysqli_query($conn,$sql);
                  $count=0;
                  while($row = mysqli_fetch_array($res))
                  {
                    $tender_id = $row['tender_id'];
                    $sql1="select * from tenders where tender_id = $tender_id";
                    $res1 = mysqli_query($conn,$sql1);
                    $data = mysqli_fetch_array($res1);

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
                  <th><?php echo $data['tender_no'];?></th>
                  <th><?php echo $data['tender_name'];?></th>
                  <th><?php echo $row['user_name'];?></th>
                  <th><?php echo $a;?></th>
                  <th class="action">
                    <form method="post" action="adminpermission.php">
                      <input type="hidden" name="id" value="<?php echo $row['user_tender_id'];?>">
                      <input type="hidden" name="t_status" value="<?php echo $status;?>">
                      <button type="submit" class="btn btn-primary a-btn-slide-text btn-sm" name="delete">Delete</button>
                      <button type="submit" class="btn btn-primary a-btn-slide-text btn-sm" name="status">Change Status</button>
                    </form>
                  </th>
                </tr>
                <?php } ?>
            </tbody>
          </table>
        </div>
    </div>
      









    <!-- Modals -->


  <script>
     CKEDITOR.replace( 'editor1' );
 </script>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
