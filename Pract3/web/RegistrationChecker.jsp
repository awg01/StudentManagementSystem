<%-- 
    Document   : RegistrationChecker
    Created on : Mar 2, 2019, 3:32:55 PM
    Author     : akashgudadhe
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%   
   String uName, email, address, pass, confPass, gender, dob, mobileNo;
   int rollNo, result = 0;
   
   uName = request.getParameter("username").trim();
   rollNo = Integer.parseInt(request.getParameter("rollno").trim());
   email = request.getParameter("email").trim();
   mobileNo = request.getParameter("mobile").trim();
   dob = request.getParameter("dob").trim();
   gender = request.getParameter("gender").trim();
   pass = request.getParameter("password").trim();
   //confPass = request.getParameter("confPass").trim();
  
   try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akash", "root", "admin");

        PreparedStatement pstm = con.prepareStatement("insert into loginpage(uname, rollNo, email, mobile, dob, gender, password) values(?, ?, ?, ?, ?, ?, ?)");
        pstm.setString(1, uName);
        pstm.setInt(2, rollNo);
        pstm.setString(3, email);
        pstm.setString(4, mobileNo);
        pstm.setString(5, dob);
        pstm.setString(6, gender);
        pstm.setString(7, pass);

        result = pstm.executeUpdate();

        if(result == 1){
            response.sendRedirect("index.jsp");
        }else{
            response.sendRedirect("reg_page.jsp");
        }   
   }
   catch(Exception e){
       out.println(e.toString());
   }
   

%>
