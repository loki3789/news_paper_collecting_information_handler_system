<%-- 
    Document   : view_bought_transaction
    Created on : Nov 24, 2018, 8:57:58 PM
    Author     : lokesh
--%>
<%@ page import="com.javaclass.Database_Controller" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>view bought transaction</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container">
  <h2>Bought Transactions</h2>

  <table class="w3-table-all">
    <tr>
      <th>Id</th>
      <th>Weight</th>
      <th>Rupees</th>
      <th>Date</th>
    </tr>
    <% 
 Database_Controller db=new Database_Controller();
 ResultSet rs = db.get();
 while (rs.next()) {
    %>
    <tr>
      <td><%=rs.getInt(1)%></td>
      <td><%=rs.getString(2)%></td>
      <td><%=rs.getString(3)%></td>
      <td><%=rs.getString(4)%></td>
    </tr>
    <%}%>
  </table>
  </br>
  <a href="index.html"><h1>Click here to go Main page</h1></a>
</div>

</body>
</html>

