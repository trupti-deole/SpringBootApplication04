<html>
<head>
<title>index page</title>
</head>
<body>
   <h2>You login successfully...</h2>
   <% String uname=(String)request.getAttribute("uname");
      String pwd=(String)request.getAttribute("pwd");
   %>
   
   <h2><%=uname %></h2>
   <h2><%=pwd %></h2>
      
  
</body>
</html>
