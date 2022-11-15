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
    <title>Admin panel</title>
    <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">
    <link href="style.css" rel="stylesheet">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  </head>
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
          <button type="button" class="btn btn-dark"data-toggle="modal" data-target="#reports">Reports</button>

          <div class="container">
        </div><!--/.nav-collapse -->
      </div>
    </nav>



    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-3">
            <div class="list-group">
              <a href="admin.php" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Dashboard
              </a>

              <a href="adminuser.php" class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> User<span class="badge"></span></a>

              <a href="admincomment.php" class="list-group-item"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Comment <span class="badge"></span></a>

              <a href="admintender.php" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Tender  <span class="badge"></span></a>

              <a href="adminministry.php" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Ministries  <span class="badge"></span></a>

              <a href="admindivison.php" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Devision <span class="badge"></span></a>

              <a href="adminsubdivison.php" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Subdivision  <span class="badge"></span></a>

              <a href="addtender.php" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Add Tender <span class="badge"></span></a>
              
              <a href="adminpermission.php" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Permission <span class="badge"></span></a>
            </div>
          </div>


          <div class="col-md-9">
            <!-- Website Overview -->
            <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">Overview</h3>
              </div>
              <div class="panel-body">
                <div class="col-md-3">
                  <div class="well dash-box">
                    <h2><span class="glyphicon glyphicon-user" aria-hidden="true"></span> 203</h2>
                    <h4>Users</h4>
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="well dash-box">
                    <h2><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> 12</h2>
                    <h4>Tender</h4>
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="well dash-box">
                    <h2><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> 33</h2>
                    <h4>Devision</h4>
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="well dash-box">
                    <h2><span class="glyphicon glyphicon-stats" aria-hidden="true"></span> 55</h2>
                    <h4>Ministries</h4>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>



<!-- Button to Open the Modal --><!-- The Modal -->
  <div class="modal" id="reports">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h1 class="modal-title">Tender Reports: </h1>
          <button type="button" class="close" data-dismiss="modal">×</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          <h5>Divisonal Officer Reports</h5>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>
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
