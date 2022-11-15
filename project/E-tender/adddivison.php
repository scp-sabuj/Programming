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
<?php
        
    if(isset($_REQUEST['submit']))
    {
      $name= $_REQUEST["name"];
      $ministry_id=$_REQUEST["ministry"];
      $status='1';
      $sql = "INSERT INTO `divisions`(`division_name`, `ministry_id`, `division_status`) VALUES ('$name','$ministry_id','$status')";
      mysqli_query($conn,$sql);
      header("location: admindivison.php");
    }
?>
<body>
<div>
  <div class="container">
      <form action="adddivison.php" style="border:1px solid #ccc">
        <div class="form">
          <h1 align="center">Create Divison</h1>
          
          <label for="names"><b>Name</b></label>
          <input type="text" placeholder="Divison Name" name="name" required>

          <label>Select Ministry..</label>
          <div>
              <select class="form-control text" name="ministry">
              <?php 
                  // select option value
                  $sql="SELECT * FROM `ministries` ORDER BY `ministry_id` ";
                  $res = mysqli_query($conn,$sql);
                  while($row = mysqli_fetch_array($res))
                  {
              ?>
              <option value="<?php echo $row['ministry_id'];?>"><?php echo $row['ministry_name'];?></option>
              <?php }?>
              </select>
         </div>

          <div class="clearfix">
            <button type="submit" class="signupbtn" name="submit">Create</button>
          </div>
        </div>
      </form>
  </div>
</div>
</body>
</html>
