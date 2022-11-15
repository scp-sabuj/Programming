<?php
  include 'database_connect.php';
?>


<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="indexstyle.css">


<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- Bootstrap core CSS -->
<link href="bootstrap.min.css" rel="stylesheet">
<link href="style.css" rel="stylesheet">
<script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
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

    <div class="main content col-lg-9">
        <div class="tenderlst">
          <h4 class="tenerlst">Tender List</h4>
        </div>
        <div class="panel panel-default">
          <div class="panel-body">
            <table class="table table-striped table-hover">
              <tr>
                <th>No.</th>
                <th>Tender Id</th>
                <th>Tender Name </th>
                <th>Ministry</th>
                <th>Division</th>
                <th>End of Schedule</th>
                <th>Price of Schedule </th>
              </tr>

              <tbody>
                <?php
                  $sql="select * from tenders join divisions where tenders.division_id = divisions.division_id";
                  $res = mysqli_query($conn,$sql);
                  $count=0;
                  while($row = mysqli_fetch_array($res))
                  {
                    $ministry_id = $row['ministry_id'];
                    $sql1="select * from ministries where ministry_id = $ministry_id";
                    $res1 = mysqli_query($conn,$sql1);
                    $data = mysqli_fetch_array($res1);

                    $count++;
                ?>
                <tr>
                  <th><?php echo $count;?></th>
                  <th><?php echo $row['tender_no'];?></th>
                  <th><?php echo $row['tender_name'];?></th>
                  <th><?php echo $data['ministry_name'];?></th>
                  <th><?php echo $row['division_name'];?></th>
                  <th><?php echo $row['tender_closing_date'];?></th>
                  <th><?php echo $row['tender_price'];?></th>
                </tr>
                <?php } ?>
              </tbody>
                
            </table>
          </div>
        </div>
    </div>

    <div class="about-section col-lg-3" style="margin-top: 3%;">
      <h1>About</h1>
      <p>The E-tender system is a single web portal from where and through which PAs and PEs will be able to perform their procurement related activities using a dedicated secured web based dashboard. The e-GP system is hosted in E-tender Data Center at CPTU, and the e-GP web portal is accessible by the PAs and PEs through internet for their use.</p>
      
    </div>
</div>
</body>

<script>
     CKEDITOR.replace( 'editor1' );
 </script>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</html>
