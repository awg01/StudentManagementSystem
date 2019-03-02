<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="styles.css">
    <title>Login Page</title>
  </head>
  <body>
      <form action="LoginChecker.jsp" method="post">  
    <table align="center" id="login_table">

      <tr>
        <td>UserName</td>
        <td>
           <input type="text" name="username" required>
        </td>
      </tr>

      <tr>
        <td>Password</td>
        <td>
           <input type="password" name="password" required>
        </td>
      </tr>

      <tr>
        <td>
            <input type="button" name="Register" onclick="location.href = 'reg_page.jsp' " value="Register">
        </td>
        <td> 
                 <input type="submit" value="Login" id="log_login_button"> 
        </td>
      </tr>
    </table>

   </form>
  </body>
</html>
