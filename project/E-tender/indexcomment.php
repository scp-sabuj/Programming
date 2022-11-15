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

    .contact-form{
      background:rgba(0,0,0, .6);
      color:white;
      margin-top: 100px;
      padding: 20px;
      box-shadow: 0px 0px 10px 3px grey;
    }
    </style>
    <body>
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


      <div class="container contact-form">
  <h1>Opinion</h1>
  <hr>

  <div class="row">
   
       

       <div class="col-md-6">
        
         <div class="form-group">
          <label>Tender Id</label>
          <input type="text" class="form-control">
         </div>

         

         <div class="form-group">
          <label>Massage</label>
          <textarea  class="form-control" rows="7"></textarea>
         </div>

         <div class="form-group">
          <button class="btn btn-primary btn-block">Send</button>
         </div>

       </div>

    </div>

</div>
    </body>
    </html>