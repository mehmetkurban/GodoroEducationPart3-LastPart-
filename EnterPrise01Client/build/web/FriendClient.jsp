<%-- 
    Document   : FriendClient
    Created on : May 28, 2016, 2:55:24 PM
    Author     : mehmet
--%>

<%@page import="com.godoro.service.FriendService"%>
<%@page import="com.godoro.service.Friend"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            FriendService friend=new FriendService();
            Friend friend1=friend.getFriendPort();
            String sonuc=friend1.perform("Ben Mehmet");
        %>
        Sonuc <%=sonuc%>
    </body>
</html>
