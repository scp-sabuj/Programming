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
    <title>Admin Panel</title>
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
      $sql = "DELETE FROM `subdivisions` WHERE subdivision_id='$id'" ;
      mysqli_query($conn,$sql);
    }

    if(isset($_REQUEST['status']))
    {
      $id= $_REQUEST["id"];
      $status= $_REQUEST["t_status"];
      if ($status == '1') {
          $sql ="UPDATE `subdivisions` SET `subdivision_status`='0' WHERE `subdivision_id`='$id'";
          mysqli_query($conn,$sql);
      }
      else{
          $sql ="UPDATE `subdivisions` SET `subdivision_status`='1' WHERE `subdivision_id`='$id'";
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




<div class="panel panel-default">
  <div class="panel-heading">
    <h3 class="panel-title">Subdivison List</h3>
    <a href="addsubdivison.php" class="btn btn-primary a-btn-slide-text" style="float: right;">
      <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
      <span><strong>Add</strong></span>            
    </a>
    
  </div>
  <div class="panel-body">
    <table class="table table-striped table-hover">
      <thead>
        <tr>
          <th>Serial No</th>
          <th>Subdivision Neme</th>
          <th>Division Name</th>
          <th>Status</th>
          <th>Action</th>
        </tr>
      </thead>
      <tbody>
        <?php
          $sql="select * from subdivisions join divisions where subdivisions.division_id = divisions.division_id";
          $res = mysqli_query($conn,$sql);
          $count=0;
          while($row = mysqli_fetch_array($res))
          {
            $status=$row['subdivision_status'];
            if ($status == '1') {
                $a='Active';
            }else{
                $a='Inactive';
            }
            $count++;
        ?> 
        <tr>
          <th><?php echo $count;?></th>
          <th><?php echo $row['subdivision_name'];?></th>
          <th><?php echo $row['division_name'];?></th>
          <th><?php echo $a;?></th>

          <th class="action">
            <form method="post" action="adminsubdivison.php">
              <input type="hidden" name="id" value="<?php echo $row['subdivision_id'];?>">
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
