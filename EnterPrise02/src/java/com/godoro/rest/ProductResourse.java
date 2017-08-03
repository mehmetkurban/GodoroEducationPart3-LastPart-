
package com.godoro.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("product")
public class ProductResourse {
    
   
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml(){
        
    return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n"
            +"<product productId=\"123\">\r\n"
            +"\t<productName>Cep Telefonu</productName>\r\n"
            +"\t<salesPrice>450</salesPrice>\r\n"
            +"</product>";
    }
   
    
    @GET
    @Produces("application/json; charset=UTF-8")
    public String getJson(){
        
    return "{ \r\n"
            +"\t\"productId\":123,\r\n"
            +"\t\"productName\":\"Cep Telefonu\",\r\n"
            +"\t\"salesPrice\":450\r\n"
            +"}";
            
    }
}
