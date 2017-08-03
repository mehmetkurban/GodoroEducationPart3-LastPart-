<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://code.jquery.com/jquery-1.12.4.js">
            
        </script>
        <script>
            $(document).ready(function (){
               alert("JQuery çalışıyor")
               var url="http://localhost:8080/EnterPrise02/invertory/product";
               $.getJSON(url,function (data){
                   alert("Sonuç Geldi");
                   $.each(data,function (property,value){
                       alert(property+"="+value);
                   });
               })
            });
        </script>
        
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
