<!DOCTYPE html>
<html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}

/* Full-width input fields */
input[type=text], input[type=password], input[type=email], input[type=date] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}


/* Add padding to container elements */
.container {
  width: 50%;
  padding-top: 5%;
  padding-left: 25%;
}

.form{
  padding-left: 5%;
  padding-right: 10%;
  padding-bottom: 5%;
}

.form-control{
  width: 100%;
  padding: 15px;
  padding-right: 2%;
  margin: 5px 0 5px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
  

}

</style>
<body>
<div>
  <div class="container">
    <form action="/action_page.php" style="border:1px solid #ccc">
      <div class="form">
        <h1>Create Tender</h1>

        <label for="names"><b>Name</b></label>
        <input type="text" placeholder="Tender Name" name="name" required>

        <label for="divisonal"><b>Divisonal Office</b></label>
        <input type="email" placeholder="Enter Email" name="email" required>

        <label for="price"><b>Price Of Schedule</b></label>
        <input type="text" placeholder="Enter Price" name="price" required>

        <label for="workname"><b>Name of Work</b></label>
        <input type="text" placeholder="Enter Work" name="work_name" required>
       
        <label for="tenderclosing"><b>Tender Closing Date</b></label>
        <input type="Date" placeholder="Enter Date" name="tender_closing_date" required>

        <label><b>Ministry..</b></label>
        <div>
          <select class="form-control text" name="ministry">
            <option value="">1</option>
            <option value="">2</option>
            <option value="">3</option>
          </select>
        </div>

        <label for="tendersource"><b>Tender Source</b></label>
        <input type="text" placeholder="Enter Source" name="tenderclosing" required>

        <label><b>Divison..</b></label>
        <div>
          <select class="form-control text">
            <option value="">1</option>
            <option value="">2</option>
            <option value="">3</option>
          </select>
        </div>

        <label><b>Subdivison..</b></label>
        <div>
          <select class="form-control text">
            <option value="">1</option>
            <option value="">2</option>
            <option value="">3</option>
          </select>
        </div>

        <label><b>Location..</b></label>
        <div>
          <select class="form-control text">
            <option value="">1</option>
            <option value="">2</option>
            <option value="">3</option>
          </select>
        </div>

        <label><b>Type..</b></label>
        <div>
          <select class="form-control text">
            <option value="">1</option>
            <option value="">2</option>
            <option value="">3</option>
          </select>
        </div>

        <label>Nature..</label>
        <div>
          <select class="form-control text">
            <option value="">1</option>
            <option value="">2</option>
            <option value="">3</option>
          </select>
        </div>

        <label>Mathod..</label>
        <div>
          <select class="form-control text">
            <option value="">1</option>
            <option value="">2</option>
            <option value="">3</option>
          </select>
        </div>

        <label>Entity..</label>
        <div>
          <select class="form-control text">
            <option value="">1</option>
            <option value="">2</option>
            <option value="">3</option>
          </select>
        </div>

        <label>Qualification..</label>
        <div>
          <select class="form-control text">
            <option value="">1</option>
            <option value="">2</option>
            <option value="">3</option>
          </select>
        </div>

        <form class="md-form" action="#">
          <div class="file-field">
            <div class="btn btn-primary btn-sm float-left">
              <span>Choose files</span>
              <input type="file" multiple>
            </div>
            <div class="file-path-wrapper">
              <input class="file-path validate" type="text" placeholder="Upload one or more files">
            </div>
          </div>
        </form>
        
        <div>
          <button type="submit" class="signupbtn">Create</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body>
</html>
