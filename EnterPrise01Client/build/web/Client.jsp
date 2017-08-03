<%-- 
    Document   : Client
    Created on : May 28, 2016, 1:45:24 PM
    Author     : mehmet
--%>

<%@page import="com.godoro.service.Hesap_0020Makinesi"%>
<%@page import="com.godoro.service.Topla"%>
<%@page import="com.godoro.service.AdderService"%>
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
            AdderService service=new AdderService();
            Hesap_0020Makinesi hesap_0020Makinesi=service.getHesap_0020MakinesiPort();
            
            int left=3;
            int right=4;
            int sum=hesap_0020Makinesi.carp(left,right);
        %>
        Toplam <%=sum%>
        
    </body>
</html>
