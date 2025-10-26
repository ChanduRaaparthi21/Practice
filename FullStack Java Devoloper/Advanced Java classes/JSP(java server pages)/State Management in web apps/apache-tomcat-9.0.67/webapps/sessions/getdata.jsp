<%@page import="javax.servlet.http.*"%>

User entered Data is <br/><br/>

<%
   String suname = (String) session.getAttribute("sun");
   String spassword = (String) session.getAttribute("spwd");

%>

username is = <%= suname %><br/>
password is = <%= spassword %><br/>
firstname is <%= request.getParameter("fn")%><br/>
lastname is <%= request.getParameter("ln")%><br/>