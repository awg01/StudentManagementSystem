<%-- 
    Document   : LoginChecker
    Created on : Mar 2, 2019, 3:32:00 PM
    Author     : akashgudadhe
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>

        
        <%
           String uname = request.getParameter("username").trim();
           String pass = request.getParameter("password").trim();
         try{  
           //1. Class Loading
           Class.forName("com.mysql.jdbc.Driver"); 
           
           //2. Connection URL
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akash", "root", "admin");
           
           //3. Statement Object
           //rollno is used as username
           PreparedStatement pstmt = con.prepareStatement("select uname, password from loginpage where rollno = ? and password = ? ");
           pstmt.setString(1, uname);
           pstmt.setString(2, pass);

           ResultSet rs = pstmt.executeQuery();
           if(rs.next()){
             response.sendRedirect("LoginSuccess.html");
           }else{
               response.sendRedirect("index.jsp");
           }
         }
         catch(Exception e){
             out.println(e.toString());
         }
        %>
