package com.godoro.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class ProductGetClient {
    public static void main(String[] args) {
        Client client=ClientBuilder.newClient();
        WebTarget target=client
                .target("http://localhost:8080/EnterPrise02/invertory")
                .path("product");
        
        
    String xml=target
            .request(MediaType.APPLICATION_XML)
            .get(String.class);
        System.out.println("XML Sicimi : \r\n "+xml);
    
     String json=target
            .request(MediaType.APPLICATION_JSON)
            .get(String.class);
        System.out.println("JSON Sicimi : \r\n "+json);    
    }
    
    
}
