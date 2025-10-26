<%@page import="javax.servlet.http.*"%>
<html>
    <body>
        <%
        String uname = request.getParameter("un");
        String pass = request.getParameter("pwd");

        session.setAttribute("sun",uname);
        session.setAttribute("spwd",pass);
        %>



        <form action="./getdata.jsp" method="post">

           
            firstname <input type="text" name="fn"><br/>
            lastname <input type="text" name="ln"><br/>

            <button type="submit" value="submit">Submit</button>




        </form>
    </body>
</html>