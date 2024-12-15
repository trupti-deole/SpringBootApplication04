<%@page import="com.example.demo.model.Student"%>
<html>
<head>
	<title>Register Page</title>
</head>
<body>
	<% Student st=(Student)request.getAttribute("data"); %>
	<h2>
	<%=st.getRollno()%>
	<%=st.getUname() %> 
	<%=st.getPass() %>
	<%=st.getName() %>
	<%=st.getMobileno() %>
	<%=st.getEmailid() %>   
	
	</h2>
</body>
</html>


