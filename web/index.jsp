<%--
  Created by IntelliJ IDEA.
  User: New User
  Date: 09.03.2020
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
    <form name="calForm" action="/WebModul1Task_war_exploded/calculate" method="post">
      <input type="number" name="numberOne" placeholder="first" size="5" step="0.1"/>
      <select name="selctOp">
        <option>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>
      </select>
      <input type="number" name="numberTwo" placeholder="second" size="5" step="0.1"/>
      <input type="submit" value="Calculate"/>
    </form>
  <div>
    <% if(session.getAttribute("result") != null) { %>
    Result: <%= session.getAttribute("result")%>
    <%}%>
  </div>
    <br>
    <div>
      <% if(session.getAttribute("history") != null) { %>
      History: <%= session.getAttribute("history")%>
      <%}%>
    </div>
  </body>
</html>
