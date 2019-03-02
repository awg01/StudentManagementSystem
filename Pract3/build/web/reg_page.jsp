<!DOCTYPE html>
<html lang="en" dir="ltr">

  <head>
    <meta charset="utf-8">
    <link href="styles.css" rel="stylesheet" type="text/css"/>
    <title>Registration Page</title>

    <script>
    var stateObject = {
      "Pune":
       {
         "Pune City":["Keshavnagar-Mundwa", "Pune Municipal Corporation", "Kirkee Cantonment Board", "Pune Cantonment Board"],
         "Haveli":["H1"],
         "Khed":["K1", "K2"],
         "Baramati":["B1", "B2"],
         "Junnar":["J1", "J2"],
         "Shirur":["S1", "S2"],
         "Indapur":["I1", "I2"],
         "Daund":["D1", "D2", "D3"],
         "Mawal":["M1", "M2"],
         "Ambegaon":["A1", "A3"],
         "Purandhar":["P1", "P3"],
         "Bhor":["B1", "B2", "B3", "B4"],
         "Mulshi":["M1", "M2", "M3", "M4"],
         "Velhe":["V1", "V2", "V3", "V4"],
       },
    }

    window.onload = function ()
    {
      var districtSel = document.getElementById("districtSel"),
      talukaSel = document.getElementById("talukaSel"),
      villageSel = document.getElementById("villageSel");

      for (var country in stateObject)
      {
        districtSel.options[districtSel.options.length] = new Option(country, country);
      }
      districtSel.onchange = function ()
      {
        talukaSel.length = 1; // remove all options bar first
        villageSel.length = 1; // remove all options bar first
        if (this.selectedIndex < 1) return; // done
        for (var state in stateObject[this.value])
        {
          talukaSel.options[talukaSel.options.length] = new Option(state, state);
        }
      }
      districtSel.onchange(); // reset in case page is reloaded
      talukaSel.onchange = function ()
      {
        villageSel.length = 1; // remove all options bar first
        if (this.selectedIndex < 1) return; // done

        var district = stateObject[districtSel.value][this.value];
        for (var i = 0; i < district.length; i++)
        {
          villageSel.options[villageSel.options.length] = new Option(district[i], district[i]);
        }
      }
    }
    </script>
  </head>

  <body>
    <form name="registration_form"  action="RegistrationChecker.jsp" method="post">
      <table id='reg_table' align="center">

        <tr>
          <td>
             <h3 id="page_title">Registration Form</h3>
          </td>
        </tr>
        <tr>
           <td>Full Name</td>
           <td>
               <input type="text" id="username" name="username"  pattern="{a-Aa-Z}[2,]" required="">
           </td>
        </<tr>

        <tr>
           <td>Roll No.</td>
           <td>
               <input type="number" id="rollno" name="rollno" pattern="{0-9}" required="">
           </td>
        </tr>

        <tr>
           <td>D.O.B.</td>
           <td>
               <input type="date" name="dob" id="dob" required="">
           </td>
        </tr>

        <tr>
           <td>Email Address</td>
           <td>
               <input type="email" id="email" name="email" required="">
           </td>
        </tr>

        <tr>
           <td>Mobile Number</td>
           <td>
               <input type="tel" name="mobile" id="mobile" pattern="{0-9}[10]" required="">
           </td>
        </tr>

        <tr>
          <td>
            Select District: <select id="districtSel" size="1">
            <option value="" selected="selected">Select District</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>
            Select Taluka: <select id="talukaSel" size="1">
            <option value="" selected="selected">Please select District first</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>
            Select Village: <select id="villageSel" size="1">
            <option value="" selected="selected">Please select Taluka first</option>
            </select>
          </td>
        </tr>

        <tr>
           <td>Gender</td>
           <td>
                <input type="radio" name="gender" value="male" > Male <br>
                <input type="radio" name="gender" value="female"> Female <br>
                <input type="radio" name="gender" value="other"> Other <br>
           </td>
        </tr>

        <tr>
           <td>Photo</td>
           <td>
                <input type="file" name="photo">
           </td>
        </tr>

        <tr>
           <td>Signature</td>
           <td>
                <input type="file" name="sign">
           </td>
        </tr>

        <tr>
            <td>Password</td>
            <td>
                <input type="text" id="password" name="password" pattern="{a-Aa-z}[2,]" required="">

            </td>
        </tr>
        <tr>
            <td>Confirm Password</td>
            <td>
                <input type="text" id="confPass" name="confPassword" pattern="{a-Aa-z}[2,]" disabled="">
            </td>
        </tr>
        <tr>
           <td>
                  <input type="submit" value="Register" id="reg_button">
           </td>
           <td>
                  <input type="button" onclick="location.href='index.jsp'" value="Login" id="login_button">
           </td>
        </tr>

      </table>
    </form>
  </body>
</html>
